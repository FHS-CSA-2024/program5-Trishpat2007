//import stuff here?

//Your code here
class Program5{
    public static void main(String[] args){
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        int royaleMiles= 286;
        int koopaMiles= 412;
        int pipeMiles= 361;
        int bandwagonMiles= 161;

        //I would prefer using variables for the gallon for each car, but this is fine for this program.
        
        
        double royaleAvrg= (royaleMiles/9.0)*100;
        royaleAvrg=(int)(royaleAvrg+5)/10;
        royaleAvrg= (double)(royaleAvrg/10);
        double koopaAvrg= (koopaMiles/40.0);
        double pipeAvrg= (pipeMiles/18.0)*100;
        pipeAvrg=(int)(pipeAvrg+5)/10;
        pipeAvrg= (double)(pipeAvrg/10);
        double bandwagonAvrg= (bandwagonMiles/11.0)*100;
        bandwagonAvrg=(int)(bandwagonAvrg)/10;
        bandwagonAvrg= (double)(bandwagonAvrg/10);
        
        System.out.println("Royale averaged "+royaleAvrg);
        System.out.println("Koopa averaged" +koopaAvrg);
        System.out.println("Pipe averaged "+pipeAvrg); 
        System.out.print("Bandwagon averaged "+ bandwagonAvrg);
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8
Koopa averaged10.3
Pipe averaged 20.1
Bandwagon averaged 14.6
*/
