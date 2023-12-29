package day02_escapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello Students\nToday we have Java Class");

        System.out.println("------------------");

        System.out.println("\tJava Programming language");
        System.out.println("\t\tI love Java");

        System.out.println("-----------------");
        System.out.println("\\");

        System.out.println("-----------");

        System.out.println("My favorite TV show is \"Scooby Doo\"");

        System.out.println("\"");

    }

}

/*
 1. \n: New Line: moves cursor to next line for subsequent printing
 2. \t: tab: moves cursor to skip over to next tab stop
 3. \\: BackSlash: causes a backslash to be printed (need two since one is reserved in java language)
 4. \": double quote: causes a double quotation mark to be printed
 5. \': single quote: causes a single quotation mark to be printed (used in char data type)
 6. \b: backspace: moves cursor to back up, or move left, one position
 7. \r: Return: moves cursor to the beginning of the current line, not the next line
*/