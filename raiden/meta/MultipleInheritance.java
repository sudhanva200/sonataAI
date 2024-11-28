interface Printable {
void print();
}
interface Showable {
void show();
}
class MultipleInheritance implements Printable, Showable {
public void print() {
System.out.println("hello");
}
public void show() {
System.out.println("welcome");
}
public static void main(String[] args) {
MultipleInheritance obj = new MultipleInheritance();
obj.print();
obj.show();
}}