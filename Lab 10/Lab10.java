import java.util.Scanner;
public class Lab10{
  public static void main(String [] args){
  Scanner fr = new Scanner(System.in);
  int m = fr.nextInt();
  int edge = fr.nextInt();
  
  int [][] matrix = new int[m][m];
  for(int i=0; i<edge; i++){
     int a = fr.nextInt();
     int b = fr.nextInt();
     matrix [a][b]=1;
     matrix [b][a]=1;
  }
 for(int e=0; e<m; e++){
   for(int c=0; c<m; c++){
  System.out.print(matrix [e][c]+" ");
  }
   System.out.println();
  }
  }
}