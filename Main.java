import java.math.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("RSA ENCRYPTOR/DECRYPTOR");
 System.out.println("*******");
 
 System.out.print("Enter the Value of P:-");
 BigInteger p = sc.nextBigInteger();
 
 System.out.print("Enter the Value of Q:-");
 BigInteger q = sc.nextBigInteger(); 
 
 boolean check_p = p.isProbablePrime(1); 
 boolean check_q = q.isProbablePrime(1);
 
 while(((check_p==false) || (check_q==false))){
 System.out.println("Warning!! Inputs are not prime");
 System.out.println();
 System.out.print("Enter the Value of P:-");
 p = sc.nextBigInteger();
 System.out.print("Enter the Value of Q:-");
 q = sc.nextBigInteger();
 check_p = p.isProbablePrime(1);
 check_q = q.isProbablePrime(1);
 }
 System.out.println();
 System.out.println("P adn Q are prime Number");
 }
}