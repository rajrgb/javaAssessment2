package electricBill;
import java.util.Scanner;
public class UserMainCode {

	static int calculateElectricityBill(String prev, String current, int charge) {
		int p=Integer.parseInt(prev.substring(5));
		int c=Integer.parseInt(current.substring(5));
		return (c-p)*charge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        UserMainCode x=new UserMainCode();
        System.out.println("Enter previous reading");
        String prev=sc.next();
        System.out.println("Enter current reading");
        String current=sc.next();
        System.out.println("Enter per unit charge");
        int charge=sc.nextInt();
        System.out.println("Bill is "+x.calculateElectricityBill(prev, current, charge));
	}

}
