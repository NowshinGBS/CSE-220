import java.lang.*;

import java.util.Scanner;

public class TesterClass {

 public static void main(String[] args) {
  MyString m = new MyString();
  MyString m1 = new MyString("HelloWorld");
//  char [] charArray = ((String) m1).toCharArray();
  String s1 = "HelloWorld";
  char [] charArray = s1.toCharArray();
  
  char [] cr={'h','e','l'};
  MyString m2 = new MyString(cr);
  MyString m3 = new MyString("hello");
  MyString m4 = new MyString("world");
  MyString m5 = new MyString("helloworld");
  MyString m6 = new MyString("H");

  
  System.out.println(m1.length());
  System.out.println(m1.charAt(1));
//  System.out.println(charArray.charAt(1));
  System.out.println(m1.startstWith(m3));
  System.out.println(s1.startsWith("tell")); 
//  System.out.println(m1.endsWith(m4));       
//  System.out.println(s1.endsWith("World"));   
//  System.out.println(m1.replaceFirst('a','b'));
//  System.out.println(m1.replaceAll('a','b'));
//  System.out.println(m1.replaceLast('a','p'));
//  System.out.println(m1.toLowerCase());
//  System.out.println(m1.toUppercase());
//  System.out.println(m1.equals(m3));
//  System.out.println(m1.equalsIgnorcase(m5)); 
//  System.out.println(m1.compareTo(m5));
//  System.out.println(s1.compareTo("HelloWorld"));
//  System.out.println(m1.compareToIgnorCase(m5));
//  System.out.println(s1.compareToIgnoreCase("Helloworld"));
//  System.out.println(m1.substring(4));
//  System.out.println(m1.substring(2,4));
//  System.out.println(m1.indexOf('o'));
//  System.out.println(m1.lastIndexOf('o'));
//  System.out.println(m1.IndexOf('0', 2));
//  System.out.println(m1.lastIndexOf('o',4));
//  System.out.println(m1.indexOf(m6));
//  System.out.println(m1.lastIndexOf(m6));
//  System.out.println(m1.concat(m3));
//  System.out.println(m1.concat(cr));
//  System.out.println(s1.concat("____HelloWorld"));
  
 }
}
 