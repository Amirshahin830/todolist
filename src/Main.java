import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = cin.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = cin.nextInt();
        double sum;
        sum = (double) num1 / num2;
        System.out.printf("Final number is : %.3f" , sum );
    }
}