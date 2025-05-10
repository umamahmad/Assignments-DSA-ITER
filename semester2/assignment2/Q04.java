package semester2.assignment2;

class Deposit
{
    long Principal;
    int Time;
    double Rate;
    double Total_amt;

    Deposit()
    {
        this.Principal = 0;
        this.Time = 0;
        this.Rate = 0.0;
        this.Total_amt = 0.0;
        calc_amt();
    }

    Deposit(long Principal, int Time, double Rate)
    {
        this.Principal = Principal;
        this.Time = Time;
        this.Rate = Rate;
        calc_amt();
    }

    Deposit(long Principal, int Time)
    {
        this.Principal = Principal;
        this.Time = Time;
        Rate = 5.7;
        calc_amt();
    }

    Deposit(long Principal, double Rate)
    {
        this.Principal=Principal;
        this.Rate = Rate;
        Time = 12;
        calc_amt();
    }

    void display()
    {
        System.out.println("Principal: "+Principal);
        System.out.println("Time: "+Time+"years");
        System.out.println("Rate: "+Rate+"%");
        System.out.println("The Total Amount: "+Total_amt+"\n");
    }

    void calc_amt()
    {
        Total_amt = Principal + ((Principal+Rate+Time)/100);
    }
}

public class Q04
{
    public static void main(String[] args)
    {
        Deposit obj = new Deposit();
        obj.display();

        Deposit obj1 = new Deposit(23000,4,8.3);
        obj1.display();

        Deposit obj2 = new Deposit(45000,10);
        obj2.display();

        Deposit obj3 = new Deposit(23500,4.7);
        obj3.display();


    }
}



















