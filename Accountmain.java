public class Accountmain {
    public static void main(String[] args) {
        Account a=new Account(3,500000);

        a.setAnnualInterestRate(12);
        System.out.println(a.getAnnualInterestRate()+" %");
        System.out.println("Rupee "+a.getBalance());
        System.out.println(a.getDateCreated());
        System.out.println(a.getId());
        System.out.println(a.getMonthlyInterestRate()+" %");
        System.out.println("Rupee "+a.getMonthlyInterest());
        System.out.println("Rupee "+a.deposit(500));
        System.out.println("Rupee "+a.withdraw(500600.));
        System.out.println("21ce105_patelvraj");
    }
}
