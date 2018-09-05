import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.BeforeEach;

public class StepDefUser {
    User userFin;

    @Before
    public void init(){
        userFin = new User("Faeng",0); }

    @Given("I add (\\d+) baht to the account")
    public void I_add_baht_to_the_account(double d){userFin.addMoney(d,"");}

    @Given("I add (\\d+) baht and I add (\\d+) baht to the account")
    public void I_add_baht_and_I_add_baht_to_the_account(double d,double d1){
        userFin.addMoney(d,"");
        userFin.addMoney(d1,"");
    }

    @Given("I spend money (\\d+) baht$")
    public void I_spend_money_baht(double d){userFin.spendMoney(d,"");}

    @Given("I spend money (\\d+) baht and I spend money (\\d+) baht$")
    public void I_spend_money_baht_and_I_spend_money_baht(double s, double s1){
        userFin.spendMoney(s,"");
        userFin.spendMoney(s1,"");
    }

    @When("the balance is (\\d+) baht")
    public void the_balance_is_baht(double d){userFin.addMoney(d,"");}

    @Then("my balance is (\\d+) baht")
    public void my_balance_is_baht(double d){
        userFin.showBalance();
    }


}
