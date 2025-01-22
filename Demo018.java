import java.util.Scanner;
public class Demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        if (minutes < 0) {
            System.out.println("Error: Minutes cannot be negative.");
        } else {
            int minutesInDay = 24 * 60; 
            int minutesInYear = 365 * minutesInDay; 
            long years = minutes / minutesInYear; 
            long remainingMinutes = minutes % minutesInYear; 
            long days = remainingMinutes / minutesInDay; 
            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        }
        scanner.close();
    }
}
