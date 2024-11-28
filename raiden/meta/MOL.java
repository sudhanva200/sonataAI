class MethodOverload {
void calvalue() {
int x = 20;
x = x*x;
System.out.println("Square of x: "+x);
}

void calvalue(int y) {
y = y*y*y;
System.out.println("Cube of y: "+y);
}
void calvalue(int m,int n) {
int z = m*n;
System.out.println("Product of m and n is: "+z);
}}
public class MOL {
public static void main(String[] args) {
MethodOverload m = new MethodOverload();
m.calvalue();
m.calvalue(10,20);
m.calvalue(10);
}}