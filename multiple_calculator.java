import java.util.Scanner; // Import scanner utility
public class multiple_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create scanner object to detect user input

        System.out.println("Enter the base number: ");
        int n = scan.nextInt(); // Detects the next integer typed in console
        System.out.println("How many multiples would you like to print?: ");
        int k = scan.nextInt();
        System.out.println("Do you want to print even (e), odd (o), or all (a) multiples?: ");
        String type = scan.next();

        for (int i = 1; i <= k; i++) { // goes from 1 to the number, with (i * n) being the multiple
            if (type.equals("e") && (i * n) % 2 == 0 || type.equals("o") && (i * n) % 2 == 1 || type.equals("a")) { // checks whether it can output the result or not
                System.out.println(i * n);
            }
        }
    }
}
