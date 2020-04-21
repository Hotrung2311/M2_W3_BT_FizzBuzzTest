package fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Chia hết cho 3")
    void Div3() {
        String result = FizzBuzz.fizzBuzz(3);
        String expected = "Fizz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Chia hết cho 5")
    void Div5() {
        String result = FizzBuzz.fizzBuzz(5);
        String expected = "Buzz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Chia hết cho 3 và 5")
    void Div3and5() {
        String result = FizzBuzz.fizzBuzz(15);
        String expected = "FizzBuzz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Không chia hết")
    void Div() {
        String result = FizzBuzz.fizzBuzz(28);
        String expected = "hai tám";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Chứa số 3")
    void contain3() {
        String result = FizzBuzz.fizzBuzz(23);
        String expected = "Fizz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Chứa số 5")
    void contain5() {
        String result = FizzBuzz.fizzBuzz(25);
        String expected = "Buzz";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Đọc số 2 chữ số")
    void readNumber2() {
        String result = FizzBuzz.fizzBuzz(26);
        String expected = "hai sáu";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Đọc số 1 chữ số")
    void readNumber1() {
        String result = FizzBuzz.fizzBuzz(2);
        String expected = "hai";
        assertEquals(result, expected);
    }
}