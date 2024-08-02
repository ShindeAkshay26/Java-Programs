package com.Q_preap;


import java.sql.SQLOutput;

public class LL {
    public static void main(String[] args) {
        javaLL list = new javaLL();

        list.insertAtFirst(12);
        list.insertAtFirst(15);
        list.insertAtFirst(20);
        list.insertAtFirst(9);

        list.insertAtLast(33);
        list.insert(19,3);

        list.display();
        /*System.out.println();
        list.deleteAtFirst();
        list.deleteAtLast();

        list.display();*/
        System.out.println();
        list.deleteAt(2);

        list.display();

    }
}

class javaLL {
    private Node head;
    private Node tail;
    private int size;

    public javaLL() {
        this.size = 0;
    }

    //inserting at first in LL
    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size = size + 1;
    }

    //insert At last of hte list
    public void insertAtLast(int value) {
        if (tail == null) {
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size = size + 1;

    }
    //inser at the particular index
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertAtFirst(val);
            return;
        }
        if(index==size)
        {
            insertAtLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteAtFirst()
    {
        int val=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;
    }

    //delete at last
    public int deleteAtLast()
    {
        if(size<=1)
        {
            return deleteAtFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;

        return val;
    }

    public int deleteAt(int index)
    {
        if(index==0)
        {
            return deleteAtFirst();
        }
        if(index==size-1)
        {
            return deleteAtLast();
        }
        Node node=head;
        for(int i=1;i<index;i++)
        {
            node=node.next;
        }
        int val=node.next.value;
        Node temp=node.next;
        node.next=temp.next;

        return val;
    }

    // finding  a particular  element
    public Node find(int value)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //to get a particualar item
    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }

    //Display the  LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "--->");
            temp = temp.next;
        }
        System.out.print("Null");
    }


    private class Node {                           /*for a single node so the type of class is node in which a singly linkedlist node have
                       a its own value andthe its points to its next  so the next variable which directing a next node so its node type */
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
