import java.util.Scanner;

class Demo008{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,pwd;
       
        do{
            System.out.print("enter your credentials");
            System.out.print("Enter username: ");
             username = scanner.nextLine();

            System.out.print("Enter pwd: ");
             pwd = scanner.nextLine();
             break;
        }
        while((!username.equals("jashmika_001"))||(!pwd.equals(" jashu_001")));
            System.out.println("sucessfully logined");   
    }
}
