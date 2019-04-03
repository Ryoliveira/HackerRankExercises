import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args) {
		// HackerRank Code
//		 	Scanner in = new Scanner(System.in);
//	        while(in.hasNext()){
//	            String IP = in.next();
//	            System.out.println(IP.matches(new MyRegex().pattern));
//	        }
		String IPS[] = { "000.12.12.034", "121.234.12.12", "23.45.12.56", "00.12.123.123123.123", "122.23", "Hello.IP" };
		for (String ip : IPS) {
			System.out.println(ip.matches(new MyRegex().pattern));
		}

	}

}

class MyRegex {
	String pattern;

	public MyRegex() {
	  /*1) \\d{1,2} catches any one or two digit number
		2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
		3) 2[0-4]\\d catches numbers between 200 and 249.
		4) 25[0-5] catches numbers between 250 and 255.*/
		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	}

}
