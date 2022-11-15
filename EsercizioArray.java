import java.util.Scanner;

public class EsercizioArray {
    public static void main(String[]args){
        //Dichiarazione e valorizzazione 
        String[] stringa={"","","","",""}; //dimensionamento array stringhe
        int[] numero={0,0,0,0,0}; //dimensionamento array numeri
        boolean controllo=true;
        int i=0; 
        int j=0;
        int max=0;
        int max1=0;

        //dichiarazione degli scanner
        Scanner vettore1=new Scanner (System.in);
        Scanner vettore2=new Scanner (System.in);

        while(controllo==true){
            System.out.println("In quale vettore vuoi inserire:");
            System.out.println("- Numeri ");
            System.out.println("- Stringhe ");
            
            String scelta=vettore1.nextLine();

            if(scelta.equalsIgnoreCase("Numeri")){
                System.out.println("Inserisci un numero: ");
                numero[i]=vettore2.nextInt();
                i++;
            }//chiusura if iniziale
            else if(scelta.equalsIgnoreCase("Stringhe")) {
                System.out.println("Inserisci una stringa: ");
                stringa[j]=vettore1.nextLine();
                j++;
            }//chiusura else if
            else{
                System.out.println("Comando non valido!");
                controllo=false;
            }//chiusura else
            
        }//chiusura while
        
        //ciclo per stampare gli array
        while(controllo==false){
            System.out.println("Gli array sono:");
            System.out.printf("Array numeri: "); //Stampo array dei numeri
            while(max<i){
                System.out.printf(numero[max]+ " ");
                max++;
            }
            //ALTERNATIVAMENTE potevo utilizzare un for
            //for(int max=0;max<i;max++){
            //    System.out.printf(numero[max]+ " ");
            //}//chiusura for
            System.out.println("");
            System.out.printf("Array stringhe: "); //Stampo array delle stringhe
            while(max1<j){
                System.out.printf(stringa[max1]+ " ");
                max1++;
            }
            //ALTERNATIVAMENTE potevo utilizzare un for
            //for(int max=0;max<j;max++){
            //    System.out.printf(stringa[max]+ " ");
            //}//chiusura for
            controllo=true;
        }//chiusura while false
    }//chiusura while uscita    
}
