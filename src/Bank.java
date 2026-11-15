public class Bank
{
    String bankName;
    int bankCode;
    BankAccount account1;
    BankAccount account2;

    public Bank(int bankCode, String bankName)
    {
        this.bankCode = bankCode;
        this.bankName = bankName;
    }
    public void setAccounts(BankAccount a, BankAccount b)
    {
        this.account1 = a;
        this.account2 = b;
    }

    // 3. החזרת סכום היתרות של שני החשבונות
    public double getTotalBalance()
    {
        double total = 0;
        if (account1 != null)
        {
            total += account1.getBalance();
        }
        if (account2 != null)
        {
            total += account2.getBalance();
        }
        return total;
    }
    public String getBankInfo()
    {
        String info = "Bank: " + bankName + " (Code: " + bankCode + ")\n";
        info += "Account 1: " + (account1 != null ? account1.getAccountInfo() : "None") + "\n";
        info += "Account 2: " + (account2 != null ? account2.getAccountInfo() : "None");
        return info;
    }

    public String getBankName()
    {
        return bankName;
    }
}

