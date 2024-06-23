import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the FirstName");
        String Firstname = Sc.next();

        System.out.println("Enter the LastName");
        String Lastname = Sc.next();

        String FullName = Firstname + " " +Lastname;
        System.out.println("The Full Name of the Person is" +" " + FullName);

    }
}
