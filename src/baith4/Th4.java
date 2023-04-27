package baith4;
import java.util.Scanner;
public class Th4 {

        public static void main(String args[])
        {
            Scanner scn = new Scanner(System.in);
            try
            {
                int n = Integer.parseInt(scn.nextLine());

                if (99%n == 0)
                    System.out.println(n + " jh  99 ");
            }
            catch (ArithmeticException ex)
            {
                System.out.println("Arithmetic " + ex);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Number Format Exception " + ex);
            }
        }
    }


