import java.util.Scanner;

public class LAB1_1_59160469 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		long m = kb.nextLong();
		System.out.println(isMultitple(n,m));
		
	}
	public static boolean isMultitple(long n,long m) {
		if(n % m != 0) {
			return false;
		}else {
			return  true;
		}
	}

}
