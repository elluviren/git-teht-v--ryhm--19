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

        input.close();
    
    }
}
class swimPool {

    public int width;
    public int length;

    public Pool(int w, int l);
    {
        width = w;
        length = l;

    }
}

// Janin lisäämä Ympyrä luokka ja ympyrän pinta-alan laskenta
class Ympyra {
	private double sade;

	public Ympyra(double sade) {
        this.sade = sade;
	}
	
    public void laskePintaAla() {
        double tulos =  3.14159 * (sade * sade);
        System.out.printf("Ympyrän pinta-ala on: " + "%.2f%n", tulos);
	}
}
 