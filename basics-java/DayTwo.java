import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class DayTwo {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // int roll = input.nextInt();
                // System.out.println("Your roll is " + roll);

                // input.nextLine(); // Consume the newline character left by nextInt()

                // String name = input.nextLine();
                // System.out.println("Your name is " + name);

                //
                // float marks = input.nextFloat();
                // System.out.println("Your marks is " + marks);

                // SUM
                // int num1 = input.nextInt();
                // int num2 = input.nextInt();
                // int sum = num1 + num2;
                // System.out.println("Sum is " + sum);
                // TYPE CONVERSION
                // float num3 = input.nextFloat();
                // double num4 = input.nextDouble();
                // System.out.println(num3+num4);

                // CASTING
                // int intNum4 = (int) (num3);
                // System.out.println("num4 is " + intNum4);
                // CONDITIONALS AND LOOPS
                // int num5 = input.nextInt();
                // while (num5 <= 40)
                // {
                // System.out.println(num5);
                // System.out.println("done");
                // num5++;
                // }

                // for loop mainly use you know how many times of loops gone run
                // for (int i = 0; i <= 10; i++){
                // System.out.println(19*i);
                //
                // }
                // do-while
                // int num6 = input.nextInt();
                // do{
                // System.out.println(num6);
                // num6++;
                // } while (num6 <= 10);

                // CONDITIONALS

                // int salary = input.nextInt();
                // if (salary >= 25000 && salary <= 50000) {
                // System.out.println("you got total salary" +" "+(salary +2000));
                //
                //
                // } else if (salary >= 50000 && salary <= 75000) {
                // System.out.println("you got total salary" +" " + (salary +2500));
                //
                // }
                // else {
                // System.out.println("you got total salary" +" "+(salary +3000));
                // }

                // LARGEST NUM
                // int num7 = input.nextInt();
                // int num8 = input.nextInt();
                // int num9 = input.nextInt();
                // int max = num7;
                // if (num8>max){
                // max = num8;
                // }
                // if (num9>max){
                // max = num9;
                // }
                // System.out.println(max);

                // FABONACHI NUMBER
                // int n = input.nextInt();
                // int i = 0;
                // int f = 1;
                // int count =2;
                // while (count<=n){

                // }
                // System.out.println(f);

                // COUNT OF NUMBER REPEATED
                // int num10 = input.nextInt();
                // int count = 0;
                // while (num10>0){
                // if (num10%10 == 7){
                // count++;
                // }
                // num10 = num10/10;
                // }

                // INVERSE NUMBER
                int num11 = input.nextInt();
                int result = 0;

                while (num11 > 0) {
                        int rem = num11 % 10;
                        num11 = num11 / 10;
                        result = result * 10 + rem;
                }

                System.out.println(result);

                // CALCULATOR PROGRAM

                // SWITCH AND CONDITION

                // NESTED SWITCH CASE

                // INHANCE SWITCH

                //FUNCTIONS
                

        }
}