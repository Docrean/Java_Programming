package m28_string_class_part2;

public class MutableSequenceOfCharacters {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java"); //new keyword to build stringbuilder object
    //no need to import as its from the lam package same as string class imported implicitly


        stringBuilder.append(20); //adds item after ^ Java
                                  //don't reassign as zStringBuilder is MUTABLE

        System.out.println(stringBuilder);

        stringBuilder.reverse();

        System.out.println(stringBuilder);

        String result = stringBuilder.toString();

        System.out.println(result);

        StringBuffer stringBuffer = new StringBuffer("Java");

        stringBuilder.append(" Programming");
        stringBuilder.reverse();
        String result2 = stringBuffer.toString();

    }
}
