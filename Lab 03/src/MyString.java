
import java.lang.*;

import java.util.Scanner;

public class MyString {
    
    char [] charArray;
// char [] otherArray;
    
    public MyString(){ 
    
    }
    public String toString(){
     String str = "";
     for(int i=0; i<charArray.length; i++){
      str = str + charArray[i];
     }
     return str;
    }
    public MyString(char [] charSeq){
        charArray = new char[charSeq.length];
        int i;
        for(i=0; i<charSeq.length; i++){
            charArray[i] = charSeq[i];  
        } 
    }
    
    
    public MyString(String str){
        charArray = str.toCharArray();
    }
    
    
    public int length(){ 
        return charArray.length;
    }
    
    
    public char charAt(int n){
        if(n<charArray.length && n>=0){
            return charArray[n];
        }else{
         return '\0';
        }
//        return (Character) null;
        
    }
    
    
    
    public boolean startstWith(MyString prefix){
        boolean answer = true;
        int i;
        for(i=0; i<prefix.charArray.length; i++){
            if (prefix.charArray[i]!=this.charArray[i]) {
                answer = false;
                break;
            }
        }
        return answer;
    }
    
    
    public boolean startsWith(String prefix){
        MyString ms = new MyString(prefix);
        boolean answer = startstWith(ms);
        for(int i=0; i<ms.charArray.length; i++){
            if(ms.charAt(i)!=charArray[i]){
                answer = false;
                break;
            } 
        }
        return answer; 
    }
    
    
    public boolean endsWith(MyString suffix) {
        boolean answer = true;
        int i;
        int j=charArray.length-1;
//   System.out.println(charArray);
        for( i=suffix.charArray.length-1; i>=0; i--){
            if(suffix.charArray[i]!=this.charArray[j]){
                j--;
                answer = false;
                break;
            }
        }
        return answer;
    }
    
    
    public boolean endsWith(String suffix){
        char [] otherArray = suffix.toCharArray();
        boolean answer = true;
        int j= charArray.length-1;
        for(int i=otherArray.length-1; i>=0; i--){
            if(otherArray[i]!=charArray[j]){
                j--;
                answer = false;
                break;
            } 
        }
        return answer;
        
    }
    
    public MyString replaceFirst(char oldChar, char newChar) {
//     char [] charArray = new char[charArray.length];
//     charArray = charArray;
        int i;
        for(i=0; i<charArray.length; i++){
         if(charArray[i]==oldChar){
         charArray[i] = newChar;
//         or;
//         We can Use ""this.charArray"" instead of ""charArray"";
          break;
         }
        }
        return new MyString(charArray);
//        or;
//        return new MyString(this.charArray);
       }
    
    
    public MyString replaceAll(char oldChar, char newChar) {
  int i;
    for(i=0; i<charArray.length; i++){
     if(charArray[i]==oldChar){
     charArray[i] = newChar;
     }
    }
    return new MyString(charArray);
 }
    
    
    public MyString replaceLast(char oldChar, char newChar) {
   int i;
    for(i=charArray.length-1; i>=0; i--){
     if(charArray[i]==oldChar){
     charArray[i] = newChar;
      break;
     }
    }
    return new MyString(charArray);
 }  
    
    
    public MyString toLowerCase() {
        char [] otherArray = new char[charArray.length];
        for(int i=0; i<charArray.length; i++){
            for(int j=97; j<=122; j++){
                if(charArray[i]==j ){
                    otherArray[i]=charArray[i];
                    break;
                }else if( charArray[i]==j-32){
                    otherArray[i] =(char) (charArray[i]+32);
                }
            } 
        }
        MyString a = new MyString(otherArray);
        return a;
    }
    
    
 public MyString toUppercase() {
  char [] otherArray = new char[charArray.length];
        for(int i=0; i<charArray.length; i++){
            for(int j=65; j<=91; j++){
                if(charArray[i]==j ){
                    otherArray[i]=charArray[i];
                    break;
                }else if( charArray[i]==j+32){
                    otherArray[i] =(char) (charArray[i]-32);// (char) why?
                }
            } 
        }
        MyString a = new MyString(otherArray);
        return a;
 }
 
 
 public boolean equals(MyString str){
  boolean answer = true;
  for(int i=0; i<charArray.length; i++){
   if(str.charArray[i] != charArray[i]){
    answer = false;
    break;
   }
  }
  return answer;
 }
 
 
 public boolean equalsIgnorcase(MyString rightString) {
  boolean answer = true;
  for(int i=0; i<charArray.length; i++){
   if(rightString.charArray[i] != charArray[i] || rightString.charArray[i]!= (int) (charArray[i]+32)){
    answer = false;
    break;
   }
 }
  return answer;
 }
 
 
 public int compareTo(MyString str) {
  int result = 0;
  for (int i = 0; i < charArray.length; i++ ) {
            if (charArray[i] != str.charAt(i)) {
                result = (int) charArray[i] - (int) str.charAt(i);
            }  
  }
  return result;
 }
 
 
 public int compareTo(String str) {
  int result = 0;
  for (int i = 0; i < charArray.length; i++ ) {
            if (charArray[i] != str.charAt(i)) {
                result = (int) charArray[i] - (int) str.charAt(i);
            }  
  }
  return result;
 }
 
 
 public int compareToIgnorCase(MyString str) {
  int result = 0;
  for (int i = 0; i < charArray.length; i++ ){
   if (charArray[i] != str.charAt(i) || str.charAt(i)!= (int) (charArray[i]+32)) {
                result = (int) charArray[i] - (int) str.charAt(i);
            }  
  }
  return result;
 }
 
 
 public int compareToIgnorCase(String str){
  int result = 0;
  for (int i = 0; i < charArray.length; i++ ){
   if (charArray[i] != str.charAt(i) || str.charAt(i)!= (int) (charArray[i]+32)) {
                result = (int) charArray[i] - (int) str.charAt(i);
            }
  }
  return result; 
 }
 
 
 public MyString substring(int start) {
  String str = "";
  for(int i=start; i<charArray.length; i++){
   str =  str + charArray[i];
   
  }
  MyString a =  new MyString(str);
  return a;
 }
 
 
 public MyString substring(int start, int end) {
  String str = "";
  for(int i=start; i<=end; i++){
   str =  str + charArray[i];
   
  }
  MyString a =  new MyString(str);
  return a;
 }
 
 
 public int indexOf(char ch) {
  int result = -1;
  for(int i=0; i<charArray.length; i++){
   if(charArray[i] == ch){
    result = i;
    break;
   }
   
  }
  return result;
 }
 
 
 public int lastIndexOf(char ch) {
  int result = -1;
  for(int i=charArray.length-1; i>=0; i--){
   if(charArray[i] == ch){
    result = i;
    break;
   }
  }
  return result;
 }
 
 
 public int IndexOf(char ch, int start) {
  int result = -1;
  for(int i=start; i<charArray.length; i++){
   if(charArray[i] == ch){
    result = i;
    break;
   }
  }
  return result;
 }
 
 
 public int lastIndexOf(char ch, int start) {
  int result = -1;
  for(int i=0; i<=charArray.length-1; i++)
  if( charArray[i] == ch){
   result = i;
   break;
  }
  return result;
 }
 
 
 public int indexOf(MyString str) {
  int result =-1;
  for(int i=0; i<charArray.length; i++){
   if(charArray[i]==str.charArray[0]){
    result = i;
    break;
   }
  }
  return result;
 }
 
 
 public int lastIndexOf(MyString str) {

  int result = -1;
  for(int i=0; i<=charArray.length; i++)
  if(charArray[i] == str.charArray[0]){
   result = i;
   break;
  }
  return result;
 }
 
 
 public MyString concat(MyString str) {
  String c1 = "";
  String c2 = "";
  for(int i=0 ; i<charArray.length; i++){
   c1 = c1 + charArray[i];
  }
  for(int j=0; j<str.length(); j++){
   c2 = c2 + str.charAt(j);
  }
  String s = c1 + c2;
  MyString m = new MyString(s);
  return m;
 }
 
 
 public MyString concat(char[] charSeq) {
  String c1 = "";
  String c2 = "";
  char [] temp = new char[charSeq.length+ charArray.length];
  for(int i=0; i<charArray.length; i++){
   c1 = c1 + charArray[i];
  }
  for(int j=0; j<charSeq.length; j++){
   c2 = c2 + charSeq[j];
  }
  String s = c1 + c2;
  MyString m = new MyString(s);
  return m;
 }
 
 
 public MyString concat(String str) {
  String c1 = "";
  String c2 = "";
  for(int i=0; i<charArray.length; i++){
   c1 = c1 + charArray[i];
  }
  for(int j=0; j<str.length(); j++){
   c2 = c2 + str.charAt(j);
  }
  String s = c1 + c2;
  MyString m = new MyString(s);
  return m;
 }  
}


