public class ExceptionHandling {
public static void main(String[] args) {
try {
int a=50;
int b=0;
int c=a/b;
}
catch(ArithmeticException e) {
System.out.println("Arithmetic Exception");
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Index out of bounds Exception");
}
catch(NumberFormatException e) {
System.out.println("Number format exception");
}
finally {
System.out.println("Exception handling");
}}}