import java.util.Scanner;

public class UseStaff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.print("Enter the current staff number: ");
        int staffNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter the staff hiring location: ");
        String location = input.nextLine();

        System.out.println();


        //Create Object and print report
        StaffHiring staff = new StaffHiring (staffNumber, location);
        staff.printStaffHiring();

    }
}
