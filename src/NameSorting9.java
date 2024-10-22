import java.util.Arrays;
import java.util.Scanner;

public class NameSorting9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Sorting the names
        Arrays.sort(names);

        // Display sorted names
        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
