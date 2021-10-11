import java.util.Arrays;

public class FizzBuzz {

    // String because the code should return words
public String[] fizzbuzz(int startNumber, int endNumber) {
    String [] numbers = new String [endNumber -startNumber + 1];
    int newNumber = startNumber;

    for (int i = startNumber - startNumber; i < (endNumber - startNumber + 1); i++) { // startNumber - startNumber gives 0
        if (newNumber % 15 == 0) {  // 15 = 3 * 5
            numbers[i] = "FizzBuzz";
        } else if (newNumber % 3 == 0) {
            numbers[i] = "Fizz";
        } else if (newNumber % 5 == 0) {
            numbers[i] = "Buzz";
        } else {
            numbers[i] = String.valueOf(newNumber); // числа в виде стрингов складываются в массив
        }

        newNumber += 1;
        System.out.println(Arrays.toString(numbers));
    }
    return numbers;


}
}
