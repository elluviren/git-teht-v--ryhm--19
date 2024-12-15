import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ryhmätehtävä");

        // Jani lisäsi käyttäjän syötteen kyselyn ja
        // Ympyra luokan kutsumisen ja ympyrän pinta-alan laskennan
        // muokkailkaa vapaasti alla olevaa koodia tarpeiden mukaan

        Scanner input = new Scanner(System.in);

        System.out.println("Anna ympyrän säde");
        double sade = Double.parseDouble(input.nextLine());

        Ympyra ympyraP = new Ympyra(sade);
        ympyraP.laskePintaAla();

        // lisätty tulostamisen kutsuminen, Elina
        ympyraP.printData();
        // input.close();
        //Elias totesi että ei voi tuoda uutta scanneria niin käytin samaa. 

        

        System.out.println("Anna uima-altaan leveys metreinä");
        double width = input.nextDouble();

        System.out.println("Anna uima-altaan pituus metreinä");
        double length = input.nextDouble();

        System.out.println("Anna uima-altaan syvyys metreinä");
        double depth = input.nextDouble();

        SwimPool pool = new SwimPool(width, length, depth);
        System.out.println("uima-altaan tilavuus: " + pool.calcVol() + "m3.");

        input.close();


    
    }
}

//Elias tehnyt kaavan jolla laskea uima-altaan tilavuus (mikäli neliön muotoinen)
class SwimPool {

    private double width;
    private double length;
    private double depth;

    public SwimPool(double w, double l, double d)
    {
        width = w;
        length = l;
        depth = d;

    }


    public double calcVol() {

        return width * length * depth;
    }
}

// Janin lisäämä Ympyrä luokka ja ympyrän pinta-alan laskenta
class Ympyra {
	private double sade;

	public Ympyra(double sade) {
        this.sade = sade;
	}

// Lisätty parametriton muodostin, Elina
    public Ympyra() {
        sade=0;
    }
	
    public void laskePintaAla() {
        double tulos =  3.14159 * (sade * sade);
        System.out.printf("Ympyrän pinta-ala on: " + "%.2f%n", tulos);
	}

// Lisätty tulosta tiedot-metodi, Elina
    public void printData() {
        System.out.println("Ympyrän säde on: " + sade);
    }
}
