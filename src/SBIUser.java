import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{

    private String name;
    private double balance;
    private String accountNo;
    private String password;
    private double rateOfInterest;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String withdrawMoney(int amount, String givenPassword) {
        if(Objects.equals(givenPassword,password)){
            if(amount > balance){
                return "Insufficient Balance!!";
            }else{
                balance = balance - amount;
                return "Money withdrawn Successfully!!";
            }
        }
        return null;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Yeahhh!!! Money added to your account";
    }

    @Override
    public double calculateInterest(int years) {
        return (balance * years * rateOfInterest)/100;
    }
}
