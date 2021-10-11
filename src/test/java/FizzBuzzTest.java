import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {  // @Test always public void
        int startNumber = 1;
        int endNumber = 15;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        FizzBuzz fizzBuzzObject = new FizzBuzz(); // creating object of FizzBuzz.java
        String [] actualResult = fizzBuzzObject.fizzbuzz(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
        //Assert.assertNotEquals(expectedResult, actualResult); // negative test, we put wrong data
    }
}
