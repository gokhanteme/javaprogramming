package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 65 ,
            weeklHours = 40;

        double stateTaxRate = 0,
               federalTaxRate = 26.2;

 //-------------------------------------

         int salaryBeforeTax = hourlyRate * weeklHours * 52;

         double stateTax = salaryBeforeTax * stateTaxRate / 100;
         double federalTax = salaryBeforeTax * federalTaxRate / 100;
         double totalTax = stateTax + federalTax;
         double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $ " + salaryBeforeTax);
        System.out.println("State tax = $ " + stateTax);
        System.out.println("Federal tax = $ "+federalTax);
        System.out.println("totalTax = $  " + totalTax);
        System.out.println("Net income = $ "+ salaryAfterTax);
        }
    }

