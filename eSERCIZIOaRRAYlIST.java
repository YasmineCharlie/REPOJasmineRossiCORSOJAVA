import java.util.Scanner;
import java.util.ArrayList;

public class eSERCIZIOaRRAYlIST {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList< String > listaS= new ArrayList<String>();
        boolean controllo=true;

        while(controllo==true){
            System.out.println("In quale vettore vuoi inserire:");
            System.out.println("- Numeri ");
            System.out.println("- Stringhe ");
            Scanner INPUT = new Scanner(System.in);

            String scelta=INPUT.nextLine();

            if(scelta.equalsIgnoreCase("Numeri")) {   
                System.out.println("Quale numero vuoi inserire?");
                Scanner inputN = new Scanner(System.in);
                list.add(inputN.nextInt()); 
                //System.out.println(list); 
            }//chiusura if numeri
            else if(scelta.equalsIgnoreCase("Stringhe")) {
                System.out.println("Quale stringa vuoi inserire?");
                Scanner inputN = new Scanner(System.in);
                listaS.add(inputN.nextLine()); 
                //System.out.println(listaS); 
            }//chiusura else if
            else{
                System.out.println("Comando non previsto");
                controllo=false;
            }//chiusura else
        }//chiusura while iniziale

        System.out.println("-----------------------------");
        //stampa array list
        while(controllo==false){
            System.out.println("Quale array vuoi visualizzare?");
            System.out.println("- Numeri ");
            System.out.println("- Stringhe ");
            Scanner INPUT = new Scanner(System.in);

            String scelta=INPUT.nextLine();

            if(scelta.equalsIgnoreCase("Numeri")) {   
                System.out.println(list); 
            }//chiusura if numeri
            else if(scelta.equalsIgnoreCase("Stringhe")) {
                System.out.println(listaS); 
            }//chiusura else if
            else{
                System.out.println("Comando non previsto");
                controllo=true;
            }//chiusura else

        }//chiusura while di stampa


    }//chiusura main
}
