

public class SilverGenerator extends ItemFabric  {

    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундучок с серебришком !!!");
        return new SilverReward();
    }

}