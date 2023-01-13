public interface BankInterface {

    double checkBalance();
    String withdrawMoney(int amount, String password);
    String addMoney(int amount);
    double calculateInterest(int years);

}
