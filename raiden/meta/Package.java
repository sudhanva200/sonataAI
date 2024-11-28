package CSM;
public class A{
public void add(int a, int b) {
System.out.println(a+b);
}}

package CSM;
public class B{
public void sub(int a, int b) {
System.out.println(a-b);
}}


import CSM.A;
import CSM.B;
class Package {
public static void main(String[] args) {
A a = new A();
B b = new B();
a.add(2,5);
b.sub(3,1);
}}