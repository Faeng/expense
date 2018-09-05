import static org.junit.jupiter.api.Assertions.*;

class UnitTestUser {

    User userFin;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        userFin = new User("Kaofang",0);
    }

    @org.junit.jupiter.api.Test
    void getNameTestMethod() {
        assertEquals("Kaofang",userFin.getName());
    }

    @org.junit.jupiter.api.Test
    void addMoneyMethodTesting() {
        userFin.addMoney(300,"from daddy.");
        assertEquals(300,userFin.showBalance());
        userFin.addMoney(500,"from mommy.");
        userFin.addMoney(600,"from sister.");
        assertEquals(1400.00,userFin.showBalance());
    }

    @org.junit.jupiter.api.Test
    void spendMoneyTestMethod() {
        userFin.addMoney(500,"from daddy.");
        userFin.spendMoney(-400,"buy a doll");
        assertEquals(100,userFin.showBalance());
    }

    @org.junit.jupiter.api.Test
    void showBalanceTestMethod() {
        assertEquals(0,userFin.showBalance());
        userFin.addMoney(500.00,"from my boyfriend.");
        assertEquals(500,userFin.showBalance());
        userFin.spendMoney(-300.00,"Buy flowers.");
        assertEquals(200,userFin.showBalance());
    }
}