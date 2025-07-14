import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First word:");
		String word1=sc.nextLine();
		System.out.println("Second word:");
		String word2=sc.nextLine();
		word1=word2.replaceAll("\\s","").toLowerCase();
		word2=word2.replaceAll("\\s","").toLowerCase();
		if(word1.length()!=word2.length()) {
			System.out.println("the words are unique");
			
		}
		else {
			char[]arr1=word1.toCharArray();
			char[]arr2=word2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
		
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("the strings are anagrams");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
}
