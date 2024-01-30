package employers;

import java.util.ArrayList;

public class Employers {


    ArrayList <Integer> Salary = new ArrayList<>(6);
    private static ArrayList <Employers>hello = new ArrayList<>();
    private int [] time = new int[6];

    public void salary()
    {
        System.out.println("Vsetci :");
    }


    public void counttimes()
    {
        for(int i = 0; i<time.length;i++)
        {
            time [i] = 24 + (int) (Math.random()*((168-24)+1));
        }
        countcash();
        countkonzult();
        countrepairman();
        countkurier();
        countwarehouseman();
        countaccountant();
    }

    public String toString() {
        return "Employers: Dobry den!";
    }

    public void hi() {
        System.out.println("Zamestnantci: Dobry den !");
        System.out.println("Aký druh zariadenia by ste chceli ? ");

    }

    public void printHelloContents() {
        for (Employers employer : Employers.hello) {
            System.out.println(employer);
        }
    }
    public void setHello (Employers e) {
        this.hello.add(e);
    }

    public void next() {
        System.out.println("Idete k pokladni ");
    }

    public int getTotalSalary() {
        int totalSalary = 0;
        for (int salary : Salary) {
            totalSalary += salary;
        }
        return totalSalary;
    }
    private void countcash() {
        Salary.add(time[0] * 45);
    }

    private void countkonzult()
    {
        Salary.add(time[1] * 60);
    }

    private void countrepairman()
    {
        Salary.add(time[2] * 55);
    }

    private void countkurier()
    {
        Salary.add(time[3] * 53);
    }

    private void countwarehouseman()
    {
        Salary.add(time[4] * 47);
    }

    private void countaccountant()
    {
        Salary.add(time[5] * 58);
    }
}

