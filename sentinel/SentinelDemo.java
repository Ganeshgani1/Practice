package sentinel;

import java.util.Scanner;

public class SentinelDemo{

    public static void main(String[] args){
        int number=0;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number or 0 to exit: ");
        number= scanner.nextInt();
        while(number!=0){
            sum= sum+number;
            System.out.println("Enter any number or 0 to exit: "+number);
            number=scanner.nextInt();
        }
        System.out.println("The sum is: "+sum);
    }
}
