import java.util.Scanner;

public class IT24104273Lab3Q3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the Rupee amount: ");
int amount = input.nextInt();

int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
int[] notes = new int[denominations.length];

for (int i = 0; i < denominations.length; i++) {
notes[i] = amount / denominations[i];
amount %= denominations[i];
}

System.out.println("Your Amount = " + amount);
System.out.println("5000 Notes - " + notes[0]);
System.out.println("1000 Notes - " + notes[1]);
System.out.println("500 Notes - " + notes[2]);
System.out.println("200 Notes - " + notes[3]);
System.out.println("100 Notes - " + notes[4]);
System.out.println("50 Notes - " + notes[5]);
System.out.println("20 Notes - " + notes[6]);
System.out.println("10 Notes - " + notes[7]);
System.out.println("05 Notes - " + notes[8]);
System.out.println("02 Coins - " + notes[9]);
System.out.println("01 Coins - " + notes[10]);

input.close();
}
}
