import java.util.Scanner;
public class IT24104273Lab3Q2
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

// Input monthly salary
System.out.print("Enter the monthly salary: ");
double monthySalary = input.nextDouble();

//Input number of OT hours
System.out.print("Enter the number of OT hourse: ");
double OThourse = input.nextDouble();

//Input OT hourly rate
System.out.print("Enter the OT hourly rate: ");
double OTrate = input.nextDouble();

//calculation
double OTamount = OThourse*OTrate;
double TotalSalary = monthySalary + OTamount;

//display total salary
System.out.print("The total salary including OT is: "+ TotalSalary);
}
}