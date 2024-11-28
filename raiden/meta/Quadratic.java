import java.util.Scanner;
class Quadratic {
public static void main(String[] args) {
int a, b, c;
double real, img, r1, r2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values of a, b and c: ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
double d = (b*b)-(4*a*c);
System.out.println("The value of d is : "+d);
if(d>0) {
r1 = (-b + Math.sqrt(d))/(2*a);
r2 = (-b - Math.sqrt(d))/(2*a);
System.out.println("The values are "+r1+ " and "+r2+ "which are real and distinct");
}
else if (d==0) {
r1 = -b/(2*a);
r2 = -b/(2*a);
System.out.println("The values are "+r1+ " and "+r2+ "which are real and equal"); 
}
else {
real = -b/(2*a);
img = Math.sqrt(-d)/(2*a);
System.out.println("The values are " +real+" + "+img+"i and "+real+ " - "+img+"i which are complex and distinct");
}}}