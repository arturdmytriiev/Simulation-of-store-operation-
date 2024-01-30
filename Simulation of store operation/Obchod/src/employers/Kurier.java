package employers;

public class Kurier extends Employers{
    private int budget;

    public Kurier()
    {
        super.counttimes();
    }

    public void budget()
    {
        if (super.Salary.size() > 1) {
            budget = super.Salary.get(3);
        } else {
            budget = 0;
        }
    }

    public void hello()
    {
        this.setHello(this);
    }

    @Override
    public String toString() {
        return "Kurier: Dobry den!";
    }

    public void salary()
    {
        budget();
        System.out.println("Kurier:" + getBudget());
    }
    public int getBudget() {
        return budget;
    }
}

