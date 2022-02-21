package validcolor;
import java.util.Scanner;
public class UserMainCode {

	static int validateColorCode(String s) {
		int res=1;
		char [] str=s.toCharArray();
		if(str[0]=='#'&&s.length()==7) {
			for(int i=1;i<7;i++) {
				if(!((str[i]>='A'&&str[i]<='F')||(str[i]>='0'&&str[i]<='9')))
				{
					res=-1;
				}
			}
		}
		else
		{
			res=-1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UserMainCode m=new UserMainCode();
		System.out.println("Enter code");
		String s=sc.next();
		if(validateColorCode(s)==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
