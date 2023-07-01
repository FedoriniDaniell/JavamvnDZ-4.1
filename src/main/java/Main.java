
import org.junit.jupiter.api.Assertions;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int bonus = (int) service.calculate(1000, true);


        long expected = 30;
        boolean isRegistered = true;
        long actual = service.calculate(1000, true);
        Assertions.assertEquals(expected, actual);

        System.out.println("1, " + expected + " ==  ? == " + actual);


        expected = 500;
        isRegistered = true;
        actual = service.calculate(1_000_000, true);
        Assertions.assertEquals(expected, actual);

        System.out.println("2, " + expected + " ==  ? == " + actual);

        expected = 10;
        isRegistered = false;
        actual = service.calculate(1_000, false);
        Assertions.assertEquals(expected, actual);

        System.out.println("3, " + expected + " ==  ? == " + actual);

        expected = 500;
        isRegistered = false;
        actual = service.calculate(1_000_000, false);
        Assertions.assertEquals(expected, actual);

        System.out.println("4, " + expected + " ==  ? == " + actual);

    }

}