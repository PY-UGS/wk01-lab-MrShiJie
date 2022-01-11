import java.util.Scanner;

public class Question2b
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println("Please enter your module code: ");

            // Remove spaces in the user input while returning the string in uppercase letter
            String input = scanner.nextLine().toUpperCase().replace(" ", "");

            switch (input) {
                case "CSC1006":
                    System.out.println ("Module Tile: Mathematics 2");
                    break;
                case "CSC1007":
                    System.out.println ("Module Tile: Operating Systems");
                    break;
                case "CSC1008":
                    System.out.println ("Module Tile: Data Structures and Algorithms");
                    break;
                case "CSC1009":
                    System.out.println ("Module Tile: Object Oriented Programming");
                    break;
                case "CSC1010":
                    System.out.println ("Module Tile: Computer Networks");
                    break;
                default:
                    System.out.println ("Sorry you are not attending the module code at the moment.");
            }
        }
    }
}
