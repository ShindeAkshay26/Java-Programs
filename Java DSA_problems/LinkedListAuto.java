package com.Q_preap;
import java.util.*;
public class LinkedListAuto
{
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<String>();

        //adding first
        list.addFirst("is");
        list.addFirst("This");

        //addlast  it working by default by func add --it add element at last
        list.addLast("the");
        System.out.println(list);
        int s=list.size();
        System.out.println(s);

        //iterating the list
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"-->");
        }

        //removing first or last
        list.removeLast();
        list.removeFirst();
        System.out.println();
        System.out.println(list);
    }
}
