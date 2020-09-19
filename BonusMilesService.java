public class BonusMilesService {

    public int calculate (int coast) {

        int balance = 10;
        int miles = coast / 100 / 20 + balance;

        return miles;
    }
}
