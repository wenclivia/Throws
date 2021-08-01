import java.util.Scanner;
public class CreateThrows extends Exception {
    int amount;
    public CreateThrows(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
