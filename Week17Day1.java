/**
 * The driver class for question # in WeekDay, HW # or Exam #.
 * Author: <write your name here>
 * Date: < write the last edit date here>
 */

package Week17Day1;

// import <write your import here>;

public class Week17Day1 {

    public static void main(String[] args) {
        System.out.println("Testing Q2: ");
        Object[] arrayOfNumbers = new Object[5];
        arrayOfNumbers[0] = 12;
        arrayOfNumbers[1] = 12.2;
        arrayOfNumbers[2] = "12.2";

        System.out.println(arrayOfNumbers[0]);
        System.out.println(arrayOfNumbers[2]);

        System.out.println("End testing Q2: \n");

        System.out.println("Testing Q3: ");
        Book aBook1 = new Book(123, "Java", "yan");
        Book aBook2 = new TextBook();
        System.out.println(aBook1.checkOut());
        System.out.println(aBook2.checkOut());
        System.out.println("End testing Q3: \n");

        System.out.println("Testing Q: ");
        System.out.println();
        System.out.println("End testing Q: \n");
    }
}
