public class Main {

/*
* Implement makeTransfer
* Implement default in switch
* */
    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        for (int i = 0; i <100 ; i++) {
            bank.addAccount(
                    new Account(i,"user"+i , (i+"ABC").hashCode() , ("7960 031 0"+i))
            );
        }
        ATM atm = new ATM(bank);
        atm.start();

    }
}
