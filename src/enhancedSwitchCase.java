public class enhancedSwitchCase {
    public static void main(String[] args) {
        printDayOfWeek(3);
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek=switch (day){
            case 1 ->"Sunday";
            case 2 ->"Monday";
            case 3 ->"Wednesday";
            case 4 ->"Thursday";
            case 5 ->"Friday";
            case 6 ->"Saturday";
            default -> "Invalid day";
        };
        System.out.println(day+" stands for "+dayOfWeek);

    }
}
