import java.util.Scanner;

public class PrintPattern1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = s.nextInt();

        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
        // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println("");
        }

        s.close();
    }
}