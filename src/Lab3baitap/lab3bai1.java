package Lab3baitap;

import java.util.Scanner;

public class lab3bai1 {
	public static void main(String[] args) {
		int soN;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("nhap n: ");
			soN = sc.nextInt();
		} while (soN <= 0);
		
		boolean ok = true;
		for (int i = 2; i < soN - 1; i++) {// số nguyên tố là số chia hết cho 1 và chính nó
			if (soN % i == 0) {
				ok = false;
				break;
			}
			
		} 
		if (ok) {
			System.out.println("" + soN + " la so nguyen to");
		} else {
			System.out.println("" + soN + " khong phai la so nguyen to");
		}

		sc.close();
	}
}
