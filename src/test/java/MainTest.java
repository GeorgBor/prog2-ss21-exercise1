import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeAll
    static void init() {
    }

    @BeforeEach
    void setUp() {
    }


    @Test
    void validPasswordless8Sign() {
        TestPassword checkPWD = new TestPassword();
        boolean actual = checkPWD.checkPassword("Hellowo");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void validPasswordMoreThan25Signs() {
        TestPassword checkPWD = new TestPassword();
        boolean actual = checkPWD.checkPassword("Helloworld12!Helloworld12!Helloworld12!");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void validPasswordWithLowerCase(){
        TestPassword checkPWD = new TestPassword();
        boolean actual = checkPWD.checkPassword("helloworld1357!");
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    void validPasswordWithUpperCase(){
        TestPassword checkPWD = new TestPassword();
        boolean actual = checkPWD.checkPassword("HELLOWORLD1357!");
        boolean expected = false;
        assertEquals(expected,actual);
    }




    @Test
    void validCorrectPassword(){
        TestPassword checkPWD = new TestPassword();
        boolean actual = checkPWD.checkPassword("HelloWorld135@!?#");
        boolean expected = true;
        assertEquals(expected, actual);
    }


}
