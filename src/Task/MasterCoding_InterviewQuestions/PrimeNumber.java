package Task.MasterCoding_InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("invalid data range");
        } else {
            for (int i = 2; i <= num; i++) {
                boolean isPrime = true;
                if (i > 1) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }

                    }
                    if (isPrime == true) {
                        System.out.println(i + " is a prime number");
                    }
                }

            }
        }
    }
}

