    import java.util.*;
    public class DLL {
    class Node{
    public int data ;
    public Node nextNode;
    public Node prevNode;
    public Node(int data){
    this.data =data;
    }
    }
    Node headNode,tailNode=null;
    //ADDING NODE TO LINKEDLIST
    public void addDLLNode(int data){  
    Node newDLLNode=new Node(data);
    if(headNode==null){
    headNode=tailNode=newDLLNode;
    headNode.prevNode=null;
    tailNode.nextNode=null;
    }
    else{ 
    tailNode.nextNode=newDLLNode;
    newDLLNode.prevNode=tailNode;
    tailNode=newDLLNode;
    tailNode.nextNode=null;
    }
    }
    public void displayNode(){
    Node currentNode=headNode;
    if(headNode==null) {
    System.out.println("Linked List empty");
    return;}
    System.out.println("NODES IN THE LINKED LIST");
    System.out.println("-------------------------");
    while(currentNode!=null)
    {
    System.out.print(currentNode.data+" ");
    currentNode=currentNode.nextNode;  
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=5;
        DLL LinkedList =new DLL();
         while(c>0)
        {
        System.out.println("MENU");
        System.out.println("1:Add new node from rear ");
        System.out.println("2:delete a node ");
        System.out.println("3:Display the linked list");
        System.out.println("4:Exit");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
       
        switch(ch)
        {
            case 1:
            {
                int item=sc.nextInt();
                LinkedList.addDLLNode(item);
                break;
            }
            case 2:
            {
                int item=sc.nextInt();
                LinkedList.addDLLNode(item);
                break;
            }
            case 3:
            {
                 LinkedList.displayNode();
                 break;
            }
           case 4:
           {
            System.exit(0);
              break;
           }
            default:
            {   System.out.println("Wrong input");
                    break;

            }
            }
        }
         }
        }
     

        



 
   
   

   
   
      
     

  
 










 