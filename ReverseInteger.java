
public class ReverseInteger {
public static void main(String[] args) {
	int i = -156;
	        
	System.out.println(reverse(i));
}
public static int reverse(int i){
	boolean sign=false;
	if(i < 0){
		 i = -i;
		  sign = true;
	}
	int temp = i;
	int rem = 0;
	double newi = 0.0;
	
	while(temp > 0){
		rem = temp % 10;
		newi = newi*10 + rem;
		temp = temp / 10;
	}
	if(newi >Integer.MAX_VALUE) return 0;
	if(sign)newi = -newi;
	return (int)newi;
}
}
