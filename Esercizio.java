//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().

    //Creo l'oggetto in per l'input da tastiera
    private static Random random = new Random();
    private static Scanner in = new Scanner( System.in );

    public static void main(String args[])
    {
        //Variabili del programma
        int T, N, i ,j;
        

        //Leggo l'input da tastiera
        do{
            N = in.nextInt();
        } while (N<=0);

        int[] U = new int[N];
        int[] R = new int[N];
        int[] S = new int[N];
        double[] M = new double[N];

        System.out.println("Inserisci " + N + " numeri interi positivi.");
        for (i=0; i<=(N-1);i++){
            do{
                U[i] = in.nextInt();
                if (U[i] <= 0){
                    System.out.println("Mi dispiace, inserire un numero intero positivo.");
                }
            }while(U[i]<=0);
        }
        for (i=0; i<=(N-1); i++){
            R[i] = random.nextInt(11);
            S[i] = random.nextInt(6) + 3;
            M[i] = (U[i]+R[i]+S[i])/3;
        }
        System.out.println("Tutti i valori di M: ");

        for (i=0; i<=(N-1); i++){
            System.out.println(M[i]);    
        }

        System.out.println("Scrivi un numero positivo a caso: ");

        do{
            T = in.nextInt();
        } while (T<=0);


        
        for (i=0; i<=(N-1); i++){
            
            for (j=i+1; j<=(N-1); j++){
                if (U[i]+U[j]==T){
                    System.out.println("La coppia "+U[i]+" di indice "+i+" e "+U[j]+" di indice "+j+" danno come risultato "+T+".");
                }
            }
        }


        
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md