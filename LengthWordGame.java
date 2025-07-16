import java.util.Scanner;
public class LengthWordGame {
	public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
String input=sc.nextLine();
String[]words=input.split(" ");
String winner="";
int maxlen=0;
for(String word:words) {
	int len=word.length();
	if(len%2!=0&&len>maxlen) {
		maxlen=len;
		winner=word;
	}
	
}
if(winner.equals("")) {
	System.out.println("better luck next time");
}
else {
	System.out.println(winner);
}
sc.close();
}}

