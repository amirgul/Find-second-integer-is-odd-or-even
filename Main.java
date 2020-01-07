import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int x, y;
        System.out.println("please enter two numbers");
         x = keyboard.nextInt();
         y = keyboard.nextInt();
        if(x%y == 0)
        {
            System.out.println("number is divisble and remainder is zero");
        }
        else
            System.out.println("number is odd");

    }
}
