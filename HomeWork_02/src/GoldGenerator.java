public class GoldGenerator extends ItemFabric {

    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундучок с золотишком!!!");
        return new GoldReward();
    }
}