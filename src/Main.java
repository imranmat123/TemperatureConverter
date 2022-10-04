import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float fahrenheit;
        float celsius;
        {
            System.out.print("Please Imput your fahrenheit temperature: ");
            Scanner fahrenheitInPut =  new Scanner(System.in);
            fahrenheit = fahrenheitInPut.nextFloat();
            celsius  = ((fahrenheit-32)*5)/9;
            System.out.print("Temperature in celsius is: "+celsius);
        }
    }
}