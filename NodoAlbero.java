public class NodoAlbero {
    public int dato;
    public NodoAlbero sinistro;
    public NodoAlbero destro;

    public NodoAlbero(int info) {
        this.dato = info;
        this.sinistro = null;
        this.destro = null;
    }

    // Cambia il valore del nodo
    public void getDati(int dato) {
        this.dato = dato;
    }

    // Restituisce il valore contenuto nel nodo
    public int getDati() {
        return dato;
    }

    // imposta il figlio sinistro del nodo
    public void setSinistro(NodoAlbero sinistro){
        this.sinistro = sinistro;
    }

    public NodoAlbero getSinistro(){
        return sinistro;
    }

    // imposta il figlio destro del nodo
    public void setDestro(NodoAlbero destro){
        this.destro = destro;
    }

    public NodoAlbero getDestro(){
        return destro;
    }

    // true se il nodo è una foglia (ovvero non ha figli)
    public boolean isFoglia() {
        return sinistro == null && destro == null;
    }
}