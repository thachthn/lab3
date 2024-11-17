package Lab3baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3bai3 {
	public static void main(String[] args) {
		int mang[] = new int[9];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang.length; i++) {
			System.out.printf("so phan tu thu %d :", (i + 1));
			mang[i] = sc.nextInt();
		}
		// chuyển mảng số nguyên thành chuỗi
		System.out.println("phan tu cua mang la: " + Arrays.toString(mang));

		// sắp xếp mảng tăng dần
		Arrays.sort(mang);
		System.out.println("phan tu cua mang sau khi sap xep la: " + Arrays.toString(mang));

		// tìm giá trị nhỏ nhất trong mảng số nguyên
		int min = mang[0];
		for (int j = 1; j < mang.length; j++) {
			min = Math.min(min, mang[j]);
		}
		System.out.println("phan tu co gia tri nho nhat:" + min);

		// tính trung bình cộng
		int tong = 0;
		int soDem = 0;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] % 3 == 0) {
				tong += mang[i];
				soDem++;
			}
		}

		float trungBinh = (float) tong / soDem;
		System.out.println("gia tri trung binh là: " + trungBinh);
		sc.close();
	}
}
