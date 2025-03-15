package strings;
import java.util.Scanner;
public class no_of_words {
	public static int spaces(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return s.charAt(0)==' '?count:count+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter string");
	     String s=scan.nextLine();
	     int res=spaces(s);
	     System.out.println(res);
	}

}
