package com.learning.stringexamples;

public class StringExample {
    public static void main(String[] args) {
        //String demo -1
        String a = "He";
        String b = a.concat("mant");  //a still referencing to "He" created in string pool.
        //value is cached in pool
//        String b = new StringBuilder(a).append("mant").toString();   ---internal conversion
        System.out.println(a);
        System.out.println(b);  // b referencing to string literal "Hemant" created in string pool
        System.out.println(b.equals(a));

        //String demo -2
        a = a + "mant";  // a is referencing to "Hemant" literal present in string pool. "He" is available for gc
        System.out.println(a);
        System.out.println(a.equals(b));  // a and b pointing to same object in string pool.

//        String demo -3
        String c = new String("Hemant");  // with new keyword string is created in Heap
        System.out.println(a.equals(c));

    }
}
