import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){           

            System.out.println("Ange ett tal: ");
            double heltal = tangentbord.nextDouble();
    
            long avrundat_tal = (long) (heltal / 100.0)*100;
            if ((heltal - avrundat_tal)>= 50){
              avrundat_tal+=100;
            } else if ((heltal-avrundat_tal)<50){
              avrundat_tal=avrundat_tal+1-1;
            }
            System.out.println("Ditt tal avrundat till närmast tusental är: "+avrundat_tal);
    
            tangentbord.nextLine();
            System.out.println("Skriv in täljare och nämnare");
            int täljare = tangentbord.nextInt();
            int nämnare = tangentbord.nextInt();
            int temptäljare = täljare;
            int modulo = täljare%nämnare;
            täljare/= nämnare;
            System.out.println(täljare);
            System.out.println(modulo);
            System.out.println("ditt tal "+temptäljare+"/"+nämnare+" Är "+ täljare+" "+modulo+"/"+nämnare +" i blandad form");
            
            System.out.println("ange antalet timmar");
            double timmar = tangentbord.nextInt();
            System.out.println("ange antalet minuter");
            double minuter = tangentbord.nextInt();
            System.out.println("ange antalet sekunder");
            double sekunder = tangentbord.nextInt();
            double temptimmar= timmar;
            timmar += (minuter/60)+(sekunder/3600);
            double tempminuter = minuter;
            minuter +=(timmar*60)+(sekunder/60);
            double tempsekunder = sekunder; 
            sekunder +=(timmar*3600)+(minuter*60);
            
            System.out.println("Tidsomvandlig ger: "+timmar+"h "+minuter+"m "+sekunder+"s");
        }
    }
}
