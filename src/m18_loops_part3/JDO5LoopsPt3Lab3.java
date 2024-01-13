package m18_loops_part3;

import java.util.zip.ZipFile;

public class JDO5LoopsPt3Lab3 {

    public static void main(String[] args) {
        //1. What is the output of the code?
        //iterators given since while loop provided
        int x = 3; //1. x = 3  //6. repeat cycle until i < 3
        int i = 0; //2. i = 0

        while(i < 3) { //3. i < 3 true (0) so move to conditions
            x += 1;     //4. x +1 increment to 4
            i += 1;     //5. i +1 increment to 1
        }

        System.out.println(x); //7. i incremented to i < 3 so false.
                               //8. x incremented to 6 final value (ANSWER)



        //2. What is output of the code?

        int start = 1;
        int sum = 0;

        do {
            if (start % 2 == 0) {
                start++;
            }
            sum += start;
        }  while(++start <= 10);

        System.out.println(sum);

            //Sum is 36. Debug for answer

        int y = 20;

        while(y > 0) {
            do {
                y -= 2;
            } while(y > 5);
        }
        y--;

        System.out.println(y);

        //y is -1. Debug for answer


        int c = 0;
        boolean flag = true;
        for (int j = 0; j < 8; j++) {
            while(flag) {
                c++;
                if(j > c || c > 3) {
                    flag = false;
                }
            }
        }
        System.out.println(c);

        //C is 4. Debug for answer
    }
}
