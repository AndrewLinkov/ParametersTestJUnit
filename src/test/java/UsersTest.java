import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UsersTest {

    public void printClientInfo(String firstName, String lastName, int age) {
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", Age: " + age);
    }

    @ParameterizedTest
    @CsvSource({"Иван, Иванов, 35", "Петр, Петров, 42", "Сергей, Сидоров, 28"})
    void testPrintClientInfo(String firstName, String lastName, int age) {
        printClientInfo(firstName, lastName, age);
    }
}
