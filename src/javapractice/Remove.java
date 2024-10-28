package javapractice;

import java.util.HashMap;
import java.util.HashSet;

public class Remove {

	public static void main(String[] args) {
		  String name="pankajkumar";
	       HashMap<Character,Integer> map=new HashMap<>();
	       for(int i=0;i<=name.length()-1;i++){
	           char ch=name.charAt(i);
	           if(map.containsKey(ch)){
	               map.put(ch,map.get(ch)+1);
	           }
	           else{
	               map.put(ch,1);
	           }
	       }
	       // System.out.println(map);
	        
	        
	        HashSet hs=new HashSet();
	        char c[]=name.toCharArray();
	        for(int i=0;i<=name.length()-1;i++)
	        {
	            hs.add(String.valueOf(c[i]));
	        }
	        System.out.println(hs);
	    }

}
