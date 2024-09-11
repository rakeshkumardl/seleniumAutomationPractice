package com.hackerRank.solution;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayString {

    public static void main(String[] args) throws IOException {
      List<String> ls = new ArrayList<String>();
      ls.add("Shyam");
      ls.add("Radhe");
      ls.add("Jay");
      
      Collections.sort(ls);
      String arr [] = new String[ls.size()];
      for (int i = 0; i < ls.size(); i++) {
    	  arr[i] = ls.get(i);
      }
      
      // Print the contents of Array
      System.out.println("Contents of Array:");
      for (String str : arr) {
          System.out.println(str);
      }
      System.out.println("**********Reversed array**********");
      for(int j = arr.length-1;j>=0;j--)
      {
    	  System.out.println(arr[j]);
      }
      System.out.println(java.time.LocalDate.now().getDayOfMonth());
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());
//		System.out.println(java.time.Clock.systemUTC());
//		System.out.println(java.time.LocalDate.now().getDayOfYear());
		System.out.println(java.time.LocalDate.now().
				format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
		
		System.out.println(java.time.LocalDate.now().
				format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));   
    }
}

