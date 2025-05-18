public class Main {
    public static final int MIN_VALUE = 90; // задаем min значение диапазона
    public static final int MAX_VALUE = 100; // задаем max значение диапазона

    public static void main(String[] args) {
        // Создаем генератор случайных чисел в диапазоне от 90 до 100 включительно
        for (int r : new Randoms(MIN_VALUE, MAX_VALUE)) {
            System.out.println("Случайное число: " + r);
            // Условие выхода из цикла: остановимся, если выпадет число 100
            if (r == MAX_VALUE) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}