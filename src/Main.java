import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");

        //creating a user
        String name = sc.next();

        System.out.println("Enter password ");
        String password = sc.next();

        System.out.println("Enter initial balance");
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name,password, balance);

        System.out.println("Your account is created and Your account number is " + user.getAccountNo());

        //adding money
        System.out.println("Enter the money you want to add");
        int addmoney = sc.nextInt();
        String message = user.addMoney(addmoney);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter amount to withdraw");
        int money = sc.nextInt();   //taking input from user
        System.out.println("Enter password");
        String pass = sc.next();
        System.out.println(money +" " + user.withdrawMoney(money,pass));


        // calculate interest
        System.out.println("Interest calculated for " + user.getBalance() + " is " + user.calculateInterest(10));


        System.out.println("Made a change in code");
    }
}