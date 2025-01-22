import java.util.Scanner;

public class Demo009 {
    String Customer_name = "Jashmika";
    long Account_no = 12345678;
    Double Balance = 100000.00;
    void accept_details() {
        System.out.print("Enter your name , account number: ");
        Scanner scanner = new Scanner(System.in);
        Customer_name = scanner.nextLine();
        Account_no = scanner.nextLong();
    }
    void Display_details(){
        System.out.println("Hello" + Customer_name);
        System.out.println("Your balance is " + Balance);
    }
    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}
