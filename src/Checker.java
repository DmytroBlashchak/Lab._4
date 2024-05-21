public class Checker {
    public void printOddEven(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("EVEN:" + number);
            } else {
                System.out.println("ODDS:" + number);
            }
        }
    }
    public void reversedNumbers(int[] numbers) {
        int[] reversingArrayElement = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversingArrayElement[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Reversed array:");
        for (int number : reversingArrayElement) {
            System.out.print(number + " ");

        }
    }
    public void reverseOfOdd(int[] numbers) {
        int[] reversingOdds = new int[numbers.length];
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                reversingOdds[index++] = -numbers[i];
            }
        }
        System.out.println();
        System.out.println("Reverse of odds array:");
        for (int i = 0; i < index; i++) {
            System.out.print(reversingOdds[i] + " ");
        }
        System.out.println();
    }
}