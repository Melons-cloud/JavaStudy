package com.hjl.JavaBasic;

import java.util.*;


public class ArrayListTraversal<S> {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        for (String string :list){

            System.out.println(string);
        }
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i=0;i<strArray.length;i++){

            System.out.println(strArray[i]);
        }
        Iterator<String> iterator =list.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
