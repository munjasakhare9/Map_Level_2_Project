package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {
    	Map<String, Set<String>> m=new HashMap<>();
    	
    	//Q & Ans 1
    	
    	String q1="What is java ?";
    	Set<String> aq1=new HashSet<>();
    	aq1.add("java is a virtual machine");
    	aq1.add("java is a programmong language");
    	aq1.add("java is a device");
    	aq1.add("java is a softare");
    	m.put(q1,aq1);
    	
    	//Q & Ans 2
    	String q2="Encapsulation can be used...";
    	Set<String> aq2=new LinkedHashSet<>();
    	aq2.add("hide data");
    	aq2.add("binding data into single unit");
    	aq2.add("both A & B");
    	aq2.add("none of above");
    	m.put(q2, aq2);
    	
    	//Q & Ans 3
    	String q3="Which of the following is not a feature of Java?";
    	Set<String> aq3=new HashSet<>();
    	aq3.add("Object-Oriented");
    	aq3.add("Platform Independent");
    	aq3.add("Pointer-based");
    	aq3.add("Robust");
    	m.put(q3, aq3);
    	
    	//Q & Ans 4
    	String q4="What is the default value of an int instance variable in Java?";
    	Set<String> aq4=new HashSet<>();
    	aq4.add("null");
    	aq4.add("0");
    	aq4.add("1");
    	aq4.add("Garbage Value");
    	m.put(q4, aq4);
    	
    	//Q & Ans 5
    	String q5="Which keyword is used to inherit a class in Java?";
    	Set<String> aq5=new HashSet<>();
    	aq5.add("implements");
    	aq5.add("extends");
    	aq5.add("inherits");
    	aq5.add("super");
    	m.put(q5, aq5);
    	
    	//Q & Ans 6
    	String q6="Which interface is used to define the natural ordering of objects?";
    	Set<String> aq6=new HashSet<>();
    	aq6.add("Comparator");
    	aq6.add("Comparable");
    	aq6.add("Collection");
    	aq6.add("Iterable");
    	m.put(q6, aq6);
    	
    	//Q & Ans 7
    	String q7="What will be the output?";
    	Set<String> aq7=new HashSet<>();
    	aq7.add("true");
    	aq7.add("false");
    	aq7.add("Compilation error");
    	aq7.add("Runtime error");
    	m.put(q7, aq7);
    	
    	//Q & Ans 8
    	String q8="Which collection does not allow duplicate elements?";
    	Set<String> aq8=new HashSet<>();
    	aq8.add("ArrayList");
    	aq8.add("LinkedList");
    	aq8.add("HashSet");
    	aq8.add("Vector");
    	m.put(q8, aq8);
    	
    	//Q & Ans 9
    	String q9="What is the default capacity of an ArrayList when it is created using:";
    	Set<String> aq9=new HashSet<>();
    	aq9.add("0");
    	aq9.add("10");
    	aq9.add("5");
    	aq9.add("16");
    	m.put(q9, aq9);
    	
    	//Q & Ans 10
    	String q10="Which exception occurs when an array index is outside its valid range?";
    	Set<String> aq10=new HashSet<>();
    	aq10.add("NullPointerException");
    	aq10.add("ArrayIndexOutOfBoundsException");
    	aq10.add("IndexException");
    	aq10.add("IllegalArgumentException");
    	m.put(q10, aq10);
    	
    	//System.out.println(m);
    	
    	Set<String> qKeySet=m.keySet();
    	int qno=0;
    	for(String qKey:qKeySet) {
    		System.out.println("Q-"+ ++qno+") "+qKey);
    		Set<String> ans=m.get(qKey);
    		char c='A';
    		for(String a:ans) {
    			System.out.println("\t"+c+++") "+a);
    		}
    		System.out.println("-----------------------------------------------------------");
    	}
    }
}
