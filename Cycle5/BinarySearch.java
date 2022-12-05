
 import java.util.*;
class BinarySearch{  
    public  void binarySearch(int arr[], int first, int last, int key,int b[],int size){  
    
      int mid = (first + last)/2;  
      while( first <= last ){  
         if ( arr[mid] < key ){  
           first = mid + 1;     
         }
         else if ( arr[mid] == key )
         {  
           System.out.println("Element is found at index " + mid+ " in sorted array");  
           findIndex(arr[mid],b,size);
           break;  
         }else{  
            last = mid - 1;  
         }  
         mid = (first + last)/2;  
      }  
      if ( first > last ){  
         System.out.println("Element is not found!");  
      }  
    }  

   public void findIndex(int item,int b[],int n)
   {
   for(int i=0;i<n;i++)
   {
   if(b[i]==item)
   System.out.println("Element is found at index " + i+" in original array");  
   
   }
   
   }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public  int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
   
            if (arr[j] < pivot) {
                 i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public   void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    } 
    void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
  

    public static void main(String args[])
    {  
           int a[]=new int[10];
               int b[]=new int[10];
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the size of the array ");
           int n=sc.nextInt();
           System.out.println("Enter the array elements ");
           for(int i=0;i<n;i++)
           {
            a[i]=sc.nextInt();
          b[i]=a[i];
           }
           System.out.println("the original array is ");
           for(int i=0;i<n;i++){
                System.out.print(a[i]+"  ");
           
           }
            
           
           
           System.out.println("Enter the element to be searched ");
           int item=sc.nextInt();
            
          BinarySearch B =new BinarySearch();
           B.quickSort(a, 0, n-1);
           B.printArray(a, n);
          B.binarySearch(a,0, n, item,b,n);
           
               }  
   }  
