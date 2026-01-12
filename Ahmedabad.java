 import java.util.Scanner;

class Ahmedabad {

    // Method with argument and return type
    int armstrong(int num) {
        int temp = num, sum = 0, digit;
        int count = 0;

        // Step 1: count digits
        int t = num;
        while (t > 0) {
            count++;
            t = t / 10;
        }

        // Step 2: calculate Armstrong sum
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Ahmedabad obj = new Ahmedabad();
        int result = obj.armstrong(n);

        if (result == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}