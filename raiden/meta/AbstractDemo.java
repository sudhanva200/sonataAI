abstract class Shape {
int a=2;
int b=4;
abstract void PrintArea();
}
class Rectangle extends Shape{
void PrintArea(){
int r =a*b;
System.out.println("Area of Rectangle: "+r);
}}
class Triangle extends Shape{
void PrintArea(){
int t =(a*b)/2;
System.out.println("Area of Triangle: "+t);
}}
class Circle extends Shape{
void PrintArea(){
int c =(int)(3.14*a*a);
System.out.println("Area of cirle: "+c);
}}
public class AbstractDemo {
public static void main(String[] args) {
Rectangle r = new Rectangle();
Triangle t = new Triangle();
Circle c = new Circle();
Shape s;
s = r;
s.PrintArea();
s = t;
s.PrintArea();
s = c;
s.PrintArea();
}}


