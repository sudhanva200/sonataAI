import java.util.*;

class SortNames {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] a = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        for (int k = 0; k < n - 1; k++) {
            for (int j = 0; j < n - k - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted names:");
        for (String name : a) {
            System.out.println(name);
        }
        
        sc.close();
    }
}
