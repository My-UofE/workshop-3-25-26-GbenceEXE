import java.util.Scanner;

public class PrintPattern2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Boolean valid;
        int size;
        do {
            valid = true;
            System.out.print("Enter the size: ");
            size = s.nextInt();
            if (size < 1){
                System.out.println("too small!");
                valid = false;
            } else if (size > 5){
                System.out.println("too big!");
                valid = false;
            }
        } while (!valid);
        s.close();
  
        int limit = 2 * size;
        // Outer loop to print each of the rows
        for (int row = 1; row <= limit; row++) {
            int colStart = (row > size) ? limit % row + 1 : row;
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= limit; col++) {
                int n = (col > size) ? colStart + (limit - col) : colStart + col - 1;
                System.out.print(n);
            }
            System.out.println("");
        }
    }
}