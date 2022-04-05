package com.sneha.DSAFinalLinkedList;
import java.util.*;
public class SinglyLLAnotherprocess {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void Creation(){
        Scanner sc = new Scanner(System.in);
        int data,n;
        do{
            System.out.println("Enter the data:");
            data=sc.nextInt();
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
            System.out.println("Do you want to add more data.If Yes,press 1");
            n=sc.nextInt();
        }while(n==1);
    }
    public void ReverseLL(){
        Node prevNode=null;
        Node currentNode=head;
        while(currentNode!=null){
            Node temp=currentNode.next;
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=temp;
        }
        //head.next=null;
        head=prevNode;
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
            }
            else{
                System.out.println("\n 1 Insert a node at the beginning \n 2 Insert at the end \n 3 Insert a node at the specific position \n 4 Exit");
                m=sc.nextInt();
                switch (m){
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        break;
                    case 2:
                        Node currentNode = head;
                        while(currentNode.next!=null){
                            currentNode = currentNode.next;
                        }
                        currentNode.next = newNode;
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
                        System.out.println("Wrong Choice.");
                }
            }
            System.out.println("Do u want to add more data.If Yes,press 2");
            n=sc.nextInt();
        }while (n==2);
    }
    public void delete(){
        Scanner sc = new Scanner(System.in);
        int n,m;
        do{
            if(head==null){
                System.out.println("List is empty");
            }
            else{
                System.out.println("1 Delete a node from the beginning \n 2 Delete a node at the end \n 3 Delete a node from the specific position 4 Exit");
                m=sc.nextInt();
                switch(m){
                    case 1:
                        head=head.next;
                        break;
                    case 2:
                        Node secondLast=head;
                        Node last=head.next;
                        while(last.next!=null){
                            secondLast=secondLast.next;
                            last=last.next;
                        }
                        secondLast.next=null;
                        break;
                    case 3:
                        System.out.println("Enter the position where a node is being deleted:");
                        int p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for(int i=0;i<p-2;i++){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=ptr.next;
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Choice.");
                }
            }
            System.out.println("Do u want to delete data.If Yes,press 3");
            n= sc.nextInt();
        }while(n==3);

    }
    public void Traverse(){
        Node currentNode = head;
        if(currentNode==null){
            System.out.println("List is empty");
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        SinglyLLAnotherprocess ss = new SinglyLLAnotherprocess();
        //ss.Insertion();
        //ss.delete();
        //ss.Traverse();
        ss.Creation();
        ss.Traverse();
        ss.ReverseLL();
        ss.Traverse();
    }

}
