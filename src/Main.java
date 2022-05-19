

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue +1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN Value = " + myMinByteValue);
        System.out.println("Byte MAX Value = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIN Value = " + myMinShortValue);
        System.out.println("Short MAX Value = " + myMaxShortValue);

        //The "L" indicates long value
        long myLongValue = 2147483647234L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MIN Value = " + myMinLongValue);
        System.out.println("Long MAX Value = " + myMaxLongValue);
        System.out.println(myLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //Casting (explicitly state the data types)
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        //Primitive Types Challenge
        byte byteNum = (byte) (93);
        short shortNum = (6704);
        int intNum = (487582);
        long challengeTotal = (50000 + (10 * (byteNum + shortNum + intNum)));

        System.out.println(challengeTotal);

    }
}
