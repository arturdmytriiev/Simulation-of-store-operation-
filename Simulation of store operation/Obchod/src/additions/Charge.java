package additions;

import accounting.Accounting;
import employers.Accountant;

public class Charge implements Additions{
    Accounting accounting;
    static int charge = 15;
    public  Charge (Accounting accounting)
    {
        this.accounting = accounting;
    }
   @Override
   public void setSale() {
        System.out.println(additions() + charge);
       accounting.setSales(charge);
   }

    @Override
    public String additions() {
        return "Nabijacku: ";
    }
}
