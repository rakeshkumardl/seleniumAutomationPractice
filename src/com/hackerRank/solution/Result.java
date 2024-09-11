package com.hackerRank.solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {

    public static void main(String[] args) throws IOException {
      List<Integer> ls = new ArrayList<Integer>();
      ls.add(7);
      ls.add(5);
      ls.add(9);
      ls.add(2);
      Collections.sort(ls);
      int arr [] = new int[ls.size()];
      for (int i = 0; i < ls.size(); i++) {
    	  arr[i] = ls.get(i);
      }
      
      // Print the contents of Array
      System.out.println("Contents of Array:");
      for (int num : arr) {
    	  
          System.out.println(num);
          
      }
      
      System.out.println("Reversed array");
      for(int j = arr.length-1;j>=0;j--)
      {
    	  System.out.println(arr[j]);
      }
         
    }
}

