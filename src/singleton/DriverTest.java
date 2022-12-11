package singleton;

public class DriverTest {
    public static void main(String[] args) {

        Driver driver1 = Driver.getDriver();
        Driver driver2 = Driver.getDriver();
        Driver driver3 = Driver.getDriver();
        Driver driver4 = Driver.getDriver();

        System.out.println(driver1); //singleton.Driver@1540e19d
        System.out.println(driver2); //singleton.Driver@1540e19d
        System.out.println(driver3); //singleton.Driver@1540e19d
        System.out.println(driver4); //singleton.Driver@1540e19d
    }
}
