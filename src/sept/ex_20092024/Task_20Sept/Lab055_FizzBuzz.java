package sept.ex_20092024.Task_20Sept;

import java.util.Scanner;

public class Lab055_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 != 0))
                System.out.println("Fizz");
            else if ((i % 5 == 0) && (i % 3 != 0)) {
                System.out.println("Buzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
