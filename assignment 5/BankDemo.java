/*  create a class Bank account As a abstract class From that abstract class Derive a child class  Saving account & Current account
 there are following four methods
 1) Give details
 2) Deposit 
 3) Withdrawal
 4) Check Balance   */

 abstract class BankAccount {
    void getDetails() {
        System.out.println("Details of user: Name, Account");
    }

    abstract void deposit();
    abstract void withdrawal();

    void checkBalance() {
        System.out.println("Balance checked...");
    }
}

class Current extends BankAccount {
    void deposit() {
        System.out.println("50000 deposited in Current account");
    }

    void withdrawal() {
        System.out.println("10000 credited from Current account");
    }
}

class Saving extends BankAccount {
    void deposit() {
        System.out.println("9000 deposited in Saving account");
    }

    void withdrawal() {
        System.out.println("200 credited from Saving account");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount c = new Current();
        c.getDetails();
        c.deposit();
        c.withdrawal();
        c.checkBalance();

        System.out.println("----------------------");

        BankAccount s = new Saving();
        s.getDetails();
        s.deposit();
        s.withdrawal();
        s.checkBalance();
    }
}


