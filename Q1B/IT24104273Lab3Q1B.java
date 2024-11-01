import java.util.Scanner;
public class IT24104273Lab3Q1B
{
public static void main(String[] args)
{
double PriceperKg,NumberofKgs,TotalAmountwithDiscount,Discount;

Scanner input = new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice: ");

PriceperKg = input.nextDouble();

System.out.print("Enter the number of kilograms you want to buy: ");

NumberofKgs = input.nextDouble();

Discount = PriceperKg*NumberofKgs*0.1;
System.out.println("");
System.out.print("The discount is: " + Discount);


TotalAmountwithDiscount = (PriceperKg*NumberofKgs)-Discount;

System.out.println("");
System.out.print("The total amount is: " + TotalAmountwithDiscount);
}
}
