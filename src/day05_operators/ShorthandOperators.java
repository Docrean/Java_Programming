package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println( a ); //20
                        //both give 20 as 20 is last assigned value
                        //JAVA EXECUTES TOP TO BOTTOM
        System.out.println( a ); //20

        a = 40; //before this line a = 20
                //after this line a = 40

        System.out.println(a);

        a = 90;

        System.out.println(a);

        System.out.println("-------------------------------------------------");

        double balance = 100;

        balance += 1000;  //balance = 100 + 1000 (balance is reassigned (+=) to new value of adding 1000)

        System.out.println("balance = " + balance);

        balance += 500;  // balance = 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;

        System.out.println("balance = " + balance);

        balance -= 1000; // balance = 11600 - 1000

        System.out.println("balance = " + balance);

        balance -= 5000;

        System.out.println("balance = " + balance);

        int number = 100;

        number *= 3;

        System.out.println(number);

        double eth = 4;

        eth *= 250;

        System.out.println("eth = " + eth);

        int expense = 10000;

        expense /= 2;

        System.out.println(expense);

        int amount = 100;

        amount %= 28;

        System.out.println(amount);

        double salary = 45000;

        salary /= 2;

        System.out.println("salary = " + salary);

        System.out.println("------------------------------");

        int b = 39;

        b %= 7; // b = 39 % 7
                    // so 39 / 7 = 5.574...
                        //--->so 39 - (7 * 5)
                        //--->so 39 - 35 = 4
        System.out.println(b);


    }
}
