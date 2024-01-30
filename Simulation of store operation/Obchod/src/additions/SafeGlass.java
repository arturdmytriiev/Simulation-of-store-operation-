package additions;

import accounting.Accounting;

public class SafeGlass implements Additions{
    Accounting accounting;

    static int cost_safeglass = 25;

    public SafeGlass (Accounting accounting)
    {
        this.accounting = accounting;
    }

    @Override
    public String additions() {
        return "Bezpeсnostne sklo: ";
    }

    @Override
    public void setSale() {
        System.out.println(additions()+ cost_safeglass );
        accounting.setSales(cost_safeglass);
    }
}
