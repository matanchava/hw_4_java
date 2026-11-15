public class BankAccount
{
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive;
    private static int nextId = 1;
    private static int totalAccounts = 0;

    BankAccount(String ownerName)
    {
        this.ownerName = ownerName;
        this.balance = 0;
        this.accountId = nextId++;
        this.isActive = true;
    }
    BankAccount(String ownerName, double Balance)
    {
        this.ownerName = ownerName;
        this.balance = Balance;
        this.accountId = nextId++;
        this.isActive = true;
    }

    public boolean deposit(double amount)
    {
        if (isActive && isValidAmount(amount))
        {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount)
    {
        if(isActive && isValidAmount(amount) && amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(BankAccount destination , double amount)
    {
        if(isValidAmount(amount) && isActive && amount <= balance && destination != null)
        {
            if (destination.deposit(amount) == true)
            {
                balance -= amount;
                return true;
            }
            else return false;
        }
        return false;
    }

    public boolean closeAccount()
    {
        if (isActive)
        {
            isActive = false;
            balance = 0;
            return true;
        }
        return false;
    }

    public String getAccountInfo()
    {
        return "Account ID: " + accountId + ", Owner: " + ownerName +
                ", Balance: " + balance + ", Active: " + isActive;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }


    public void setOwnerName(String ownerName) {
        if (ownerName == null)
            return;
        this.ownerName = ownerName;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    public static int getNextId() {
        return nextId;
    }
}
