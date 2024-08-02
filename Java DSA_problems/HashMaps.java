package com.Q_preap;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps
{
    public static void main(String[] args)
    {
        HashMap<String ,Integer> map=new HashMap<>();

        //insertion opertaion

        map.put("India",120);
        map.put("China",150);
        map.put("US",70);

        System.out.println(map);

        //update
        //if exist it update the value and if dosent exist then it create a key value pair element
        map.put("China",170);
        System.out.println(map);

        //searching the element
        if(map.containsKey("Indi"))
        {
            System.out.println("its value is "+map.get("India")); //getting the value by key ==map.get("India")
        }
        else {
            System.out.println("not present");
        }

        //getting value by key
        map.get("India");
        map.get("Indonasia");

//        iterator on hashMap --here we use special loop
        int array[]={10,23,45};

        //by reguler array
      /*
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

        //by special array
        for(int val:array)
        {
            System.out.println(val +" ");
        }
        System.out.println();*/
//

        //loop for hashMap
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey()+" " +e.getValue());
        }

        //using throught the key
        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key + " "+map.get(key) );
        }

        //remove the key
        map.remove("China");
        System.out.println(map);

    }

}
