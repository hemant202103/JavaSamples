package com.learning.stringexamples;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("He");
     // mutable and not synchronised
        sb.append("mant");
        System.out.println(sb);
    }
}
