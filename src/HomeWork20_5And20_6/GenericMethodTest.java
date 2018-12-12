package HomeWork20_5And20_6;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringsArray = {"One", "Two", "Three"
                , "Four", "Five", "Six", "Seven", "Eight"};
        System.out.print("Array of integer contains: ");
        printArray(intArray, 0, 3);
        System.out.print("Array of double contains: ");
        printArray(doubleArray, 2, 4);
        System.out.print("Array of characters contains: ");
        printArray(charArray, 3, 5);
        System.out.println("Array of string contain: ");
        printArray(stringsArray);
    }

    public static <T> void printArray(T[] inputArray) {
        for (T i : inputArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static <T> void printArray(T[] inputArray, int lowSubscrip, int highSubscrip) {

        try {
            if (lowSubscrip < 0 || lowSubscrip > inputArray.length ||
                    highSubscrip < 0 || highSubscrip > inputArray.length)
                throw new InvalidSubscriptException();
        } catch (InvalidSubscriptException e) {
            e.printStackTrace();
        }

        for (int i = lowSubscrip; i < highSubscrip; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    //Exercise 20.6
    public static void printArray(String[] inputArray) {
        int count = 0;
        for (String i : inputArray) {
            System.out.print(i + "  ");
            count++;
            if (count % 4 == 0) {
                System.out.println();
            }
        }
    }
}
