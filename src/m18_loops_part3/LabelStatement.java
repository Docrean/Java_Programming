package m18_loops_part3;

public class LabelStatement {

    public static void main(String[] args) {
        outer:
        for (int j = 1; j < 6; j++) {
            System.out.print(j + " : ");  //line numbers
            inner:
            for (char i = 'A'; i < 'E' ; i++) { //what if want to create 5 more times? Create another loop
               if (j == 3){
                   break; //if want break to terminate outer loop (default break but can put break outer)
               }                        //1 : A B C D
                                        //2 : A B C D
                                        //3 :
                                //if want break to terminate inner loop (inner)
                                        //1 : A B C D
                                        //2 : A B C D
                                        //3 :
                                        //4 : A B C D
                                        //5 : A B C D
                System.out.print(i + " ");      //and place this loop inside that body
            }
            System.out.println(); //new line after each iteration of outer loop
        }


    }
}
