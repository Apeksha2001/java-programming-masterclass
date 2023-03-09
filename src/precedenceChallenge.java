public class precedenceChallenge {
    public static void main(String[] args) {
        double firstNumber=20.00;
        double secondNumber=80.00;
        double result=(firstNumber+secondNumber)*100.00;
        double remainder=result % 40.00;
        boolean a;
        if(remainder==0.00)
            a=true;
        else
            a=false;
        System.out.println(a);

    }
}
