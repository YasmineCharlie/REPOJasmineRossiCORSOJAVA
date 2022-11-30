fun main(args: Array<String>)
{
    //inizializzazione e valorizazione delle varibili
    var ciclomenu = false //variabile che mi permette di fermare il ciclo del menu
    var cicloAgg = false //variabile che mi permette di fermare il ciclo dell'aggiungi
    var lista:ArrayList<String> = ArrayList() //arraylist delle task

    while(ciclomenu==false)
    {
        println("BENVENUTO!")
        println("COSA VUOI FARE")
        println("A: CREARE TASK ")
        println("B: MODFICARE TASK")
        println("C: STAMPARE TASK ")
        println("D: ELIMINARE TASK")

        var scelta:String=""
        scelta= readln().toString()

        if(scelta.equals("A")||scelta.equals("a"))
        {
            //nel caso in cui sceglie CREA
            println("Cosa vuoi aggiungere?")
            var inserimento:String=""
            inserimento= readln().toString()
            lista.add(inserimento)

            while (cicloAgg==false)
            {
                println("vuoi inserire altro? [S/N]")
                scelta = readln().toString()
                if (scelta.equals("S")||scelta.equals("s"))
                {
                    println("Inserisci di nuovo")
                    inserimento= readln().toString()
                    lista.add(inserimento)
                }
                else if(scelta.equals("N")||scelta.equals("n")) {
                         cicloAgg=true
                }
                else
                {
                    println("Comando non valido!")
                }
            }
        }
        else if(scelta.equals("B")||scelta.equals("b"))
        {
            println("Le tue task sono:")
            for(i in 0 until  lista.size)
            {
                println(i.toString() + " " + lista.get(i))
            }
            println("Cosa vuoi modificare?")
            var sceltaModifica:Int=0
            sceltaModifica= readln().toString().toInt()

            //Controllo che sia un numero

            println("Con cosa vuoi modifcare la tua task?")
            var modificaEffettuata: String=""
            modificaEffettuata= readln().toString()

            //manca la presa della modifica e l'effettica modfica
            lista.set(sceltaModifica, modificaEffettuata)

            //aggiornamento task
            println("Ore le tue task sono:")
            for (i in 0 until lista.size)
            {
                //stampa la lista
                println(i.toString() + " " + lista.get(i))
            }
        }
        else if(scelta.equals("C")||scelta.equals("c"))
        {
            //stampa la lista delle task
            println("La Lista delle tue task è: ")
            for (i in 0 until lista.size)
            {
                //stampa la lista
                println(i.toString() + " " + lista.get(i))
            }
            //println(lista)
        }
        else if(scelta.equals("D")||scelta.equals("d"))
        {
            println("Quale task vuoi eliminare?")
            for (i in 0 until lista.size)
            {
                //stampa la lista
                println(i.toString() + " " + lista.get(i))
            }
            //effettiva eliminazione
            println("Cosa vuoi eliminare?")
            var sceltaElimina:Int=0
            sceltaElimina= readln().toString().toInt()
            lista.removeAt(sceltaElimina)

            //aggiornamento task
            println("Ora le tue task sono:")
            for (i in 0 until lista.size)
            {
                //stampa la lista
                println(i.toString() + " " + lista.get(i))
            }
        }
        else
        {
            //parte di uscita con conferma
            println("Sei sicuro di voler uscire [S/N]")
            var choice:String=""
            choice= readln().toString()
            if(choice.equals("S")||choice.equals("s"))
            {
                println("ARRIVEDERCI")
                ciclomenu=true
            }
        }
    }


}