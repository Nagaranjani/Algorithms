
public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 1200021;
		int i = 10;
		System.out.println(isIntPalindrome(i));
	}
	public static boolean isIntPalindrome(int i){
		if(i < 0 || (i % 10 == 0 && i != 0)) return false;
		if(i == 0) return true;
		int temp = i;
		int rev = 0;
		int rem = 0;
		//when temp > rev we have reached half of the integer
		while(temp > rev){
			rem = temp % 10;
			temp = temp /10;
			rev = rev*10 + rem;
		}
		//second condition for palindrome with middle number, we need to ignore from the reversed half for comparision.
		return temp == rev || temp == rev/10;
	}

}
