import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        in.nextLine();
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
        int i = startNum;
        int sum = 0;
        do{
            sum += i*i;
            i++;
        } while (i <= endNum);
        double average = (double)sum / (endNum - startNum + 1);

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);

        in.close();
    }
}