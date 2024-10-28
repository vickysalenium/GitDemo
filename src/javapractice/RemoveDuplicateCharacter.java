package javapractice;

import java.util.HashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		 String name = "pankaj";
         HashSet hs = new HashSet();
         char c[] = name.toCharArray();
         for (int i = 0; i <= name.length() - 1; i++) {
             hs.add(String.valueOf(c[i]));
         }
         System.out.println(hs);

     }

}
