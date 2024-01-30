package purchase;

import accounting.Accounting;
import complaint.*;
import goods.Goods;
import cash.Cash;

public class Purchase {
    private int numbers_delivery;
    private  static int numbers_goods;
    private int random_numbers;
    Goods goods ;
    Accounting accounting;
    Cash cash;
    Personal personal;
    Glass glass = new Glass();
    Rejection rejection = new Rejection();
    Complaint  battery = new Battery();

// Kompozicia
    public Purchase (Goods goods, Accounting accounting)
    {
        this.accounting = accounting;
        this.goods = goods;
        this.cash = new Cash(this, goods, accounting);
        this.personal = new Personal(this, goods, accounting);
    }
    public void HowBuy ()
    {

        System.out.println("Ako zakaznik zobere objednavku ? ");
        numbers_delivery = 1 + (int)(Math.random() * ((2 - 1) + 1));
        if (numbers_delivery == 1) {
            System.out.println("Zakaznik spravil online donasku.");
            online();
        } else {
            System.out.println("Zakaznik dojde sam.");
            personal();
        }
    }

    public void online()
    {
        random_numbers = (int) Math.floor(Math.random() * (120 - 10 + 1)) + 10;

        System.out.println("Aky tovar on chce ?");
        numbers_goods = 1 + (int)(Math.random() * ((4 - 1) + 1));
        if(numbers_goods == 1)
        {
            System.out.println("Zakaznik objednal Telefon Apple");
            System.out.println("Zakaznik zaplatil: " + goods.getPrice_Apple());
            goods.Applebuy();
            accounting.setSales(goods.getPrice_Apple());
        }
        else if(numbers_goods == 2)
        {
            System.out.println("Zakaznik objednal Telefon Samsung");
            System.out.println("Zakaznik zaplatil: " + goods.getPrice_Samsung());
            goods.Samsungbuy();
            accounting.setSales(goods.getPrice_Samsung());
        }
        else if (numbers_goods == 3)
        {
            System.out.println("Zakaznik objednal Notebook Asus");
            System.out.println("Zakaznik zaplatil: " + goods.getPrice_Asus());
            goods.Asusbuy();
            accounting.setSales(goods.getPrice_Asus());
        }
        else if (numbers_delivery == 4)
        {
            System.out.println("Zakaznik objednal Notebook Lenovo");
            System.out.println("Zakaznik zaplatil: " + goods.getPrice_Lenovo());
            goods.Lenovobuy();
            accounting.setSales(goods.getPrice_Lenovo());
        }
        System.out.println(String.format(("Donask sa dostane za %d minut."),random_numbers));
    }

    public void returned ()
    {
        int yes_no = 1 + (int) (Math.random() * 2);

        if (yes_no == 1) {
            System.out.println("Nevratili !");
        } else if (yes_no == 2) {
            System.out.println("Vratili ! ");

            int whatprobl = 1 + (int) (Math.random() * 3);

            System.out.println("Za aky problem vratili ?");
            Complaint returnedComplaint;
            if (whatprobl == 1) {
                returnedComplaint = glass; // Upcasting
            } else if (whatprobl == 2) {
                returnedComplaint = rejection; // Upcasting
            } else  {
                returnedComplaint = battery; // Upcasting
            }

            returnedComplaint.whatcomplaint();

            if(whatprobl == 3) {
                // Downcasting
                if (returnedComplaint instanceof Battery) {
                    Battery specificBattery = (Battery) returnedComplaint;
                    specificBattery.what();
                }
            }

            System.out.println("Dakujeme za vasu vyzvu. Tovar bude odoslany na opravu na nase naklady.");
        }
    }

    public void personal ()
    {
        personal.came();
    }

    public int getNumbers_Goods() {
        return numbers_goods;
    }
}

