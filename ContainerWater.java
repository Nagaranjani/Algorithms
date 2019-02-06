
public class ContainerWater {

	public static void main(String[] args) {
		int[] input = {1,8,6,2,5,4,8,3,7};
		//int[] input = {1,2,4,3};
		System.out.println(containerWithMostWater(input));
	}
	public static int containerWithMostWater(int[] input){
		int i = 0;
		int j = input.length-1;
		int maxArea = Integer.MIN_VALUE;
		while(i < j){
			maxArea = Math.max(maxArea,Math.min(input[i], input[j])*(j-i));
			if(input[i] < input[j]){
				i++;
			}else{
				j--;
			}
		}
		return maxArea;
	}

}
