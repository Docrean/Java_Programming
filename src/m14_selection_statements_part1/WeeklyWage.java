package m14_selection_statements_part1;

public class WeeklyWage {

    public static void main(String[] args) {

        double wage = 900;
        int hours = 45;


        if (hours > 40){ //condition has to be true in order to execute code block
            wage *= 1.5;
        }

        System.out.println("wage = " + wage);



    }
}
