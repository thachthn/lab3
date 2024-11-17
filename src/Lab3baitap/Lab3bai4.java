package Lab3baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int phanTu;
		do {
			System.out.print("nhập số phần tử của mảng: ");
			phanTu = sc.nextInt();
		} while (phanTu < 0);
		//muốn độ dài của mảng bao nhiêu tuỳ thích
		String sinhVien[] = new String[phanTu];
		float diem[] = new float[phanTu];
		for (int i = 0; i < diem.length; i++) {
			System.out.printf("nhap ten sinh vien thu %d: ", (i + 1));
			sc.nextLine();
			sinhVien[i] = sc.nextLine();
			System.out.printf("nhap diem sinh vien thu %d: ", (i + 1));
			diem[i] = sc.nextFloat();

		}
		System.out.println("mang ten sinh vien: " + Arrays.toString(sinhVien));
		System.out.println("mang diem sinh vien: " + Arrays.toString(diem));
		/*
		 * không thể dùng Arrays.sort, nên dùng thuật toán
		 */
		for (int i = 0; i < diem.length; i++) {
			for (int j = i + 1; j < diem.length; j++) {
				if (diem[i] > diem[j]) {
					float temp = diem[i];
					diem[i] = diem[j];
					diem[j] = temp;
					String svTemp = sinhVien[i];
					sinhVien[i] = sinhVien[j];
					sinhVien[j] = svTemp;
				}
			}
		}
		for (int i = 0; i < diem.length; i++) {
			System.out.println("Ho ten: " + sinhVien[i]);
			System.out.println("Diem: " + diem[i]);
			if (diem[i] >= 9) {
				System.out.println("Hoc Luc: xuất sắc!");
			} else if (diem[i] >= 7.5) {
				System.out.println("Hoc Luc: giỏi!");
			} else if (diem[i] >= 6.5) {
				System.out.println("Hoc Luc: khá!");
			} else if (diem[i] >= 5) {
				System.out.println("Hoc Luc: trung bình!");
			} else {
				System.out.println("Hoc Luc: yếu!");
			}
			System.out.println();
			sc.close();
		}
	}

}
