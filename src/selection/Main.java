package selection;
import java.util.Scanner;
class UserMainCode{
	int fac(int n) {
		int i;
		if(n==0)
			return 1;
		int p=1;
		for(i=1;i<=n;i++)
			p*=i;
		return p;
	}
	static int calculateNcr(int n, int r) {
		UserMainCode temp=new UserMainCode();
		int res=temp.fac(n)/(temp.fac(r)*temp.fac(n-r));
		return res;
	}
}
public class Main extends UserMainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value of n and r");
         int n=sc.nextInt();
         int r=sc.nextInt();
         UserMainCode m=new Main();
         System.out.println("Value of ncr is: "+m.calculateNcr(n, r));
	}

}
