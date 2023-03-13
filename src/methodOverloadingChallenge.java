public class methodOverloadingChallenge {

    public static void main(String[] args) {
        convertToCentimeters(1);
        convertToCentimeters(5,8);


    }
    public static int convertToCentimeters(int inches){
        double centimeter= inches * 2.54;
        System.out.println(inches+" inch= "+centimeter+" cm");
        return 0;
    }
    public static void convertToCentimeters(int feet,int inches){
        int  convertInch=feet*12;
        int totalHeightInInch=convertInch+inches;
        double heightInCentimeter=totalHeightInInch* 2.54;
        System.out.println(feet+" ft "+inches+" inch = "+heightInCentimeter+" cm");

    }
}
