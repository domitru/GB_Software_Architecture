public class EmptyChestGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Создан новый пустой сундучок ");
        return new EmptyChest();
    }
}