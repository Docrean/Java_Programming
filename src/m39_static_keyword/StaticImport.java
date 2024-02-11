package m39_static_keyword;

import static java.lang.Math.*; //wildcard * imports all static members. use static to import only some from math class...
                               //use . operator after Math. intellij will show list of all operators.
                               //once the static method is imported, in order to use that method, no longer need to use
                                //the class name to import to access the static method. the static method is still from
                                //the math class. in order to use the max method in the static import class now can just
                                //call the method name itself because the static import is already used to import this
                                //method only. * wildcard symbol allows for import of all math class operators at any
                                //given time.
public class StaticImport {

    public static void main(String[] args) {

        int num1 = 5, num2 = 20;
        int nums = max(num1, num2); //allows for max method argument import. assign int to new variable nums

        System.out.println(nums);

        double r = 3.5; //need the power and pi math class. can either write individual import statics for each
                        //or just use the * wildcard symbol so all math class imports can be accessed at same ti
        // double area = pow(r, 2) * PI; //square of radius to power of 2.
        double area =round(pow(r, 2) * PI); //rounded


        System.out.println(area);
    }
}
