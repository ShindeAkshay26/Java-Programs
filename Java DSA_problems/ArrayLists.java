package com.Q_preap;
import java.util.ArrayList;

import java.util.Collections;


public class ArrayLists
{
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<Integer>(); //for integer obj
        /*
        ArrayList<String> list2=new ArrayList<String>();//for string obj
        ArrayList<Boolean> list3=new ArrayList<Boolean>();//for boolean obj
        ArrayList<Float> list4=new ArrayList<Float>();//for float obj
        */

        //add elements in arraylist
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        // getting element or accessing element
        int element= list1.get(2);
        System.out.println(element);

        //adding in between the element  in arraylist

        list1.add(1,3);
        System.out.println(list1);

        // set element to thst particular index
        list1.set(0,5);
        System.out.println(list1);

        //delete the particilar element by giving the index to remove function
        list1.remove(3);
        System.out.println(list1);

        //getting the length or the size of arraylist

        int size=list1.size();
        System.out.println(size);

        //applying loops on arraylist

        for(int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i)+ " ");
        }

        //sorting

        Collections.sort(list1);
        System.out.println(list1);
    }
}
