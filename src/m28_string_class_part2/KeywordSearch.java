package m28_string_class_part2;

public class KeywordSearch {

    public static void main(String[] args) { //test the custom method by creating the main method

        String text = "Code without tests is broken by design."; //call the method (provide 2 arguments text and keyword
        String keyword = "DESIGN"; //custom method called here and is ignored with keyword.toLowerCase

        boolean r = containsKeyword(text, keyword);

        System.out.println(r);

        String result = "    "; //false if at least one space. true if no space "" and empty.

        System.out.println(result.isEmpty()); //false
        System.out.println(result.isBlank()); //true
    }
    public static boolean containsKeyword(String text, String keyword) {
        text = text.toLowerCase(); //reset the variable text if string text is UPPER CASE now converted to lower
        keyword.toLowerCase(); //IF THESE ARE NOT GIVEN THAN CONSOLE PRINTS FALSE(DESIGN IS

       return text.contains(keyword); //returns boolean true or false

        //return text.toLowerCase().contains(keyword.toLowerCase()); //Optimized version calling text.TolowerCase then
                                                                     //the contains keyword to lowerCase.
    }

}
