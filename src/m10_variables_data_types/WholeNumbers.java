package m10_variables_data_types;

public class WholeNumbers {

    public static void main(String[] args) {

        // DataType variableName = Data (has to match with data type)

        byte maxByte = 127;//don't have to remember the maxByte value...just use the variable
        short maxShort = 32_767;//can use underscore as comma for big numbers
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;//add L at end to signify long number or else error

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

    }

}
