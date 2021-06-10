package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
       
public class FahrenheitCelsius {

    /**
     * @param args liste des valeru en degr� fehrenheit pour converter en clsius
     * 
     * Affiche la liste de valeur en degr� celsius et leur initial valeur en fehrenhite
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        int fahrenheit = 0; //initialiser Fahrenheit valeur
        float celsius = 0; //initialiser celsius valeur
       

        for(int x=0;x<args.length;x++){ // v�rifier la valeur respect le condition (pas null et il a des valeurs)
        
             // parcours args
            {
                fahrenheit = Integer.parseInt(args[x]); // convert valeur to integer
                celsius=fahrenheitEnCelsius(Integer.parseInt(args[x])); // appel de la fonction fahrenheitEnCelsius(int f)
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // affiche le r�sultat obtenue                                                           // format
            }                                                                     // impos�s
        }
    }

    /**
     * 
     * @param f la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float celsius=5/9f * (f-32);// 5f et 9f pour obtient float resultat ou on utilise (float)
        float resultat=(int)(celsius*10)/10.0f;
        return resultat;// � compl�ter en rempla�ant ce return 0.F par la fonction
        // de conversion
    }

}


