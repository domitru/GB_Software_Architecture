public class Main {
    public static void main(String[] args) {
        // Создание генератора сундуков с золотом
        ItemFabric generator = new GoldGenerator();
        generator.openRewgard();

        // Создание генератора сундуков с серебром
        generator = new SilverGenerator();
        generator.openRewgard();

        // Создание генератора пустых сундуков
        ItemFabric emptyChestGenerator = new EmptyChestGenerator();
        emptyChestGenerator.openRewgard();
    }
}