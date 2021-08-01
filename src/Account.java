import java.util.Scanner;

public class Account {


    private int balance = 0;
    Account(){}


        public static void main(String[] args){
        int b;
            Scanner input=new Scanner(System.in);
        Account a=new Account();
        b=input.nextInt();
            try {
                System.out.println("input a number");
                a.withDraw(b);
            } catch (CreateThrows q) {
                System.out.println("wrong" + q.getAmount());
            }

    }
    public class CreateThrows extends Exception {
        int amount;
        public CreateThrows(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }


    void withDraw(int money) throws CreateThrows {
        if (money < balance) {
            balance -= money;


        } else {
            int needs = money - balance;
            throw new CreateThrows(needs);
        }

    }
}






