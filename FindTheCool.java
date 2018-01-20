
public class FindTheCool {

	public static void main(String[] args) {

		int coolSum;
		
		coolSum = getCoolNum();
		
		System.out.println("The sum equals: " + coolSum);
		
		
	
	}

	public static int getCoolNum() {
		int sum = 0;
		int total = 0;
		int uncoolCount = 0;
		boolean exit = false;
		
do {
		for(int i=1; i<=23; i++) {
			
			String s = String.valueOf(i);
			
			for(int x=0; x<s.length(); x++) {
				//char ch = s.charAt(x);
				int digit = Character.getNumericValue(s.charAt(x));
				
				sum += digit * digit;
				
				System.out.println(sum);
			}
		if(sum == 1) {
				total += i;
				exit = false;
			}
			else if(sum == 4) {
				uncoolCount++;	
				exit = false;
			}
			else if (i == 23) {
				exit= true;
			}
		}
}while(exit = false);

		return total;		
		
		
	}
	
	

}
