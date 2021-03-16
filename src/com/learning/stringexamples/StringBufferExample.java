package com.learning.stringexamples;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer("He");
        //mutable and synchronised methods i.e thread safe
        bf.append("mant");
        System.out.println(bf);
    }
}
