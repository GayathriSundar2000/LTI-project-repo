package com.lti.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creation the object

        // we can type safe our collection using the generics <>

        List<String> al = new ArrayList<String>();
        System.out.println("size of collection : " + al.size());

        al.add("Aryan");
        al.add("Deepankar");
        al.add("Pathan");
        al.add("33");
        al.add("Aman");

        System.out.println("size of collection : " + al.size());

        // delete the value
        // we can delete the object by index or by value

        // removing Aman

        al.remove(1);
        System.out.println("size of collection : " + al.size());

        System.out.println("Detail of collection : " + al);

        // list of collection Iteration

        // Iterate the collection or list uisng for in ways 

           // Iterable interface 

     // Iterator is interface which is using to iterate the Collection

     Iterator<String> i=al.iterator();

     while(i.hasNext()){

         String test=i.next();
         System.out.println("details of collection------>" +test);
   }


     // Another way to iterate the collection using for loop 

  // Loop through elements.
        for (String value : al) {

            System.out.println("Element: " + value);
        }

	}

}
