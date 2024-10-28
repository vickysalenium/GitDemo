package javapractice;

import java.util.HashSet;

public class DuplicateString {
	    public static void main(String[] args) {
	    	
//        HashSet<String> hs = new HashSet<String>();
//        hs.add("vicky");
//        hs.add("vicky");
//        hs.add("manoj");
//        hs.add("kishan");
//        hs.add("ramesh");
//        hs.add("sunil");
//	    System.out.println(hs);
	    	
	    	
	        String name="hlsfadlhlihksdfbv";
	        char[] ch = name.toCharArray();
	        HashSet<Character> hs=new HashSet<>();
	        for (char c:ch){
	            hs.add(c);
	        }
	     // StringBuffer sb=new StringBuffer();
//	        StringBuilder sb=new StringBuilder();
//	        for (char Characters:hs){
//	            sb.append(Characters);
//	        }
	        System.out.println(hs);
	   

}
}
