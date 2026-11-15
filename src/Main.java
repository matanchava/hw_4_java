//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount("מתן חבקוק", 1000.0);
        BankAccount acc2 = new BankAccount("גיא איסקוב", 500.0);

        System.out.println(acc1.getAccountId());
        System.out.println(acc2.getAccountId());

        acc1.deposit(500.0);
        acc2.withdraw(200.0);
        acc1.transferTo(acc2, 300.0);

        acc1.withdraw(99999.0);
        System.out.println(acc1.getBalance());

        System.out.println(acc1.getAccountInfo());
        System.out.println(acc2.getAccountInfo());

        System.out.println(BankAccount.getTotalAccounts());

        System.out.println(BankAccount.getNextId());
        BankAccount acc3 = new BankAccount("אור הבטלן");
        System.out.println(acc3.getAccountId());

        acc3.deposit(-50.0);
        acc3.transferTo(acc3, 10.0);

        Bank myBank = new Bank(10, "Leumi");
        myBank.setAccounts(acc1, acc2);
        System.out.println(myBank.getBankInfo());
        System.out.println(myBank.getTotalBalance());
    }
}