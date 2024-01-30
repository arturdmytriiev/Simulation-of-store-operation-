package employers;

public class Konsult extends Employers{
    private static int budget;

    public Konsult(){
        super.counttimes();
    }


    public int getBudget() {
        return budget;
    }

    public void budget()
    {
        if (super.Salary.size() > 1) {
            budget = super.Salary.get(1);
        } else {
            budget = 0;
        }
    }

    public void hello ()
    {
        this.setHello(this);
        this.toString();
    }

    @Override
    public String toString() {
        return "Konzult: Dobry den!";
    }

    public void salary ()
    {
        budget();
        System.out.println("Konzultant: "+getBudget());
    }

//Prekonovanie
    @Override
    public void hi() {
        System.out.println("Кonzultant: Dobry den !");
        System.out.println("Aký druh zariadenia by ste chceli ? ");

    }

    @Override
    public void next() {
        System.out.println("Idete k pokladni ");
    }

}

