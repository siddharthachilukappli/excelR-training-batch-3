import java.util.Scanner;
public class Demo021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your monthly gross salary: ");
        double monthlySalary = sc.nextDouble();
        System.out.println("Enter your monthly HRA: ");
        double hra = sc.nextDouble();
        System.out.println("Enter your monthly PF: ");
        double pf = sc.nextDouble();
        double annualSalary = monthlySalary * 12;
        double totalHRA = hra * 12;
        double totalPF = pf * 12;
        double deductions = totalHRA + totalPF;
        double taxableIncome = annualSalary - deductions;
        double tax = 0;
        if (taxableIncome <= 500000) {
            tax = 0.1 * taxableIncome; 
        } else if (taxableIncome <= 1000000) {
            tax = 0.1 * 500000 + 0.2 * (taxableIncome - 500000); 
        } else {
            tax = 0.1 * 500000 + 0.2 * 500000 + 0.3 * (taxableIncome - 1000000); 
        }
        System.out.println("Annual Gross Salary: Rs " + annualSalary);
        System.out.println("Total Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Your annual income tax is: Rs " + tax);
        sc.close();
    }
}
