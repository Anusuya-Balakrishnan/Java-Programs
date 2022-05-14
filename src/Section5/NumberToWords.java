package Section5;

public class NumberToWords {

    public static void numberToWords(int number) {

        int number1 = reverse(number);
        int number2 = reverse(number);
        int wordsCount = 0;
        int numberCount = getDigitCount(number);
        while (number > 0) {
            int lastdigit = number1 % 10;
            number1 /= 10;
            number /= 10;
            switch (lastdigit) {
                case 0:
                    System.out.print("Zero" + " ");
                    wordsCount++;
                    break;
                case 1:
                    System.out.print("One" + " ");
                    wordsCount++;
                    break;
                case 2:
                    System.out.print("Two" + " ");
                    wordsCount++;
                    break;
                case 3:
                    System.out.print("Three" + " ");
                    wordsCount++;
                    break;
                case 4:
                    System.out.print("Four" + " ");
                    wordsCount++;
                    break;
                case 5:
                    System.out.print("Five" + " ");
                    wordsCount++;
                    break;
                case 6:
                    System.out.print("Six" + " ");
                    wordsCount++;
                    break;
                case 7:
                    System.out.print("Seven" + " ");
                    wordsCount++;
                    break;
                case 8:
                    System.out.print("Eight" + " ");
                    wordsCount++;
                    break;
                case 9:
                    System.out.print("nine" + " ");
                    wordsCount++;
                    break;
            }
        }
        if ((numberCount != wordsCount) && (number1 == 0)) {
            System.out.print("Zero" + " ");
            wordsCount++;
        }
        if (number2 < 0) {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int remnumber = number % 10;
            reverse = reverse * 10 + remnumber;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 1;
        if (number >= 0) {
            while (number > 0) {
                number /= 10;
                if (number != 0) {
                    count++;
                }
            }
            return count;
        }
        return -1;

    }

    public static void main(String[] args) {

        numberToWords(123654);
//        numberToWords(1010);
        //numberToWords(123);
        //numberToWords(-12);

    }
}
