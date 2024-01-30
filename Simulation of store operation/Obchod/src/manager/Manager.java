package manager;

import accounting.Accounting;
import purchase.Purchase;
import goods.Goods;
import employers.Employers;

public class Manager {
    public void manager()

    {
        //Abstrakcia
        var Employers = new Employers ();
        var Accounting = new Accounting(Employers);
        var goods = Goods.getInstance();
        var Purchase = new Purchase(goods, Accounting);
        for (int i = 0; i < 30; i++) {
            Purchase.HowBuy();
        }
        Accounting.counting();
        Accounting.Net_Sales();
        System.out.println("\n-----------Bughalteria-----------------");
        System.out.println("Trzba za mesiac: " + Accounting.getSales());
        System.out.println("Cista trzba za mesiac: " + Accounting.getNet_sales());
        System.out.print("Plat zamestnancov: \n" );
        Accounting.count_salary();
    }
}
