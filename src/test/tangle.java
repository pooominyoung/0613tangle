package test;
import java.util.Scanner;
public class tangle {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("높이 입력 : ");
	      int h = sc.nextInt();
	      int j = 0;
	      
	      for (int i=0; i<h; i++) {
	         if(i<2*h) {
	            for(j = 0; j<2*h; j++) {
	               if(j<h-i ||h+i<j )
	               {System.out.print(" ");}
	               else{System.out.print("*");}}}
	         System.out.println();

	}
  }
}


