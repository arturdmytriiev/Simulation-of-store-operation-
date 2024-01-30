package employers;

public class Repairman extends Employers{
    private int budget;

    public Repairman()
    {
        super.counttimes();
    }

    public void budget()
    {
        if(super.Salary.size()>1)
        {
            budget = super.Salary.get(2);
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
        return "Repairman: Dobry den!";
    }
    public void salary()
    {
        budget();
        System.out.println("Repairman: "+getBudget());
    }


    public int getBudget() {
        return budget;
    }
}
