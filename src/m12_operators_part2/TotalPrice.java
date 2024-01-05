package m12_operators_part2;

public class TotalPrice {

    public static void main(String[] args) {

        /*
        Given an items price (with tax) and quantity, write a program to calculate total
        price of any item using shorthand assignment operators.
        Ex:
        Input:
        price = 20.5
        quantity = 4
        Output:
        price = 82.0
         */

        double price = 20.5;
        int quantity = 4;
        price *= quantity;
        System.out.println("price = $" + price);

    }
}
