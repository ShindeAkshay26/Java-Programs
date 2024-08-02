package com.Q_preap;

public class LinkedLists
{
    Node head;
    private int size;
    LinkedLists()
    {
        this.size=0;
    }
    class Node
    {
        String data;
        Node next;


        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add first element
    public void addFirst(String data)
    {

        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }

            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "--> ");
                currNode = currNode.next;
            }
            System.out.print("null");

    }

    //delete first
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return ;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
            return ;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return ;
        }
        Node SecondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null)
        {
            lastNode=lastNode.next;
            SecondLast=SecondLast.next;
        }
        SecondLast.next=null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.addFirst("a");
        ll.addFirst("is ");

        ll.addLast("List");
        ll.addLast("now");

        ll.addFirst("This");
        ll.printList();

        ll.deleteFirst();
        ll.deleteLast();

        System.out.println();
        ll.printList();

        System.out.println( "\n"+ll.getSize());
    }
}
