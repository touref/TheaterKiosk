import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.println("Enter your age: " );
        if(in.hasNext())
        {
            age = in.nextInt();
            in.nextLine();
            System.out.println("You said your age is " + age);

            if(age >= 21)
             {
                 System.out.println("You get a wrist band");
             }

        }

        else
        {
            trash = in.nextLine();
            System.out.println("You said your age is " + trash);
            System.out.println("Run the program again. That's not a valid input.");
        }
    }
}