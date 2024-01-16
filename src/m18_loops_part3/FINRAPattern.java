package m18_loops_part3;

public class FINRAPattern {

    public static void main(String[] args) {

        /*
        write a program (using "do-while" loop) that generates and prints the FINRA pattern up to
        a give number. FINRA pattern is a sequence of numbers where certain numbers are replaced
        with specific words. The pattern follows these rules:

            -Numbers divisible by 3 are replaced with "FIN"
            --Numbers divisible by 5 are replaced with "RA"
            ---Numbers divisible by both 3 and 5 are replaced with "FINRA"
            All other numbers remained unchanged

            example: 20
            Output: 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA
         */

        int n = 20; //1. given number to execute up to
        int number = 1; //2. represents numbers to print 1 by 1 starting from 1
            //3. Using do-while loop in this case

        do {
            if (number % 3 == 0 && number % 5 == 0) { //5. ---replace with FINRA condition
                System.out.print("FINRA ");
            } else if (number % 3 ==0){  //6. -replace with FIN condition
                System.out.print("FIN ");
            } else if (number % 5 ==0){  //7. --replace with RA condition
                System.out.print("RA ");
            } else {
                System.out.print(number + " ");
            } number++; //8. WILL RUN INFINITE WITHOUT INCREMENT BECAUSE WILL NOT increment to 20 to = false
        } while(number <= n);     //4. set condition of the while (printing up to <= 20)
                                        //going to run up until condition is false (do while will run
                                        //through once even if condition is false and then will check
                                        //condition and if false will not run the second time. if false
                                         //in beginning of while loop it will not run. DO WHILE and WHILE DIFFERENCE
    }
}
