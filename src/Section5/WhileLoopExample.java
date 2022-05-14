package Section5;

public class WhileLoopExample {

    public static void main(String[] args) {
        int count = 1;
        int number = 4, finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number" + number);
            if (count == 5) {
                break;
            }
            count++;
        }
    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
