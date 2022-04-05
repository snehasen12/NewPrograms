package com.sneha.DSAFinalLinkedList;
import java.util.*;
public class DoublyLL {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void Creation(){
        Scanner sc =new Scanner(System.in);
        int data,n;
        do{
            System.out.println("Enter the data:");
            data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                head.prev=newNode;
                newNode.next=head;
                head=newNode;
            }
            System.out.println("Do u want to add more data.If Yes,press 1");
            n= sc.nextInt();
        }while(n==1);
    }
    public void Insertion(){
        Scanner sc = new Scanner(System.in);
        int data,n,m;
        do{
            System.out.println("Enter the data:");
            data=sc.nextInt();
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                System.out.println("1 Insert a node from the beginning \n 2 Insert a node at the end \n 3 Insert a node at the specific position \n 4 Exit");
                m=sc.nextInt();
                switch (m){
                    case 1:
                        head.prev=newNode;
                        newNode.next=head;
                        head=newNode;
                        break;
                    case 2:
                        tail.next=newNode;
                        newNode.prev=tail;
                        tail=newNode;
                        break;
                    case 3:
                        System.out.println("Enter the position where a node is being inserted:");
                        int p = sc.nextInt();
                        Node temp=head;
                        Node ptr=temp.next;
                        for(int i=0;i<p-2;i++){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=newNode;
                        newNode.prev=temp;
                        newNode.next=ptr;
                        ptr.prev=newNode;
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Choice.");
                }
            }
            System.out.println("Do u want to add more data.If Yes,press 2");
            n=sc.nextInt();
        }while(n==2);
    }
    public void delete(){
        Scanner sc = new Scanner(System.in);
        int n,m;
        do{
            if(head==null){
                System.out.println("List is Empty.");
            }
            else{
                System.out.println("1 Delete a node from the beginning \n 2 Delete a node at the end \n 3 Delete a node from the specific position 4 Exit");
                m=sc.nextInt();
                switch (m){
                    case 1:
                        Node temp1=head;
                        temp1=temp1.next;
                        head=temp1;
                        temp1.prev=null;
                        break;
                    case 2:
                        Node temp=head;
                        Node ptr=temp.next;
                        while(ptr.next!=null){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=null;
                        tail=temp;
                        break;
                    case 3:
                        System.out.println("Enter the position where a node is being deleted:");
                        int p = sc.nextInt();
                        Node temp2= head;
                        Node ptr1=temp2.next;
                        for (int i=0;i<p-2;i++){
                            temp2=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp2.next=ptr1.next;
                        ptr1.next.prev=temp2;
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Choice.");
                }
            }
            System.out.println("Do u want to delete data.If Yes,press 3");
            n=sc.nextInt();
        }while(n==3);
    }
    public void Traversal(){
        Node temp=head;
        if(head==null){
            System.out.println("List does not exist.");

        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String[] args) {
        DoublyLL ss = new DoublyLL();
        //ss.Creation();
        ss.Insertion();
        ss.delete();
        ss.Traversal();
    }
}
