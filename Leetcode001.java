import java.util.Scanner;

class LTCode001 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x = x / 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        LTCode001 solution = new LTCode001();
        boolean result = solution.isPalindrome(input);
     
        System.out.println(result);

        scanner.close();
    }
}