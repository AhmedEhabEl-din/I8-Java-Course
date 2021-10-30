public class Account {

    private final long id;
    private String username;
    private int password;
    private String number;
    private double balance;

    public Account(long id , String username, int password, String number) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.number = number;

    }

    public long getId(){
        return this.id;
    }
    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if (this.canWithdraw(amount)){
            balance -= amount;
            return true;
        }
        else
            return false;
    }

    public boolean canWithdraw(double no) {
        return this.balance > no;
    }

    public boolean equalsAccounts (Account account){
        return this.id == account.id;
    }

//    public boolean equals(Account account) {
//        if (this.username.equals(account.username) &&
//                this.password.equals(account.password) &&
//                this.number.equals(account.number))
//            return true;
//        return false;
//    }

}
