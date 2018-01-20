
public class FindTheCool {

	public static void main(String[] args) {


		long num = 123456789;
		int count = 0;
		String s = String.valueOf(num);
		for(int i = 0; i < s.length(); i++)
		{
		 char ch = s.charAt(i);
		 if(ch == '1')
		    count ++;
		}
		System.out.println(s.charAt(0));

	}

}
