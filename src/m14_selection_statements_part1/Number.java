package m14_selection_statements_part1;

public class Number {

    public static void main(String[] args) {

        int num = 0;

        if (num > 0){
            System.out.println("Number is positive"); //Benefit of multi branch-if first is true,
        } else if (num < 0){                          //else if and else conditions not checked
            System.out.println("Number is negative"); //remaining blocks terminated immediately
        } else {                                      //only first block executed afterward
            System.out.println("Number is zero");     //can give as many else if blocks before else
        }                                             //depending on how many conditions

    }
}
        /* Written as Single ifs (each condition evaluated...not as efficient)

        if (number > 0){ // true
            System.out.println("Positive");
        } if (number < 0){
            System.out.println("Negative");
        } if (number ==0){
            System.out.println("Zero");
        }


         */