package com.sneha.DSAFinalLinkedList;
import java.util.*;
public class CircularLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;
    public void Insertion(){
        int data,m,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the data:");
            data=sc.nextInt();
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
                newNode.next=head;
            }
            else{
                System.out.println("Enter 1 Insert a node at the beginning 2 Insert a node at the end 3 Insert a node at the specific position 4 Exit");
                m=sc.nextInt();
                switch(m){
                    case 1:
                        newNode.next=head;
                        head=newNode;
                        tail.next=head;
                        break;
                    case 2:
                        tail.next=newNode;
                        tail=newNode;
                        newNode.next=head;
                        break;
                    case 3:
                        System.out.println("Enter the position where node is being inserted:");
                        int p = sc.nextInt();
                        Node temp = head;
                        for(int i=0;i<p-2;i++){
                            temp=temp.next;
                        }
                        newNode.next=temp.next;
                        temp.next=newNode;
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Choice");
                }
            }
            System.out.println("Do u want to add more data.If Yes,press 1");
            n=sc.nextInt();
        }while(n==1);
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
                m= sc.nextInt();
                switch (m){
                    case 1:
                        head=head.next;
                        tail.next=head;
                        break;
                    case 2:
                        Node temp=head;
                        Node ptr=temp.next;
                        while(ptr.next!=head){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=head;
                        tail=temp;
                        break;
                    case 3:
                        System.out.println("Enter the position where a node is being deleted:");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        Node ptr1 = temp1.next;
                        for(int i=0;i<p-2;i++){
                            temp1=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp1.next=ptr1.next;
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Choice.");
                }
            }
            System.out.println("Do u want to delete data.If Yes,press 2");
            n=sc.nextInt();
        }while(n==2);
    }
    public void Traverse(){
        Node currentNode = head;
        if(currentNode==null){
            System.out.println("List is empty");
        }
        else{
            do {
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }while(currentNode!=head);
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        CircularLL ss = new CircularLL();
        ss.Insertion();
        ss.delete();
        ss.Traverse();
    }

}
