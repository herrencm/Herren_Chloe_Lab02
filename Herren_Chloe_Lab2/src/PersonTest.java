import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void fullName() {
        Person person = new Person("000001", "John", "Doe", "Mr.", 1984);
        assertEquals("John Doe", person.fullName());
    }

    @Test
    void formalName() {
        Person person = new Person("000001", "John", "Doe", "Mr.", 1984);
        assertEquals("Mr. John Doe", person.formalName());
    }
    @Test
    void getAge() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1984);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        assertEquals(currentYear - 1984, person.getAge());
    }

    @Test
    void getAgeForYear() {
        Person person = new Person("John", "Doe", "001", "Mr.", 1984);
        assertEquals(39, person.getAge(2023));
    }
}