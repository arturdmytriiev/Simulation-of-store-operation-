package complaint;

public class Battery extends Complaint{
    @Override
    String complaint() {
        return "problém s batériou";
    }
    public void what ()
    {
        int random = 1+(int)(Math.random()*2);

        if(random == 1)
        {
         System.out.println("Batéria je pokazená ");
        }
        else if (random == 2)
        {
            System.out.println("Batéria je opuchnutá ");
        }
    }
}
