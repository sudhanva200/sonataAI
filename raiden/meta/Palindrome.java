import java.util.*;
class Palindrome {
public static void main(String[] args) {
String str, rev = "";
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String: ");
str = sc.nextLine();
for( int i = str.length()-1; i>=0; i--) {
rev = rev + str.charAt(i);
}
if(str.equals(rev)) {
System.out.println(str + " is a Palindrome");
}
else {
System.out.println("not Palindrome");
}}}
