public class Main {
    public static void main(String[] args) {

        double[] numbers = {8.0, 2.5, -3.0, 4.5, 3.0, 6.5, -7.0, 5.0, -1.5, 7.0, -4.5, 2.0, 3.5, -2.0, 4.0};

        boolean foundNegative = false;

        double sum = 0.0;
        int count = 0;

        for (double num : numbers) {
            if (num < 0) {
                foundNegative = true;
            } else if (foundNegative && num > 0) {
                sum += num;
                count++;
            }
        }

        double average = (count > 0) ? sum / count : 0;

        System.out.println("Средные арифметическое положительное число после первого отрицательного: " + average);
    }
}
