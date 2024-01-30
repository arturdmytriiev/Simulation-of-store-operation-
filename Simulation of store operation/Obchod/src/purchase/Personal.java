package purchase;



import accounting.Accounting;
import employers.*;
import goods.Goods;
import cash.Cash;

public class  Personal {
    Employers konsult = new Konsult();
    Purchase purchase ;
    Goods goods;
    Accounting accounting;
    Cash cash;

    public Personal(Purchase purchase, Goods goods, Accounting accounting)
    {
        this.accounting = accounting;
        this.goods = goods;
        this.purchase = purchase;
        this.cash = new Cash(purchase, goods, accounting);
    }

    public void came()
    {
        konsult.printHelloContents();
        System.out.println("Do obchodu prišiel zákazník ");
        konsult.hi();
        int numbers = purchase.getNumbers_Goods();
        if(numbers == 1)
        {
            System.out.println("Zakaznik objednal Telefon Apple");
        }
        else if(numbers == 2)
        {
            System.out.println("Zakaznik objednal Telefon Samsung");
        }
        else if (numbers == 3)
        {
            System.out.println("Zakaznik objednal Notebook Asus");
        }
        else if (numbers == 4)
        {
            System.out.println("Zakaznik objednal Notebook Lenovo");
        }
        konsult.next();
        cash.hi();
        cash.additions();
        cash.bye();
        purchase.returned();
    }

}

