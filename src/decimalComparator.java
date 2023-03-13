/*
DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
 Otherwise, return false.
 */
public class decimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = (int) (firstNumber * 1000);
        secondNumber = (int) (secondNumber * 1000);
        if (firstNumber == secondNumber) {
            return true;
        } else {
            return false;
        }
    }

}

