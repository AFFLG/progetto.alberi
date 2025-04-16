public class Alberobinario {
    // Radice dell'albero
    private NodoAlbero radice;

    // Costruttore: crea un albero vuoto
    public Alberobinario() {
        this.radice = null;
    }

    // Metodo per ottenere la radice:se metto la radice prima privata poi col main non ci potra "accedere"
      public NodoAlbero getRadice() {
        return radice;
      }
    // 1) Aggiunta del nodo (inserimento di un numero nell'albero)
    public void aggiungiNodo(int valore) {
        // Crea il nuovo nodo
        NodoAlbero n = new NodoAlbero(valore);

        // Se l'albero è vuoto, il nuovo nodo diventa la radice
        if (radice == null) {
            radice = n;
        } else {
            // Altrimenti, aggiungiamo il nodo nella posizione giusta (libera)
            NodoAlbero nodoCorrente = radice;
            NodoAlbero nodoPrecedente = null;

            // Scorriamo l'albero fino a trovare un posto vuoto
            while (nodoCorrente != null) {
                nodoPrecedente = nodoCorrente;

                // Se il valore da inserire è minore, andiamo a sinistra
                if (valore < nodoCorrente.getDati()) {
                    nodoCorrente = nodoCorrente.getSinistro();
                } else {
                    // Se il valore è maggiore o uguale, andiamo a destra
                    nodoCorrente = nodoCorrente.getDestro();
                }
            }

            // Una volta trovato inseriamo il nuovo nodo
            if (valore < nodoPrecedente.getDati()) {
                nodoPrecedente.setSinistro(n);
            } else {
                nodoPrecedente.setDestro(n);
            }
        }
    }

    //2) vista anticipata

    public void vistaAnticipata(NodoAlbero p){
        if(p == null){
            return;
        }
        System.out.println(p.getDati()); //stampa

        if(p.getSinistro() != null){
            vistaAnticipata(p.getSinistro()); // visita il figlio sinistro
        }
        if(p.getDestro() != null){
            vistaAnticipata(p.getDestro()); // visita il figlio destro
        }
        
    }

    // 3) vista differita 
    public void vistaDifferita(NodoAlbero foglia){
        if(foglia == null){
            return;
        } 
        // guardiamo se ha un figlio
        if(foglia.getSinistro() != null){
            vistaDifferita(foglia.getSinistro());
        }
        //se non ha figli (stampa)
        System.out.println(foglia.getDati());
        if(foglia.getDestro() != null){
            vistaDifferita(foglia.getDestro());
        }

    }
 
    // 4) vista simmetrica
    public void vistaSimmetrica(NodoAlbero n){
        if(n == null){
            return;
        }
        // vista il sottoalbero sinistro
        if(n.getSinistro() != null){
            vistaSimmetrica(n.getSinistro());
        }
        System.out.println(n.getDati());
        // vista sottoalbero destro
        if(n.getDestro() != null){
            vistaSimmetrica(n.getDestro());
        }
    }
    //5) albero binario di ricerca (Binary Search Tree)
    public NodoAlbero ricerca(int valore) {
        return ricercaRicorsiva(radice, valore);
    } // Metodo ricorsivo per cercare il valore in un nodo

    private NodoAlbero ricercaRicorsiva(NodoAlbero nodo, int valore) {
        if (nodo == null) {
            return null; //valore non presente
        }
        if (nodo.getDati() == valore) {
            return nodo;// valore trovato
        }
        if (valore < nodo.getDati()) {
            return ricercaRicorsiva(nodo.getSinistro(), valore); //ricerca nel sottoalbero sinistro
        }
        return ricercaRicorsiva(nodo.getDestro(), valore);// ricerca nel sottoalbero destro
    }
}



