import java.text.DecimalFormat;
import java.util.*;
class Lab3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float currentBalance;
        System.out.print("Current Balance: $");
        currentBalance = sc.nextFloat();
        float APR;
        System.out.print("APR:");
        APR = sc.nextFloat();
        float monthlyRate;
        monthlyRate = APR / 12;
        System.out.println("Monthly percentage rate: "+monthlyRate);
        float minPayment;
        minPayment = (currentBalance * APR / 12);
        minPayment = Math.round(minPayment) / 100f;
        System.out.println("Minimum payment: "+ minPayment);
    }
}
    