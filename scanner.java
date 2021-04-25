import java.util.Scanner;
public class scanner{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of minutes");
        int minutes = input.nextInt();
        int years = minutes/525600;
        int days = minutes/60/24%365;
        System.out.println("years is " +years);
        System.out.println("days is " +days);
        System.out.println("minutes is " +minutes);
    }
}
