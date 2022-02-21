package password;
import java.util.Scanner;
class UserMainCode{
	static int validatePassword(String s) {
		int res=1;
		if(s.length()!=8)
			res=-1;
		char [] str=s.toLowerCase().toCharArray();
		if(!((str[0]>='a'&&str[0]<='z')||(str[0]>='A'&&str[0]<='Z')))
		{
			res=-1;
		}
		if(!(s.contains("@")&&!s.contains("_")&&!s.contains("#")))
		{
			res=-1;
		}
		for(int i=1;i<8;i++) {
			if(!((str[i]>='a'&&str[i]<='z')||(str[i]>='0'&&str[i]<='9')||str[i]=='@'||str[i]=='_'||str[i]=='#')) {
				res=-1;
				break;
			}
		}
		return res;
	}
}
public class Main extends UserMainCode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter password to validate");
      String p=sc.next();
      UserMainCode m=new Main();
      if(m.validatePassword(p)==1) {
    	  System.out.println("Valid");
      }
      else
    	  System.out.println("Invalid");
      
	}

}
