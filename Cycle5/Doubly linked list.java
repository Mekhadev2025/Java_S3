import java.io.*;
import java.util.Scanner;

public class DoublyLinkedList{
	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void addNodeStart(int data){	
		Node newNode = new Node(data);	
		if(head == null){
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		
		else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			head.prev = null;
		}
	}
	
	public void addNodeEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void addNodeAfter(int data, int nodeValue){
		Node newNode = new Node(data);
		if(head == null){
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		
		else{
			Node current = head;
			while(current != null){
				if(current.data == nodeValue){
					Node temp = current.next;
					current.next = newNode;
					newNode.next = temp;
					temp.prev = newNode;
					newNode.prev = current;
					break;
				}
				current = current.next;
			}
		}
	}
	
	public void deleteStart(){
		if(head == null){
			System.out.println("List Empty");
		}
		
		else{
			head = head.next;
			head.prev = null;
		}
	}
	
	public void deleteEnd(){
		if(head == null){
			System.out.println("List Empty");
		}
		
		else{
			tail = tail.prev;
			tail.next = null;
		}
	}
	
	public void deleteElement(int nodeValue){
		Node current = head;
		while(current != null){
			if(current.data == nodeValue){
				Node temp1 = current.next;
				Node temp2 = current.prev;
				temp1.prev = temp2;
				temp2.next = temp1;
				break;
			}
			current = current.next;
		}
	}
		
		//Display Doubly linked list
		public void display(){
			Node current = head;
			if(head == null){
				System.out.println("List empty");
			}
			
			else{
				System.out.println("Nodes of the doubly linked list are : ");
				while(current != null){
					System.out.println(current.data);
					current = current.next;
				}
				System.out.println();
			}
		}
		
		public static void main(String args[]){
			DoublyLinkedList newList = new DoublyLinkedList();
			boolean val = true;
			while(val){
				int choice;
				System.out.println("Choose from the following : ");
				System.out.println("1. Insert element at start");
				System.out.println("2. Insert element at end");
				System.out.println("3. Insert element after a given element");
				System.out.println("4. Delete element from start");
				System.out.println("5. Delete element from end");
				System.out.println("6. Delete a given element");
				System.out.println("7. Display the doubly linked list");
				System.out.println("Enter your choice : ");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
			
				switch(choice){
					case 1:{
						System.out.println("Enter data in new node : ");
						int value = sc.nextInt();
						newList.addNodeStart(value);
						break;
					}
				
					case 2:{
						System.out.println("Enter data in new node : ");
						int value = sc.nextInt();
						newList.addNodeEnd(value);
						break;
					}
				
					case 3:{
						System.out.println("Enter data in new node : ");
						int value = sc.nextInt();
						System.out.println("Enter the value after which new node is to be added : ");
						int nextval = sc.nextInt();
						newList.addNodeAfter(value, nextval);
						break;
					}
				
					case 4:{
						newList.deleteStart();
						break;
					}
				
					case 5:{
						newList.deleteEnd();
						break;
					}
				
					case 6:{
						System.out.println("Enter element to be deleted : ");
						int value = sc.nextInt();
						newList.deleteElement(value);
						break;
					}
				
					case 7:{
						newList.display();
						break;
					}	
					default:{
					System.out.println("Invalid choice");
					val = false;
					}	
				}
			}
		}
	}
