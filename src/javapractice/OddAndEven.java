package javapractice;

public class OddAndEven {
	
	public static void main (String []arg) {
		
		int num[] = {1,2,3,4,5,6,7,8,9};
		
		for (int i=0; i<=num.length-1;i++) {
			if(num[i]%2==0) {
				System.out.println("evenNumber = "+ num[i]);
			}else if(num[i]%2!=0) {
				
				System.out.println("oddNumber = "+num[i]);
			}
		}
	
	}

}
