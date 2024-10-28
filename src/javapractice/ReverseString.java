package javapractice;

public class ReverseString {

	public static void main(String arg[]) {
		
		String s = "vicky";
		String rs="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rs=rs+s.charAt(i);
		}
		System.out.println(rs);
		
	}
}
