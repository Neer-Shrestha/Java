public class AtmMachine {
    public static void main(String[] args) {
        float balance = 1000;
        float depositeMoney = 100, withdrawMoney = 500;
        int userChoice = 3;
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite Money");
        System.out.println("3. Withdraw Money");
        switch (userChoice) {
            case 1:
                System.out.println(balance);
                break;
            case 2:
                balance += depositeMoney;
                System.out.println(balance);
                break;
            case 3:
                balance -= withdrawMoney;
                System.out.println(balance);
                break;
            default:
                System.out.println("You Input wrong choice.");
        }
    }
}
