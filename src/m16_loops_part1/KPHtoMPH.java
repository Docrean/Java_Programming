package m16_loops_part1;



        /*
        Print KPH & MPH conversion table like you see on the right side.
        (1 mile = 0.62 kilometer).

            KPH | MPH
         -------------
            20     12
            30     18
            40     24
            50     31
            60     37
            70     43
            80     49
            90     55
            100    62
            110    68
            120    74
            130    80
            140    86
         */



public class KPHtoMPH {

    public static void main(String[] args) {

        System.out.println("KPH\t|\tMPH");
        System.out.println("------------");

        for (int i = 20; i <= 140 ; i += 10) {
            System.out.println(i + "\t|\t" + (i * .62));
        }

        /* OR
            1. Make KPH/MPH variables
                int KPH = 0;
                double MPH = 0.0;

            2. Use variables instead of i * .62 calculation
                 for (int i = 20; i <= 140 ; i += 10) {
                    KPH = i;
                    MPH = kph * 0.62;
            3. Print to console KPH and MPH variables
                    System.out.println(KPH + "\t|\t" + MPH);
         */


    }
}
