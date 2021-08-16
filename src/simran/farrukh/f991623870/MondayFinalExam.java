package simran.farrukh.f991623870;

import java.util.Scanner;
import simran.farrukh.f991623870.NewEnum;

/**
 * Calculate taxes paid per the income
 *
 * @author Haki
 * @author Simran
 * @modified 991623870
 * @date 8/16/2021
 */
public class MondayFinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // If you see code below related to taxation, means you are on monday branch

        // if you see code below means you are on monday branch
        // 1. Ask the user whether tax meant for personal or business
        System.out.println("Please enter the tax for taxing type ");
        Scanner scanner1 = new Scanner(System.in);
        String type = scanner1.nextLine();

        // Ask the user for the annual income
        System.out.println("Please enter the income");
        Scanner scanner2 = new Scanner(System.in);
        double income = scanner2.nextDouble();

        //  display the tax rate the person / business should pay
        System.out.println("The tax you have to pay is:");
        double tax = 0;
        if (type.equals(NewEnum.PERSONAL.getEnum())) {
            tax = calculateTaxForPerson(income);
            System.out.println("Your personal income tax is: $ " + tax);
        } else if (type.equals(NewEnum.BUSINESS.getEnum())){
            tax = calculateTaxForBusiness(income);
            System.out.println("Your business income tax is: $ " + tax);
        } else{
                tax = calculateTaxForFamilyTax(income);
            System.out.println("Your family tax income tax is: $ " + tax);
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
    
    static double calculateTaxForFamilyTax(double income) {
        if (income < 80000.00) {
            return income * 0.08;
        } else if (income >= 80000 && income < 120000) {
            return income * 0.23;
        } else {
            return income * 0.37;
        }

    }

}
