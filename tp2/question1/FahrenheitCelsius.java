package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
       
public class FahrenheitCelsius {

    /**
     * @param args liste des valeru en degré fehrenheit pour converter en clsius
     * 
     * Affiche la liste de valeur en degré celsius et leur initial valeur en fehrenhite
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0; //initialiser Fahrenheit valeur
        float celsius = 0; //initialiser celsius valeur
       

        for(int x=0;x<args.length;x++){ // vérifier la valeur respect le condition (pas null et il a des valeurs)
        
             // parcours args
            {
                fahrenheit = Integer.parseInt(args[x]); // convert valeur to integer
                celsius=fahrenheitEnCelsius(Integer.parseInt(args[x])); // appel de la fonction fahrenheitEnCelsius(int f)
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // affiche le résultat obtenue                                                           // format
            }                                                                     // imposés
        }
    }

    /**
     * 
     * @param f la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float celsius=5/9f * (f-32);// 5f et 9f pour obtient float resultat ou on utilise (float)
        float resultat=(int)(celsius*10)/10.0f;
        return resultat;// à compléter en remplaçant ce return 0.F par la fonction
        // de conversion
    }

}


