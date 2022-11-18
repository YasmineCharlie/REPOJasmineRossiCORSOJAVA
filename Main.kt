/* Crea un sistema di login
  -Utente: Verrà riportato al menu per eseguire il quiz o uscire
  -Admin: Verrà riportato a un menu per: AGGIUNGERE, RIMUOVERE E VISUALIZZARE le domande e uscire

  All'utente quando finisce il quiz deve uscire il suo risultato e non potrà ripetere il test
  Il test dev'essere almeno di 4 domande con 3 risposte
  Alla fine del test gli utenti torneranno al login

*/



fun main(args: Array<String>) {
    var choise : String
    var quante : Boolean = true

    var sceltaU : String
    var sceltaA : String
    do {
        println("Ciao! Vuoi: \n1)Accedere come Utente \n2)Accedere come Admin \n3)Esci ")
        choise = readLine().toString()

        when (choise) {
            "Utente" -> {
                println("Cosa vuoi fare? \n1)QUIZ \n2)ESCI")
                sceltaU= readLine().toString()
                if(sceltaU.equals("QUIZ")){
                    println("Hai scelto il QUIZ")
                }else{
                    println("Grazie e ciao!")
                    break
                }//chiusura else
            }//chiusura utente

            "Admin" ->{
                println("Cosa vuoi fare? \n1)AGGIUNGI \n2)RIMUOVI \n3)VISUALIZZA \n4)ESCI")
                sceltaA= readLine().toString()
                if(sceltaA.equals("AGGIUNGI")){
                    println("Hai scelto di Aggiungere")

                    //while(finchè non hai inserito sia domanda che risposta non esci)

                }else if(sceltaA.equals("RIMUOVI")){
                    println("Hai scelto di Rimuovere")
                }else if(sceltaA.equals("VISUALIZZA")){
                    println("Hai scelto il visualizza")
                }else if(sceltaA.equals("ESCI")){
                    println("Hai scelto Esci")
                }
            }//chiusura admin

            "Esci" ->{
                println("ESCI")
                break
            }//chiusura esci
        }//chiusura when
        quante=false
    } while(quante==true)

}