package employers;

public class Warehouseman extends Employers{
    private static int  budget;

    public Warehouseman()
    {
        super.counttimes();
    }

    private final static String warehouseman = "Skladnik";

    public void budget()
    {
        if(super.Salary.size()>1)
        {
            budget = super.Salary.get(4);
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
        return "Warehouseman: Dobry den!";
    }

//Pretazovania
    public void salary ()
    {
        budget();
        System.out.println("Skladnik: "+getBudget());
    }

    public int getBudget() {
        return budget;
    }
}
