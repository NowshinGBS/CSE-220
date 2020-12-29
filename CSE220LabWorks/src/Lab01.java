/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package lab01;

/**
 *
 * @author 13301027
 */
public class Lab01 {

    /**
     * @param args the command line arguments
   */
    public static void main(String[] args) {
        int [] a = {10, 20, 30, 40, 50, 60};
        
        System.out.println("\n///// TEST 01: Copy Array example /////");
        int [] b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }  
        
        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
        
        
        System.out.println("\n///// TEST 03: Reverse Array example /////");
        reverseArray(b);
        printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
        
        System.out.println("\n///// TEST 04: Resize Array example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b = resizeArray(b);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60, 0, 0, 0, 0, 0 } 
        
        System.out.println("\n///// TEST 05: Shift Left k cell example /////");
        b = copyArray(a, a.length);
        b=shiftLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
        
        System.out.println("\n///// TEST 06: Rotate Left k cell example /////");
        b = copyArray(a, a.length); 
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=rotateLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
        
        System.out.println("\n///// TEST 07: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=shiftRight(b,3);
        printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
        
        System.out.println("\n///// TEST 08: Rotate Right k cell example /////");
        b = copyArray(a, a.length); 
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=rotateRight(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
        
        
        System.out.println("\n///// TEST 09: Insert example 1 /////");
        
        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
        System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        
        System.out.println("\n///// TEST 10: Insert example 2 /////");
        int [] c = {10, 20, 30, 40, 50, 0, 0}; 
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
        bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        
        System.out.println("\n///// TEST 11: Insert example 3 /////");
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        
        System.out.println("\n///// TEST 12: Remove example 1 /////");
        
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
     //   bol=removeAll(c,7,90);
        System.out.println(bol); // This Should Print: false
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        
        System.out.println("\n///// TEST 13: Remove example 2 /////");
        printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
//        bol=removeAll(c,7,70);
        System.out.println(bol); // This Should Print: true
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
        
        
        
    }
    
    // Prints the contents of the source array
    public static void printArray(int [] source){
        // TO DO
        for(int i=0; i< source.length; i++){
            if(i< source.length-1){
                System.out.print(source[i]+", ");
            }
            else{
                System.out.print(source[i]+".\n");
            }
        }
        }
        
    
    
    // Prints the contents of the source array in reverse order
    public static void printReverse(int [] source){
        // TO DO
    	int [] temp = new int [source.length];
    	int i= 0;
    	for(int j= source.length-1; j>=0; j--){
    		temp[i] = source [j];
    		i++;
    	}
    	for( i=0; i< source.length; i++){
            if(i< source.length-1){
                System.out.print(temp[i]+", ");
            }
            else{
                System.out.print(temp[i]+".\n");
            }
    }
    }

    
    // creates a copy of the source array and returns the reference of the newly created copy array
    public static int [] copyArray(int [] source, int len){
        // TO DO
        int [] temp = new int[len];
        for(int i = 0; i < temp.length; i++){
            temp [i] = source [i];
        }
        return temp; // remove this line    
    }
    
    // creates a reversed copy of the source array and returns the reference of the newly created reversed array
    public static void reverseArray(int [] source){
        // TO DO
    	int [] temp = new int [source.length];
    	int i= 0;
    	for(int j= source.length-1; j>=0; j--){
    		temp[i] = source [j];
    		i++;
    	}
    	//int[] temp = int[] b;
    	//return temp;
    	
    	for( i=0; i< source.length; i++){
           if(i< source.length-1){
               System.out.print(temp[i]+", ");
            }
            else{
               System.out.print(temp[i]+".\n");
            }
    }
    }
    
    // Resizes the source array by increasing 5 more cells and returns the reference of the resized array
    public static int [] resizeArray(int [] source){
        // TO DO
    	int [] temp = new int [source.length+5];
    	for(int i=0 ; i<source.length; i++){
    		temp[i]= source[i];
    	}
    		
        return temp; // remove this line 
    }
    
    
    
    // Shifts all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int [] shiftLeft(int [] source, int k){
        // TO DO
    	
    	int[] temp = new int [source.length];
    	int i = 0;
    		for(int n=k; n < temp.length; n++ ){
    			temp [i] = source [n];
    			i++;
    	}
        return temp; // remove this line    
    }
    
   // Rotates all the elements of the source array to the left by 'k' positions
   // Returns the updated array
    public static int [] rotateLeft(int [] source, int k){
        // TO DO
       // k = 3;
        int [] temp= new int [source.length];
        int i= 0;
        for(int j =k; j < temp.length; j++){
        	
        	temp [i] = source [j];
        i++ ;
        }
        int l =0;
        for( ; i < temp.length; i++){ // eikhane "i" re man age change hoyeche,
        	//tai "i" er man r initialization korar dokar nai,
        	// just 1ta ";" dilei cholbe.
        	
        	temp [i] = source[l];
        	l++;
        }
        return temp; // remove this line    
    }
    
   // Shifts all the elements of the source array to the right by 'k' positions
   // Returns the updated array
    public static int [] shiftRight(int [] source, int k){
        // TO DO
    	int[] temp = new int [source.length];
    	int i = 0;
    		for(k=3; k < temp.length; k++ ){
    			temp [k] = source [i];
    			i++;
    	}
        return temp; // remove this line    
    }
    
   // Rotates all the elements of the source array to the right by 'k' positions
   // Returns the updated array
    public static int [] rotateRight(int [] source, int k){
        // TO DO
    	int [] temp= new int [source.length];
        int i= 0;
        for(int j =k; j < temp.length; j++){
        	
        	temp [j] = source [i];
        i++ ;
        }
        int l =0;
        for( ; i < temp.length; i++){ // eikhane "i" re man age change hoyeche,
        	//tai "i" er man r initialization korar dokar nai,
        	// just 1ta ";" dilei cholbe.
        	
        	temp [l] = source[i];
        	l++;
        }
        return temp; // remove this line    
    }
    
    /** @return true if insertion is successful; @return false otherwise
      * @param arr the reference to the linear array
      * @param size the number of elements that exists in the array. size<=arr.length
      * @param elem the element that is to be inserted
      * @param index the index in which the element is required to be inserted
      * if insertion is not successful due to lack space, print "No space Left"
      * if given index is invalid, print "Invalid Index"
      * if insertion is successful, print the 'Number of elements after insertion' is completed
      */
    public static boolean insert(int [] arr, int size, int elem, int index){
        // TO DO
    	int [] temp = new int [arr.length];
    	if(size == arr.length){
    		System.out.println("No space left.");
    		//throw new RuntimeException("No space left.");
    	}
    	else{
    		for(int i= size-1; i>=index; i--){
    			
    			temp[i+1] = arr[i];
    			arr[index] = elem;
    		}
    		
    	}
        return false; // remove this line    
    }
    
    /** 
     * removes all the occurences of the given element
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array. size<=arr.length
     * @param elem the element to be removed
     * @return true if removal is successful; return false otherwise
     * if removal is successful, print the 'Number of elements after removal' is completed
     */  
//    public static boolean removeAll(int [] arr, int size, int elem){
//        // TO DO
//    	if(size==arr.length){
//    		throw new RuntimeException("no space left");
//    		else{
//    			
//    			
//    		}
//    		
//    	}
//        return false; // remove this line    
    }



