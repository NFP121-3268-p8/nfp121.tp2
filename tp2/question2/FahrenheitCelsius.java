package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        
            int fahrenheit = 0; //initialiser Fahrenheit valeur
            float celsius = 0; //initialiser celsius valeur
        try{
            for(int x=0;x<args.length;x++) // v�rifier la valeur respect le condition (pas null et il a des valeurs)
            { 
                    fahrenheit = Integer.parseInt(args[x]); // convert valeur to integer
                    celsius=fahrenheitEnCelsius(Integer.parseInt(args[x])); // appel de la fonction fahrenheitEnCelsius(int f)
                    System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // affiche le r�sultat obtenue                                                           // format
                }                                                                     // impos�s
            }
       // appel de la fonction fahrenheitEnCelsius(int f)
      
       catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
    
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
    
public static float fahrenheitEnCelsius( int f)
      {
         float celsius=5/9f * (f-32);
                 float resultat=(int)(celsius*10)/10.0f;
        return resultat;
     }

}

