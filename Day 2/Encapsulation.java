 public class Encapsulation {
 
    static class BankAccount {
        private double balance;
        private String owner;
        private String accountNumber;

        public BankAccount(String owner, String accountNumber, double initialBalance) {
            if (initialBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative.");
            this.owner = owner;
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        }

        public void withdraw(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
            if (amount > balance) throw new IllegalStateException("Insufficient funds.");
            balance -= amount;
            System.out.printf("Withdrew $%.2f. Remaining balance: $%.2f%n", amount, balance);
        }

        public double getBalance() { return balance; }
        public String getOwner()   { return owner; }

        public String getMaskedAccountNumber() {
            return "**** **** " + accountNumber.substring(accountNumber.length() - 4);
        }

        @Override
        public String toString() {
            return String.format("Account [%s] | Owner: %s | Balance: $%.2f",
                    getMaskedAccountNumber(), owner, balance);
        }
    }
 
    static class ATM {
        private BankAccount account;

        public ATM(BankAccount account) { this.account = account; }

        public void showBalance() {
            System.out.printf("Current Balance: $%.2f%n", account.getBalance());
        }

        public void performDeposit(double amount) {
            try {
                account.deposit(amount);
            } catch (IllegalArgumentException e) {
                System.out.println("Deposit failed: " + e.getMessage());
            }
        }

        public void performWithdrawal(double amount) {
            try {
                account.withdraw(amount);
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Withdrawal denied: " + e.getMessage());
            }
        }

        public void showAccountInfo() { System.out.println(account); }
    } 
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", "ACC123456789", 1000.00);
        ATM atm = new ATM(account);

        atm.showAccountInfo();        
        atm.showBalance();            
        atm.performDeposit(500);    
        atm.performWithdrawal(200);   
        atm.performWithdrawal(9999);  
        atm.performDeposit(-50);     
 
    }
}