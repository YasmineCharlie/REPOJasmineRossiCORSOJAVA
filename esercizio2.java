public class esercizio2 {
    public static void main(String[]args){
        //DICHIARAZIONE E VALORIZZAZIONE
        char val1='b';
        double val2=123.34;
        double val3=1;
        Boolean b1=true;
        Boolean b2=false;
        double somma;
        boolean orP;
        
        //di seguito sarà fatta la somma delle varibili e nel caso di valori "carattere" verrà sommata la codifica ASCII
        somma= val1+val2+val3;
        somma/=3;

        orP=b1||b2;
        
        if(orP==true){
            System.out.println(orP);
            System.out.println("EVVIVA");
        }

        System.out.println(somma);

    }//chiusura del main
}
