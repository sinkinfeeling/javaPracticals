import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizerExample19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;
        System.out.println("The integers are:");

        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println(number);
            sum += number;
        }

        System.out.println("Sum of integers: " + sum);
        scanner.close();
    }
}
