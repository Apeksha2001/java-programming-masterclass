/*Write a method hasEqualSum with 3 parameters of type int.
 The method should return boolean and it needs to return true if the sum of the first and second parameter
 is equal to the third parameter. Otherwise, return false.

*/
public class equalSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber + secondNumber) == thirdNumber) {
            return true;
        } else {
            return false;
        }
    }

}
