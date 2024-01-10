package m16_loops_part1;


/*
       Print square of numbers which starts from 1 and ends at 10 as belo:

           num   |  num2
           -------------
           1     |     1
           2     |     4
           3     |     9
           4     |     16
           5     |     25
           6     |     36
           7     |     49
           8     |     64
           9     |     81
           10    |     100


        */
public class PrintSquareOfNumbers {

    public static void main(String[] args) {

        System.out.println("num\t|\tnum2"); //use \t to match indent instead of "    "
        System.out.println("------------");

        for (int num = 1; num <= 10; num++) {
            System.out.println(num + "\t|\t" + (num * num)); //concat with same indents then
                                                             //multiple by square same number in ( )
                                                             //so rest left side not affected
        }




    }
}
