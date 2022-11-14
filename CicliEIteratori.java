import java.util.Scanner;

public class CicliEIteratori {
    public static void main(String[]args){
        //PROVA ESERCIZIO 1
        //int a=0;
        //while(a==0){
        //    System.out.println("EVVIVA STAMPA!!!");
        //    a++;
        //}//chiusura while 

        //int b=2;
        //do{
        //    System.out.println("NEL DO/WHILE");
        //} //chiusura del do
        //while(b==3);
        
        //ESERCIZIO WHILE E DO WHILE

        //DICHIARAZIONE E VALORIZZAZIONE
        double x=11;
        double y=22;
        double z=12.5;
        double Numero;
        boolean controllo=true;
        Scanner menu=new Scanner (System.in);  
        Scanner var=new Scanner(System.in);

       while(controllo==true){
        do{
            System.out.println("Scegli una delle opzioni seguenti:");
            System.out.println("- Aggiungi ");
            System.out.println("- Sottrai ");
            System.out.println("- Stampa ");
            System.out.println("- Esci ");
            String scelta=menu.nextLine();
            //System.out.println(scelta);

           if(scelta.equals("Aggiungi")){
                System.out.println("A quale varibile, tra x y e z, vuoi aggiungere un valore?");
                String chose=menu.nextLine();
                if(chose.equals("x")){
                    System.out.println("Quanto vuoi aggiungere a tale variabile?");
                    int NumeroInte=var.nextInt();
                    Numero = ((double)(NumeroInte));
                    x= x + NumeroInte;
                    System.out.println(x);
                }//chiusura if scelta x
                else if(chose.equals("y")){
                    System.out.println("Quanto vuoi aggiungere a tale variabile?");
                    int NumeroInte=var.nextInt();
                    Numero = ((double)(NumeroInte));
                    y= y + NumeroInte;
                    System.out.println(y);
                }//chiusura if scelta y
                else if(chose.equals("z")){
                    System.out.println("Quanto vuoi aggiungere a tale variabile?");
                    int NumeroInte=var.nextInt();
                    Numero = ((double)(NumeroInte));
                    z= z + NumeroInte;
                    System.out.println(z);
                }//chiusura if scelta z
                else {
                    System.out.println("Non hai inserito una variabile giusta!");
                }//chiusura else 
           }//chiusura if Aggiungi
           else if(scelta.equals("Sottrai")){
            System.out.println("A quale varibile, tra x y e z, vuoi sottrarre un valore?");
            String chose=menu.nextLine();
            if(chose.equals("x")){
                System.out.println("Quanto vuoi sottrarre a tale variabile?");
                int NumeroInte=var.nextInt();
                Numero = ((double)(NumeroInte));
                if(Numero<=1){
                    System.out.println("Devi inserire un valore maggiore di 1");
                }//chiusura if controllo 1
                else{
                    x= x - NumeroInte;
                    System.out.println(x);
                }
            }//chiusura if scelta x
            else if(chose.equals("y")){
                System.out.println("Quanto vuoi sottrarre a tale variabile?");
                int NumeroInte=var.nextInt();
                Numero = ((double)(NumeroInte));
                if(Numero<=1){
                    System.out.println("Devi inserire un valore maggiore di 1");
                }//chiusura if controllo 1
                else{
                    y= y - NumeroInte;
                    System.out.println(y);
                }
            }//chiusura if scelta y
            else if(chose.equals("z")){
                System.out.println("Quanto vuoi sottrarre a tale variabile?");
                int NumeroInte=var.nextInt();
                Numero = ((double)(NumeroInte));
                if(Numero<=1){
                    System.out.println("Devi inserire un valore maggiore di 1");
                }//chiusura if controllo 1
                else{
                    z= z - NumeroInte;
                    System.out.println(z);
                }
            }//chiusura if scelta z
            else {
                System.out.println("Non hai inserito una variabile giusta!");
            }//chiusura else 
           }//chiusura if Sottrai
           else if(scelta.equals("Stampa")){
                 System.out.println("Vuoi stampare una varibile tutte: 1)le varibili (x,y,z); 2) una sola varibile?");
                 int NumeroInte=var.nextInt();
                 if(NumeroInte==1){
                    System.out.println("Varibile x: " + x + " " +"Varibile y: " + y + " " + "Varibile z: " + z );
                 }//chiusura if caso stampa tutte varibili
                 else if( NumeroInte==2){
                    System.out.println("Quale tra x, y e z vuoi vedere?");
                    String chose=menu.nextLine();
                    if(chose.equals("x")){
                        System.out.println("Varibile x: " + x);
                    }//chiusura if scelta x
                    else if(chose.equals("y")){
                        System.out.println("Varibile y: " + y);
                    }//chiusura else if di y
                    else if(chose.equals("z")){
                        System.out.println("Varibile z: " + z);
                    }//chiusura else if z
                    else {
                        System.out.println("Non hai scelto una varibile corretta!");
                    }//chiusura else
                 }//chiusura else if stampa una varibile
                 else{
                    System.out.println("Scelta non valida!");
                 }//chiusura else
           }//chiusura if Stampa
           else{
            System.out.println("GRAZIE E CIAO!");
           }//chiusura finale
        } while(menu.equals("Esci"));

        }//chiusura while iniziale
    }
}
