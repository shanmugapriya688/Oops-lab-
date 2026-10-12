```java
import java.util.Scanner;

class HealthInsurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double treatmentCost, coverage, claimAmount, balance;

        System.out.println("HEALTH INSURANCE CLAIM CALCULATOR");

        System.out.print("Enter Treatment Cost: Rs. ");
        treatmentCost = sc.nextDouble();

        System.out.print("Enter Insurance Coverage Percentage: ");
        coverage = sc.nextDouble();

        claimAmount = treatmentCost * coverage / 100;
        balance = treatmentCost - claimAmount;

        System.out.println("\n----- CLAIM DETAILS -----");
        System.out.println("Treatment Cost: Rs. " + treatmentCost);
        System.out.println("Coverage Percentage: " + coverage + "%");
        System.out.println("Insurance Claim Amount: Rs. " + claimAmount);
        System.out.println("Remaining Balance: Rs. " + balance);

        sc.close();
    }
}
```
