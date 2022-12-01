//questa funzione mi permette di capire se un utente ha selezionato un numero
fun controllonum(scelta: String?): Boolean {
    //controllo che la stringa passata sia non nulla
    if (scelta == null)
    {
        return false
    }
    //controllo che la stringa passata sia effettivamente un numero
    for (i in scelta)
    {
        if (i < '0'||i > '9')
        {
            return false
        }
    }
    return true
}

fun main(args: Array<String>)
{
    //inizializzazione e valorizazione delle varibili
    var ciclomenu = false //variabile che permette di fermare il ciclo del menu
    var cicloAgg = false //variabile che permette di fermare il ciclo dell'aggiungi
    var task:ArrayList<String> = ArrayList() //arraylist delle task
    var cicloMod=false //variabile che permette di fermare il ciclo della modifica
    var cicloEl=false //variabile che permette di fermare il ciclo dell'elimina
    var cicloEsci=false //variabile che permette di fermare il ciclo dell'esci
    var cicloTaskCompl=false //variabile che permette di fermare il ciclo delle task completate

    while(ciclomenu==false)
    {

        println("BENVENUTO! \nCOSA VUOI FARE? \nA: CREARE TASK \nB: MODIFICARE TASK \nC: STAMPARE TASK \nD: ELIMINARE TASK \nE: COMPLETA TASK \nF: ESCI")

        var scelta:String="" //variabile che permette di salvare la scelta dell'utente
        scelta= readLine().toString()

        if(scelta.equals("A")||scelta.equals("a")) // creare una task
        {
            //nel caso in cui sceglie CREA
            println("Cosa vuoi aggiungere?")
            var inserimento:String=""
            inserimento= readLine().toString()

            task.add(inserimento) //aggiunge una task

            while (cicloAgg==false)
            {
                println("vuoi inserire altro? [S/N]")
                scelta = readLine().toString()
                //se l'utente vuole inserire una nuova task
                if (scelta.equals("S")||scelta.equals("s"))
                {
                    println("Inserisci di nuovo")
                    inserimento= readLine().toString()
                    task.add(inserimento) //aggiungo una nuova task
                }
                else if(scelta.equals("N")||scelta.equals("n")) { //altrimenti vuole fruire di un altro comando
                         cicloAgg=true
                }
                else
                {
                    //il carattere digitato non è previsto
                    println("Comando non valido!")
                }
            }
            cicloAgg=false
        }//chiusura if scelta CREA
        else if(scelta.equals("B")||scelta.equals("b")) //modificare una task
        {
            //il seguente permette di controllare se non ci sono task
            if (task.isNullOrEmpty()) {
                println("Non ci sono Task!")
            }//chiusura if
            else {
                println("Le tue task sono:")
                for(i in 0 until  task.size)
                {
                    println(i.toString() + " " + task.get(i))
                }
                while(cicloMod==false)
                {
                    println("Cosa vuoi modificare?")
                    var sceltaModifica:String=""
                    sceltaModifica= readLine().toString()

                    var num:Int=0 //variabile di appoggio

                    //richiamo la funzione che mi permette di capire se è stato inserito un numero
                    if (controllonum(sceltaModifica))
                    {
                        num=sceltaModifica.toString().toInt()

                        println("Con cosa vuoi modifcare la tua task?")
                        var modificaEffettuata: String=""
                        modificaEffettuata= readLine().toString()
                        task.set(num, modificaEffettuata)

                        //aggiornamento task
                        println("Ora le tue task sono:")
                        for (i in 0 until task.size)
                        {
                            //stampa delle task
                            println(i.toString() + " " + task.get(i))
                        }//chiusura for
                        cicloMod=true
                    }//chiusura if
                    else
                    {
                        println("Non hai selezionato un numero!")
                    }
                }
            }
            cicloMod=false
        }//chiusura if scelta MODIFICA
        else if(scelta.equals("C")||scelta.equals("c")) //stampare una task
        {
            //stampa la lista delle task
            println("La Lista delle tue task è: ")
            for (i in 0 until task.size)
            {
                //stampa la lista
                println(i.toString() + " " + task.get(i))
            }
        }//chiusura if scelta STAMPA
        else if(scelta.equals("D")||scelta.equals("d")) //eliminare una task
        {
            if (task.isNullOrEmpty()) {
                println("Non puoi eliminare da una Task vuota!")
            }
            else {
                println("Quale task vuoi eliminare?")
                for (i in 0 until task.size)
                {
                    //stampa le task
                    println(i.toString() + " " + task.get(i))
                }

                while(cicloEl==false)
                {
                    //effettiva eliminazione
                    println("Cosa vuoi eliminare?")
                    var sceltaElimina:String=""
                    sceltaElimina = readLine().toString()
                    var num:Int=0
                    if (controllonum(sceltaElimina))
                    {
                        num=sceltaElimina.toString().toInt()
                        task.removeAt(num)
                        //aggiornamento task
                        println("Ora le tue task sono:")
                        for (i in 0 until task.size) {
                            //stampa la lista
                            println(i.toString() + " " + task.get(i))
                        }
                        cicloEl=true
                    }//chiusura if
                    else
                    {
                        println("Non hai selezionato un numero!")
                    }
                }//chiusura while controllo

            }
            cicloEl=false
        }//chiusura if scelta ELIMINA
        else if(scelta.equals("E")||scelta.equals("e")) //completa una task
        {
            if (task.isNullOrEmpty())
            {
                println("Non ci sono Task!")
            }
            else
            {
                println("Le tue task sono:")
                for (i in 0 until task.size) {
                    println(i.toString() + " " + task.get(i))
                }
                while(cicloTaskCompl==false)
                {
                    println("Quale task hai completato?")
                    var sceltaCompletata: String = ""
                    sceltaCompletata = readLine().toString()

                    var num: Int = 0 //variabile di appoggio

                    //richiamo la funzione che mi permette di capire se è stato inserito un numero
                    if (controllonum(sceltaCompletata))
                    {
                        num = sceltaCompletata.toString().toInt()
                        println("Ora le tue task non completate sono:")
                        for (i in 0 until task.size)
                        {
                            if(i==num)
                            {
                                task.set(num,task.get(i)+  " ✔ " )
                                println(i.toString() + " " + task.get(i) )
                            }
                            else
                            {
                                println(i.toString() + " " + task.get(i))
                            }
                        }//chiusura for
                        cicloTaskCompl=true
                    }//chiusura if
                    else
                    {
                        println("Non hai selezionato un numero!")
                    }
                }//chiusura while controllo taskcompl
            }
            cicloTaskCompl=false
        }//chiusura if scelta COMPLETA
        else if(scelta.equals("F")||scelta.equals("f")) //esci
        {
            //parte di uscita con conferma
            while(cicloEsci==false)
            {
                println("Sei sicuro di voler uscire [S/N]")
                var choice:String=""
                choice= readLine().toString()
                if(choice.equals("S")||choice.equals("s"))
                {
                    println("ARRIVEDERCI")
                    ciclomenu=true
                    cicloEsci=true
                }
                else if(choice.equals("N")||choice.equals("n")) {
                    cicloEsci=true
                    ciclomenu=false
                }
                else
                {
                    println("Scelta non valida")
                    cicloEsci=false
                }
            }//chiusura while controllo esci
            cicloEsci=false
        }//chiusura if scelta ESCI
        else
        {
            println("Comando non valido!")
        }

    }

}
