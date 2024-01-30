package complaint;

public abstract class  Complaint {

    abstract String complaint ();

    public void whatcomplaint ()
    {
        System.out.print("Vratilit kvoli " + complaint() +".");
    }
}
