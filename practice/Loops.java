package com.chainsys.practice;

/*Print the following statement using loops
  * 1*****    
  * 12****     
  * 123***     
  * 1234**     
  * 12345*     
  * 123456     
 */
public class Loops {
   public static void main(String[] args) {
	   for(int i=1; i<=6; i++) {
		   for(int j=1; j<=i; j++) {
			   System.out.print(j);
		   }
		   for(int k=6; k>i; k--) {
			   System.out.print("*");
		   }
		   System.out.println("");
	   } 
/*Print the following statement using loops
  * 12345&
  * 1234&&
  * 123&&&
  * 12&&&&
  * 1&&&&&
  * &&&&&&
 */
	   System.out.println("");
	   
	   for(int i=6; i>=1; i--) {
		   for(int j=1; j<i; j++) {
			   System.out.print(j);
		   }
		   for(int k=6; k>=i; k--) {
			   System.out.print("&");
		   }
		   System.out.println("");
	   }
/*Print the following statement using loops
  * @
  * @ @
  * @  @
  * @   @
  * @    @
  * @     @
  * @ @ @ @ @
*/	   
	   System.out.println();
	   
	   System.out.println("@");
	   for(int i=5; i>=1; i--) {
		   System.out.print("@");
		   
		   for(int j=5; j>=i; j--) {
			   System.out.print(" ");
		   }
		   System.out.println("@");
	   }
		   for(int j=5; j>0; j--) {
			   System.out.print("@ ");
		   }
   }       
}



