import java.util.Scanner;

public class HigherLower{

    /**
     *
     * @param args none
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = generateNum();

        System.out.println("Number is " + firstNum + ", will the next number be higher or lower? (numbers range from 1-20):");

        while (!scanner.next().equalsIgnoreCase("higher") && !scanner.next().equalsIgnoreCase("lower")) {
            System.out.println("invalid response, try again");
        }

        //if (answer.equalsIgnoreCase("higher") && ) {}

        scanner.close();
    }

    /**
     * Method to generate a number
     * @return generated integer
     */
    private static int generateNum() {
        return 0;
    }
}