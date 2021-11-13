public class Bank {

    private int capacity;
    private int size=0;
    private Account[] accounts;
/*
*  a = [12,35,6,7]
 * a = [12,35,6,7,6,7]
 *
 *
* */
    public Bank (int capacity){
        this.capacity = capacity;
        accounts = new Account[this.capacity];
    }

    public void deposit(Account account,double amount){
           account.deposit(amount);
    }

    public boolean withdraw(Account account,double amount){
        return account.withdraw(amount);
    }

    public double checkAccount(Account account){
       return account.getBalance();
    }

    public boolean addAccount (Account account){
        if (doesThisAccountExist(account))
            return false;
        if (size == capacity){
            expandArray();
        }
            accounts[size] = account;
            size++;
        return true;
    }

    public boolean doesThisAccountExist(Account account){
        for (int i = 0; i <size; i++) {
            if (accounts[i].equalsAccounts(account))
                return true;
        }
        return false;
    }

    public void expandArray(){
        Account[] temporaryArray = new Account[capacity+capacity];
        if (capacity >= 0) System.arraycopy(accounts, 0, temporaryArray, 0, capacity);
        capacity += capacity;
        accounts = temporaryArray;
    }

    public Account getAccount(long idAccount, int passwordAccount) {
        for (int i = 0; i <size ; i++) {
            if (accounts[i].getId() == idAccount && accounts[i].getPassword() == passwordAccount)
                return accounts[i];
        }
        return null;
    }

    public Account getAccountByPhoneNumber(String number){
        for (int i = 0; i <size ; i++) {
            // 46 57 88
            String account_number = String.join("",accounts[i].getNumber().split(" "));
            String temp_number = String.join("",number.split(" "));
            if (account_number.equals(temp_number))
                return accounts[i];
        }
        return null;
    }
}
