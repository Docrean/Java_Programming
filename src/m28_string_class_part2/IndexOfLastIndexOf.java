package m28_string_class_part2;

public class IndexOfLastIndexOf {

    public static void main(String[] args) {
                //    0123456789......
        String str = "Java Programming Language";

      int indexOfFirsta = str.indexOf("a"); //str.indexof stored into int indexOfFirsta variable

        System.out.println("indexOfFirsta = " + indexOfFirsta);

        int indexOfSecondA = str.indexOf("a Programming"); //write a P or a Programming since first time occurrence this in string.
                                                 //will return next index number of a starting from first occurrence a P
        System.out.println("indexOfSecondA = " + indexOfSecondA);

        int indexOfThirdA = str.indexOf("a", 4);//look for third a but start from position after first 2 a's

        System.out.println("indexOfThirdA = " + indexOfThirdA);

        int indexofFourthA = str.indexOf("a", indexOfThirdA + 1); //look for fourth a but start from position after third a (concat + 1)
                                                                                //+ 1 means after index of third a
        System.out.println("indexofFourthA = " + indexofFourthA);

        int indexofLastA = str.lastIndexOf("a");

        System.out.println("indexofLastA = " + indexofLastA); //index of last A.
    }
}
