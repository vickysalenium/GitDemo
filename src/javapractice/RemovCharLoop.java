package javapractice;

public class RemovCharLoop {

	public static void main(String[] args) {
		String s="big black bug bit a big black dog on his big black nose";
		char[] c=s.toCharArray();
		int len = c.length;
		
         for(int i=0;i<=len-1;i++) {
			
			for(int j=i+1;j<=len-1;j++) {
				
				if (c[i]!=c[j]) {
					System.out.println(c[j]);
					break;
				}
			}
		}
		
	}

}
