public class main {
    public static void main(String[] args) {
        // Creazione dell'albero binario
        Alberobinario albero = new Alberobinario();
        
        // Aggiunta dei numeri che ho deciso d'inserire nell'albero
        albero.aggiungiNodo(50);
        albero.aggiungiNodo(30);
        albero.aggiungiNodo(20);
        albero.aggiungiNodo(40);
        albero.aggiungiNodo(70);
        albero.aggiungiNodo(60);
        albero.aggiungiNodo(80);

        // Stampa l'albero con vista anticipata
        System.out.println("Vista anticipata:");
        albero.vistaAnticipata(albero.getRadice());

        // Stampa l'albero con vista differita
        System.out.println("\nVista differita:");
        albero.vistaDifferita(albero.getRadice());

        // Stampa l'albero con vista simmetrica
        System.out.println("\nVista simmetrica:");
        albero.vistaSimmetrica(albero.getRadice());

        // Ricerca di un valore nell'albero
        int valoreDaCercare = 40;
        NodoAlbero risultato = albero.ricerca(valoreDaCercare);
        
        if (risultato != null) {
            System.out.println("\nIl valore è stato trovato!!!: " + risultato.getDati());
        } else {
            System.out.println("\nValore " + valoreDaCercare + " non trovato all'interno dell'albero :().");
        }
    }
}