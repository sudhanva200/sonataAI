import java.util.Scanner;
class InvalidAgeException extends Exception {
public InvalidAgeException(String str) {
super(str);
}}
public class UserExHandling {
static void validate(int age) throws InvalidAgeException {
if(age<18) {
throw new InvalidAgeException("age is not valid to vote");
}
else {
System.out.println("welcome to vote");
}}
public static void main(String[] args) {
try {
System.out.println("Enter age: ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
validate(a);
}
catch(InvalidAgeException e) {
System.out.println("Exception occured: "+e);
System.out.println("use the vote");
}}}

