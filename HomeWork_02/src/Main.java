package HomeWork_02;

/*
 * Закончить разработку паттерна Фабричный метод
 */

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new HomeWork_02.GoldGenerator();
        generator.openRewgard();
        generator = new SilverGenerator();
        generator.openRewgard();
    }
}