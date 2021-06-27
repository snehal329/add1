import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		int no1,no2,no3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		no1=sc.nextInt();
		System.out.println("Enter no2:");
		no2=sc.nextInt();
		
		no3=no1+no2;
		System.out.println("Add="+no3);

	}

}
