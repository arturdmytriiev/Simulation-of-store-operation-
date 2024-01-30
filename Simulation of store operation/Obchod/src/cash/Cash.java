package cash;

import accounting.Accounting;
import additions.*;
import purchase.Purchase;
import goods.Goods;

public class Cash {
    Purchase purchase;
    Goods goods;

    Accounting accounting;

    Case aCase;
    SafeGlass aSafeGlass;
    Charge aCharge;
    public Cash(Purchase purchase, Goods goods , Accounting accounting)
    {
        this.purchase = purchase;
        this.goods = goods;
        this.accounting = accounting;
        this.aCase = new Case(accounting);
        this.aSafeGlass = new SafeGlass(accounting);
        this.aCharge = new Charge(accounting);
    }

    public void hi()
    {
        System.out.println("Dobry den !");
        int cislo  = purchase.getNumbers_Goods();
        if(cislo == 1) {
            System.out.println("Vas tovar pripravuju a budete to - " + goods.getPrice_Apple());
            goods.Applebuy();
            accounting.setSales(goods.getPrice_Apple());
        }
        else if (cislo == 2)
        {
            System.out.println("Vas tovar pripravuju a budete to - " + goods.getPrice_Samsung());
            goods.Samsungbuy();
            accounting.setSales(goods.getPrice_Samsung());
        }
        else if (cislo == 3)
        {
            System.out.println("Vas tovar pripravuju a budete to - " + goods.getPrice_Asus());
            goods.Asusbuy();
            accounting.setSales(goods.getPrice_Asus());
        }
        else if (cislo == 4)
        {
            System.out.println("Vas tovar pripravuju a budete to - " + goods.getPrice_Lenovo());
            goods.Lenovobuy();
            accounting.setSales(goods.getPrice_Lenovo());
        }
    }
    public void bye ()
    {
        System.out.println("Dovidenia . Prajem krasny den !");
    }

    public void additions ()
    {
        aCase.whoadditions();
        int number_additions = 1*(int)(Math.random()*3);
        if (number_additions == 1) {
            System.out.println("Zakaznik objednal doplnku puzdro !");
            aCase.setSale();
        }
        else if (number_additions == 2) {
            System.out.println("Zakaznik objednal doplnku nabijacku");
            aCharge.setSale();
        }
        else if (number_additions == 3) {
            System.out.println("Zakaznik objednal bezpecnostne sklo !");
            aSafeGlass.setSale();
        }
    }

    @Override
    public String toString() {
        return "Cash{" +
                "purchase=" + purchase +
                ", goods=" + goods +
                ", accounting=" + accounting +
                '}';
    }
}

