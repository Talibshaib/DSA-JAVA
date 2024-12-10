import java.util.Scanner;

public class DayThree {
        // static void sum() {
        // Scanner input = new Scanner(System.in);
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // int sum = num1 + num2;
        // System.out.println("Sum is " + sum);
        // }

        // static void greet() {
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // System.out.println("hey " + name);
        // }

        // RETURN

        // static int sum2() {
        // int num1 = 10;
        // int num2 = 30;
        // int sum = num1 + num2;
        // return sum;

        // }

        // ARGS
        // static String greet2(String name) {
        // String greeting = "hello " + name;
        // return greeting;

        // }
        // SWAP
        // static void swap(int a, int b) {
        //         int temp = a;
        //         a = b;
        //         b = temp;
        //         System.out.println(a);
        //         System.out.println(b);
        // }

        // SCOP (in java there is only pass by value not pass by refrence)
        // static void scope() {
        //         int a = 30;
        //         int b;
        //         {
        //                b = 40;
        //         }
        //         System.out.println(a + b);

        // }
        //SHADOW SCOPING
        static int hidden = 50; //

        public static void main(String[] args) {
                // sum();
                // greet();
                // int result = sum2();
                // System.out.println(result);
                // String wish = greet2("danish");
                // System.out.println(wish);
                // swap(20, 30);
                // scope();
                int hidden = 90;
                System.out.println(hidden);
        }

}
