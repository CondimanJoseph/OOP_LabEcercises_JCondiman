import java.util.function.IntPredicate;
import java.util.Scanner;

public class Exer1_Functional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        IntPredicate isEven = n -> n % 2 == 0;

        System.out.println("The number " + number + " is " + (isEven.test(number) ? "Even" : "Odd"));
    }
}
