package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

import java.util.*;  
public class LambdaExpressionExample6{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("anu");  
        list.add("devi");  
        list.add("divya");  
        list.add("sri");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  