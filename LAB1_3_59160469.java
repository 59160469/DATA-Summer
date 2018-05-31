import java.util.Scanner;

public class LAB1_3_59160469 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		if (n > 2) {
			System.out.println(input(n));
		}
	}

	public static int input(int n) {
		int count=0;
		for (int i = 0; i <= n; i++) {
			n=n/2;
			count++;

		}
		return count;
		
	
	}

}

