package semester2.assignment2;

class Bank {
    protected String bankName;
    protected double depositAmount;
    static protected double totalAmount=0;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void setAmount(double depositAmount) {
        if (depositAmount >= 1000) {
            this.depositAmount = depositAmount;
            Bank.totalAmount += depositAmount;
        }
        else
            System.out.println("Minimum deposit should be Rs 1000.");
    }

    void showData() {
        System.out.println("Bank: " + bankName + ", Deposit: " + depositAmount);
    }

    double getDepositAmount() {
        return depositAmount;
    }

    String getBankName() {
        return bankName;
    }
}

public class HAQ13 {
    public static void main(String[] args) {
        Bank [] b = new Bank[5];

        String []names = {"HDFC", "ICICI", "SBI", "AXIS", "BOB"};
        double []deposits = {2596.3, 9632.4, 1785.2, 2365.14, 7896.1};

        for (int i=0; i<5; i++){
            b[i] = new Bank();
            b[i].setBankName(names[i]);
            b[i].setAmount(deposits[i]);
        }


        System.out.println("Bank details: ");
        for(Bank bank: b) {
            bank.showData();
        }

        System.out.println("Total Amount Deposited: "+Bank.totalAmount);

        double min = b[0].getDepositAmount();
        String minBank = b[0].getBankName();

        for (int i=1; i<b.length; i++) {
            if (b[i].getDepositAmount() < min) {
                min = b[i].getDepositAmount();
                minBank = b[i].getBankName();
            }
        }
        System.out.println("Bank with minimum deposit: "+minBank);
    }
}

/*
Bank details:
Bank: HDFC, Deposit: 2596.3
Bank: ICICI, Deposit: 9632.4
Bank: SBI, Deposit: 1785.2
Bank: AXIS, Deposit: 2365.14
Bank: BOB, Deposit: 7896.1
Total Amount Deposited: 24275.14
Bank with minimum deposit: SBI
 */