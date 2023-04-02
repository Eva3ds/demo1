package com.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

    public static void main(String[] args) {

        int a1= 1;
        int a2= 2;
        int a3= 3;
        User a4= new User(4,"sandy4","java1");
        User a5= new User(5,"sandy5","java2");
        User a6= new User(6,"sandy6","java3");


        ArrayList alist =new ArrayList();

        alist.add(a1);
        alist.add(a2);
        alist.add(a3);
        alist.add(a4);
        alist.add(a5);
        alist.add(a6);

        System.out.println(alist.size());

        System.out.println(alist.get(0));

        for (Object o : alist) {
            System.out.println("o = " + o);
        }

        System.out.println("------------------------------------");

        alist.remove(0);
        alist.remove((User)a5);

        Iterator it= alist.iterator();
        while (it.hasNext()){
            Object object =it.next();
            System.out.println("object = " + object);
        }


//        System.out.println("------------------------------------");
//
//        System.out.println(alist.contains(a6));
//
//        alist.clear();
//
//        System.out.println(alist.isEmpty());
//
//        System.out.println("------------------------------------");
//        Object[] objects = alist.toArray();
//        for(int i=0;i<objects.length;i++){
//            System.out.println(objects[i]);
//        }

    }



}
