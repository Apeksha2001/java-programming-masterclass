/*create for loop;
Sum all the numbers that can be divided by both 3 and 5.
print out the number that have meet the above condition.
Break out of loop once you have found 5 numbers that meet the condition.
 */

public class forLoopChallenge {
    public static void main(String[] args) {
        int sum=0,counter=0;
        for(int i=1;i<=1000 ;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Number that can be divided by both 3 and 5 is:"+i);
                sum=sum+i;
                counter++;
                if(counter==5){
                    break;
                }
            }
        }
        System.out.println("Sum of number: "+sum);
    }
}
