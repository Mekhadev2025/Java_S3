import java.util.*;
class BinarySearch{  
    public  void binarySearch(int arr[], int first, int last, int key){  
      int mid = (first + last)/2;  
      while( first <= last ){  
         if ( arr[mid] < key ){  
           first = mid + 1;     
         }
         else if ( arr[mid] == key )
         {  
           System.out.println("Element is found at index: " + mid);  
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
    public static void main(String args[])
    {  
           int a[]=new int[10];
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the size of the array ");
           int n=sc.nextInt();
           System.out.println("Enter the array elements ");
           for(int i=0;i<n;i++)
           {
            a[i]=sc.nextInt();
           }
           System.out.println("Enter the element to be searched ");
           int item=sc.nextInt();
            
          BinarySearch B =new BinarySearch();
          B.binarySearch(a,0, n, item);
           
               }  
   }  