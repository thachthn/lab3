package Lab3baitap;

public class Lab3bai2 {
public static void main(String[] args) {
	for (int i = 2; i <= 9; i++) {
		for (int j = 1; j <=10; j++) {
			int nhan = i*j;
			System.out.printf("%2d  x %2d = %2d\n", i , j , nhan);		
		}
		System.out.println("--------------");
	}
}
}
