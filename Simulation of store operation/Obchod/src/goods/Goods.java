package goods;

public class Goods {
        private static Goods instance;
        private int telefon_Apple ;
        private int telefon_Samsung;
        private int notebook_Asus ;
        private int notebook_Lenovo ;

        private int price_Apple;
        private final int price_Samsung = 1400 ;
        private  int price_Asus ;
        private  int price_Lenovo;


        private  Goods ()
        {
            telefon_Apple =  1500;
            notebook_Asus =  1340;
            telefon_Samsung =  1100;
            notebook_Lenovo =  450;

            price_Apple = 1500;
            price_Asus = 1850;
            price_Lenovo = 1900;
        }
//Singelton Pattern
        public static Goods getInstance()
        {
            if(instance == null)
            {
                instance = new Goods();
            }
            return instance;
        }
        public static void goods_count ()
        {
            System.out.println("Telefonov Apple: 1500 , Telfonov Samsung: 1400, Notebookov Lenovo: 1850, Notebook Asus: 1900");
        }

        public void Applebuy()
        {
            if(telefon_Apple != 0) {
                telefon_Apple -= 1;
            }
            else
            {
                System.out.println("Uz nie je Apple !");
            }
        }
        public void Samsungbuy(){
            if(telefon_Samsung != 0) {
                telefon_Samsung -= 1;
            }
            else {
                System.out.println("Uz nie je Samsung !");
            }
        }
        public void Asusbuy(){
            if(notebook_Lenovo != 0) {
                notebook_Asus -= 1;
            }
            else {
                System.out.println("Uz nie je Asus !");
            }
        }
        public void Lenovobuy(){
            if(notebook_Lenovo != 0) {
                notebook_Lenovo -= 1;
            }
            else
            {
                System.out.println("Uz nie je Lenovo !");
            }
        }

        public int getPrice_Apple() {
            return price_Apple;
        }

        public int getPrice_Lenovo() {
            return price_Lenovo;
        }

        public int getPrice_Asus() {
            return price_Asus;
        }

        public int getPrice_Samsung() {
            return price_Samsung;
        }
    }

