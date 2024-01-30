package accounting;
import employers.*;

public class Accounting {
    //Agregacia
    Employers employers;
    Konsult konsult = new Konsult();
    Kurier kurier = new Kurier();
    Repairman repairman = new Repairman();
    Cashier cashier = new Cashier();
    Warehouseman warehouseman = new Warehouseman();
    Accountant accountant = new Accountant();
    private  static int sales;

    private  static int net_sales;

    public Accounting(Employers employers)
    {
        this.employers = employers;
    }

    public  void setSales (int sales)
    {
        Accounting.sales += sales;
    }

    public int getSales()
    {
        return sales;
    }

    public void counting()
    {
        employers.counttimes();
    }
    public void count_salary()
    {
        konsult.salary();
        kurier.salary();
        repairman.salary();
        accountant.salary();
        cashier.salary();
        warehouseman.salary();
    }

    public void Net_Sales ()
    {
        net_sales = sales - employers.getTotalSalary();
    }

    public int getNet_sales() {
        return net_sales;
    }
}
