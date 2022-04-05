package com.sneha.DSAFinalLinkedList;
import java.util.*;
public class SingularLL {
    Node head=null;
    private int size;

    SingularLL(){

        this.size=0;
    }
    static class Node{
        private int size = 0;
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // print add First
    public void addFirst() {
        //Node head = null;
        //String data
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the data:");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Do u want to add more data.If Yes,Press:1");
            n = sc.nextInt();
        }while(n==1);
    }
    // print add Last
    public void addLast(int data){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the data which is to be inserted:");
//        String data = sc.next();
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }

        Node currentNode=head;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next = newNode;
    }
    //print Linked List function
    public void printLL(){
        //Node head = null;
        Node currentNode=head;
        if(currentNode==null){
            System.out.println("List is empty.");
        }
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    //delete first node from the list
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        size--;
        head=head.next;
    }
    //delete last node from the list
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next;
        if(LastNode.next != null){
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){

        return size;
    }
    public static void main(String[] args) {
        SingularLL list = new SingularLL();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printLL();
//
//        list.addLast("list");
//        list.printLL();
//
//        list.addFirst("This");
//        list.printLL();
//
//        list.deleteFirst();
//        list.printLL();
//
//        list.deleteLast();
//        list.printLL();
//
//        System.out.println(list.getSize());
        list.addFirst();
        list.addFirst();
        list.printLL();
    }
}
