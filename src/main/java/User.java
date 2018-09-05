import java.util.ArrayList;
import java.util.List;

/**
 * Created by 708 on 8/31/2018.
 */
public class User {
    private String name;
    private Finance finance;
    protected List<Double> financeList;
    protected List<String> note;

    public User(String name, double amount){
        this.name = name;
        finance = new Finance(amount);
        financeList = new ArrayList<Double>();
        note = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void addMoney(double amount, String n){
        finance.earnMoney(amount);
        financeList.add(amount);
        note.add(n);
    }
    public void spendMoney(double amount, String n){
        finance.payMoney(amount);
        financeList.add(amount);
        this.note.add(n);
    }

    public double showBalance(){
        return finance.getBalance();
    }

    public List getFinanceList() {
        return financeList;
    }

}
