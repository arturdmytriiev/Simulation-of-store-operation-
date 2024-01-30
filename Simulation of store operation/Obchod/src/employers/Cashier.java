package employers;

public class Cashier extends Employers{
    private static int budget;

    public Cashier()
    {
        super.counttimes();
    }


    public void budget()
    {
        if(super.Salary.size()>1)
        {
            budget = super.Salary.get(0);
        }
        else
        {
            budget = 0;
        }
    }

    public void hello ()
    {
        this.setHello(this);
    }

    @Override
    public String toString() {
        return "Pokladnik: Dobry den!";
    }

    public void salary()
    {
        budget();
        System.out.println("Pokladnik: "+getBudget());
    }

    public int getBudget() {
        return budget;
    }
}