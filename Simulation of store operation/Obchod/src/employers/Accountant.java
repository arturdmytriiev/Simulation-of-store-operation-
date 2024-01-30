package employers;

public class Accountant extends Employers {
        private static int budget;

        public Accountant()
        {
            super.counttimes();
        }

        public final void budget()
        {
            if(super.Salary.size()>1)
            {
                budget = super.Salary.get(5);
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
        return "Uctovnik: Dobry den!";
    }
        public void salary()
        {
            budget();
            System.out.println("Uctovnik: "+getBudget());
        }

        public int getBudget() {
            return budget;
        }
}

