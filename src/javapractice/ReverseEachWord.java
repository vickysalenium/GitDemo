package javapractice;

public class ReverseEachWord {
	
	public static void main(String args[]) {
		
		String word= " hello java world";
		
		String w[]=word.split(" ");
		
		String rev = "";
		
		for(int i=w.length-1; i>=0; i--) {
			
			rev=rev+w[i]+" ";
			
		}
		System.out.println(rev);
		
	}

}
