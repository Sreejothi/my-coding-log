import java.util.Scanner;
public class PalindromeCheck {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	String str=sc.nextLine().toLowerCase();
	String reverse="";
	for(int i=str.length()-1;i>=0;i--) {
		reverse+=str.charAt(i);
	}
if(str.equals(reverse)) {
	System.out.println("it is a palindrome");
	
}
else {
	System.out.println("not a palindrome");
	
}
sc.close();
}
}
