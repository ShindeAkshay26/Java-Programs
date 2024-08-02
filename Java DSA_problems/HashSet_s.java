package com.Q_preap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_s
{
    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();

        //inserting elements
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(1);

        System.out.println(set);
        //searching using the contain func
       /* if(set.contains(1))
        {
            System.out.println("Num is avaliable");
        }
        if(!set.contains(9))
        {
            System.out.println("Num dose not contain");
        }*/

        //delete the ele

       /* set.remove(1);*/

       /* System.out.println(set.size());
        System.out.println(set);

        //iterator
        Iterator it=set.iterator();
        //hasNext  and next
        while (it.hasNext())
        {
            System.out.println(it.next());
        }*/

    }
}
