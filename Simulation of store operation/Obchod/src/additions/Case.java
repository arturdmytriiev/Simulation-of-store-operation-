package additions;

import accounting.Accounting;

public class Case implements Additions{
    Accounting accounting;
    static int cost_case = 45;

    public Case (Accounting accounting)
    {
        this.accounting = accounting;
    }

    @Override
    public String additions() {
        return "Puzdro: ";
    }

    @Override
    public void setSale() {
        System.out.println(additions() + cost_case);
        accounting.setSales(cost_case);
    }
}
