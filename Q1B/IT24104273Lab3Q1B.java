import java.util.Scanner;
public class IT24104273Lab3Q1B
{
public static void main(String[] args)
{
double PriceperKg,NumberofKgs,TotalAmountwithDiscount;

Scanner input = new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice: ");

PriceperKg = input.nextDouble();

System.out.print("Enter the number of kilograms you want to buy: ");

NumberofKgs = input.nextDouble();

TotalAmountwithDiscount = PriceperKg*NumberofKgs*0.9;

System.out.println("");
System.out.print("The total amount is: " + TotalAmountwithDiscount);
}
}
