import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UsersTest {

    public void printClientInfo(String firstName, String lastName, int age) {
        System.out.println("���: " + firstName + ", �������: " + lastName + ", Age: " + age);
    }

    @ParameterizedTest
    @CsvSource({"����, ������, 35", "����, ������, 42", "������, �������, 28"})
    void testPrintClientInfo(String firstName, String lastName, int age) {
        printClientInfo(firstName, lastName, age);
    }
}
