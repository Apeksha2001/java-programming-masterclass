/*print even number from 5 to 20.
Also count even and odd number.
Use while loop and isEvenNumber method.
 */

public class whileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int lastNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= lastNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even Number: " + number);
            evenCount++;
        }
        System.out.println("Total odd numbers= " + oddCount);
        System.out.println("Total even number= " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
