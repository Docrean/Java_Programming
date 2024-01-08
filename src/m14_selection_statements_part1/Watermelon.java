package m14_selection_statements_part1;

public class Watermelon {

    public static void main(String[] args) {

        int number = 40; //true so subsequent code block executed
        boolean isEnough = false;//boolean changes value after 1st block if true
        if (number >= 20){
            System.out.println("I have more than 20 watermelons");
            isEnough = true; //isEnough =====> since executed true boolean changes value
        }
        if (isEnough){ //true
            System.out.println("Good job");
        }
        if (!isEnough){ // !true ===> false as since previous blocks true this won't execute
            System.out.println("I need more watermelon");
        }



    }
}
