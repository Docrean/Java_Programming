package day05_operators;

public class salaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 55,
                weeklyHours = 46;

        double stateTaxRate = 7.5; //implicitly done since taxRate is a % so just write the integer
                        // 55 or 45 or 5.5 or 4.5 (integer or dec) int-->double implicitly OK.
                        // Double is LARGEST PRIM TYPE. accepts ANY smaller PRIM.
                        // Double to Double..NO NEED OF CAST...INT--->DOUBLE....CASTED
                                  //double stateTaxRate = 7 (given as int but really 7.0%)
        double federalTaxRate = 24.5;
                                //Just 24 if int CAST IMPLICIT

        //---------------------------------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
                                /*
                                * if 5.5 * 45-->can't change original variable hourlyRate/weeklyHours
                                * always cast the variables (containers of the 5.5 and 45 in this case)
                                */

        double stateTax = salaryBeforeTax * stateTaxRate / 100;
                                //no one makes 100k and pays 700k in tax
                                //convert decimal so / 100

        double federalTax = salaryBeforeTax * federalTaxRate / 100;
                                //convert decimal so / 100

        double totalTax = stateTax + federalTax;
                                //both are double so use double

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
                                //salaryBeforeTax appended to string
        System.out.println("Federal tax is: $" + federalTax);
                                //federalTax appended to string
        System.out.println("State tax is: $" + stateTax);
                                //stateTax appended to string
        System.out.println("Total tax is: $" + totalTax);

        System.out.println("Net income is: $" + salaryAfterTax);
                    //COMPILED WITH MULTIPLE STRINGS
        System.out.println("----------------------------------------");

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\nfederal tax is: $" + federalTax +
                "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax +
                "\nNet income is: $" + salaryAfterTax);
                    //COMPILED WITH ONE STRING


    }
}


/*
1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: $79560

 */