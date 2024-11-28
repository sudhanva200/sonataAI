import java.util.*;
class Prime {
public static void main(String[] args) {
int i, n, p, j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number till which you want prime numbers to be printed: ");
n = sc.nextInt();
for(i = 2; i<=n; i++) {
p = 0;
for (j = 2; j<=i/2; j++) {
if (i%j==0) {
p = 1;
break;
}}
if (p == 0) {
System.out.print(i+" ");
}}
}}