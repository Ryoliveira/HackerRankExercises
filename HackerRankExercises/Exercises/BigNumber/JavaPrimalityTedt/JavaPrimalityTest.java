package JavaPrimalityTedt;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Java Primality Test
public class JavaPrimalityTest {
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String res = scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime";
	        System.out.println(res);
	        scanner.close();
	    }

}
