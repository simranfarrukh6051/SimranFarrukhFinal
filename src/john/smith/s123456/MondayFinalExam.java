package john.smith.s123456;

import java.util.Scanner;

/**
 * Calculate taxes paid per the income
 *
 * @author Haki
 * @modified ?
 * @date ?
 */
public class MondayFinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Ask the user whether tax meant for personal or business
        System.out.println("Please enter the tax for Personal or Business ");
        Scanner scanner1 = new Scanner(System.in);
        String type = scanner1.nextLine();

        // Ask the user for the annual income
        System.out.println("Please enter the income");
        Scanner scanner2 = new Scanner(System.in);
        double income = scanner2.nextDouble();

        //  display the tax rate the person / business should pay
        System.out.println("The tax you have to pay is:");
        double tax = 0;
        if (type.equals("Personal")) {
            tax = calculateTaxForPerson(income);
            System.out.println("Your personal income tax is: $ " + tax);
        } else {
            tax = calculateTaxForBusiness(income);
            System.out.println("Your business income tax is: $ " + tax);
        }

    }

    static double calculateTaxForPerson(double income) {
        if (income < 50000.00) {
            return income * 0.10;
        } else if (income >= 50000 && income < 100000) {
            return income * 0.30;
        } else {
            return income * 0.45;
        }
    }

    static double calculateTaxForBusiness(double income) {
        if (income < 50000.00) {
            return income * 0.05;
        } else if (income >= 50000 && income < 100000) {
            return income * 0.10;
        } else {
            return income * 0.15;
        }
    }

}
