/**
 * Created by 708 on 8/31/2018.
 */
public class Finance {
    private double balance;

    public Finance(double amount){
        this.balance = 0;
    }

    public void earnMoney(double amount){
        if(amount>=0) {
            this.balance += amount;
        }
    }

    public void payMoney(double amount){
            this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }


}
