
import java.util.Scanner;

public class ATM {

    private Bank bank;
    private Scanner scanner;
    private Account account;
    private boolean proceed = true;

    public ATM(Bank bank) {
        this.bank = bank;
        scanner = new Scanner(System.in);
    }

    public void start(){
        account = getSpecificAccount();
        proceed = true;
        startOperation();
        scanner.close();
    }

    private void startOperation() {

        makeOperation();
        if (proceed) {
            if (repeatOperation())
                startOperation();
        }
    }

    private boolean repeatOperation() {
        System.out.println("Want to make another operation [y/n]");
        scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if (c == 'y' || c == 'Y')
            return true;
        else if (c == 'n' || c == 'N')
            return false;
        System.out.println("Unknown answer , Try again");
        return repeatOperation();
    }


    public Account getSpecificAccount() {

        System.out.println("Enter id Account");
        long idAccount = scanner.nextInt();
        System.out.println("Enter password Account");
        scanner = new Scanner(System.in);
        String passwordAccount = scanner.nextLine()+"ABC";

        Account temporaryAccount = bank.getAccount(idAccount, passwordAccount.hashCode());
        if (temporaryAccount == null) {
            System.out.println("Wrong Data was entered");
            return getSpecificAccount();
        }
        return temporaryAccount;
    }

    public void makeOperation() {
        System.out.println("What operation you want to make?\n" +
                "1.deposit\n" +
                "2.withdraw\n" +
                "3.check balance\n" +
                "4.transfer money\n" +
                "Enter 0 to close");

        int operation = scanner.nextInt();
        switch (operation) {
            case 1 -> makeDeposit();
            case 2 -> makeWithdraw();
            case 3 -> checkBalance();
            case 4 -> makeTransfer();
            case 0 -> proceed = false;
            default -> makeOperation();
        }
        /*
               switch (operation){
                    case 1:
                        makeDeposit();
                        break;
                    case 2:
                        makeWithdraw();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        makeTransfer();
                        break;
                    case 0:
                        proceed =false;
                        break;
                    default:
                        makeOperation();
                }
        */

    }

    private void makeDeposit() {
        System.out.println("How much do you want ot deposit");
        int amount = scanner.nextInt();
        bank.deposit(account, amount);
    }

    private void makeWithdraw() {
        System.out.println("How much do you want ot withdraw");
        int amount = scanner.nextInt();
        // condition ? (true) -> : (false) ->
        String answer = bank.withdraw(account, amount) ? ("You have withdrawn " + amount)
                : ("Money on your account are not enought to withdraw : " + amount);
        System.out.println(answer);
        System.out.println("Do you check your balance? Enter Y/N");
        scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if (c == 'y' || c == 'Y')
            checkBalance();
    }

    private void checkBalance() {
        System.out.println(bank.checkAccount(account));
    }

    private void makeTransfer() {
        Account recipient = getRecipient();
        System.out.println("Enter the amount you want to send to recipient");
        double amount = scanner.nextDouble();
        this.account.withdraw(amount);
        recipient.deposit(amount);
        System.out.println("Nothing");
    }

    private Account getRecipient() {
        System.out.println("Enter the phone number of the recipient");
        scanner = new Scanner(System.in);
        String recipient_number =scanner.nextLine();
        Account recipient = bank.getAccountByPhoneNumber(recipient_number);
        if (recipient == null) {
            System.out.println("Number doesn't exist");
            return getRecipient();
        } else
            return recipient;
    }


}
