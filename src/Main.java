import java.util.Scanner;

/**
 * Created by Lyigezaw on 1/31/2017.
 */
public class Main {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int  input;
        String e = Double.toString(Math.E);

        System.out.println("How many places after the decimal would you like to print for the value of e(0-15): ");
        input = reader.nextInt();
        while(input < 0 || input > 15){
            System.out.println("Sorry, the number is either too high or too low, please select another value: ");
            input = reader.nextInt();
        }
        if(input == 0){
            System.out.print(e.substring(0,1));
        }
        else{
            System.out.print(e.substring(0,2));
        }
        for(int i = 0; i < input; i++){
            System.out.print(e.charAt(2+i));
        }
    }
}
