package com.company;

public class ABR {

    // Valeur du noeud racine
    int val;

    // Sous arbres gauche et droit
    ABR sag;
    ABR sad;

    // Attribut permettant de dire si le noeud est vide
    boolean nill;

    /**
     * Plusieurs Constructeurs
     *
     */
    public ABR(int value, ABR g, ABR d) {
        this.val = value;
        this.sag = g;
        this.sad = d;
        nill = false;
    }

    public ABR(int value){
        this.val = value;
        sag = new ABR();
        sad = new ABR();
        nill = false;
    }

    public ABR(){
        val = 0;
        sag = null;
        sad = null;
        nill = true;
    }

    /**
     * Méthode permettant de transformer un noeud en une feuille de l'arbre
     *
     */
    public void toFeuille(int v){
        this.val = v;
        nill = false;
        sag = new ABR();
        sad = new ABR();
    }

    /**
     * Méthode permettant d'ajouter un élément dans un ABR
     *
     */
    public void Ajouter(int v){

        if(nill){
            this.toFeuille(v);
        } else {

            if(v <= val){
                sag.Ajouter(v);
            }else{
                sad.Ajouter(v);
            }
        }

    }

    /**
     * Méthode permettant de parcourir de façon infixe l'ABR et d'afficher les valeurs
     *
     */
    public void Parcourir(){

        if(!nill){
            sag.Parcourir();
            System.out.println(val + " ");
            sad.Parcourir();
        }

    }

    /**
     * Méthode permettant de transformer un ABR en String
     *
     */
    public String toString(){

        String StringABR = "";
        String gauche = "";
        String droit = "";

        if(this.sag != null) {
            gauche = this.sag.toString();
        }

        if(this.sad != null) {
            droit = this.sad.toString();
        }

        if(this.val != 0){
            StringABR = this.val + ";" + gauche + droit;
        }

        return StringABR;

    }

    /**
     * Méthode permettant de récupérer la valeur maximale de l'ABR
     *
     */
    public int getMax(){

        int max = 0;
        if(this.sad == null){
            max = this.val;
        } else {
            max = this.sad.getMax();
        }

        return max;
    }

    /**
     * Méthode permettant de récupérer la valeur minimale de l'ABR
     *
     */
    public int getMin(){

        int min = 0;

        if(this.sag == null){
            min = this.val;
        } else {
            min = this.sag.getMin();
        }

        return min;
    }

    /**
     * Méthode permettant de retourner le nombre de noeuds de l'ABR
     *
     */
    public int getNombreNoeuds(){


        if(this.sag.isNill() && this.sad.isNill()){

            return 1;

        } else if(this.sag.isNill() && this.sad != null){

            return this.sad.getNombreNoeuds() + 1;

            } else if (this.sag != null && this.sad.isNill()){

                return this.sag.getNombreNoeuds() + 1;

            } else {

                return this.sag.getNombreNoeuds() + this.sad.getNombreNoeuds() + 1;

            }
    }

    /**
     * Méthode permettant de transformer un ABR en AABRR
     *
     */
    public AABRR ABRenAABRR(int k){

        int min, max;

        // Récupération des valeurs min et max de l'ABR
        min = this.getMin();
        max = this.getMax();

        // Création de l'AABRR
        AABRR aabrr = new AABRR();

        int




    }

    // Getter

    public int getVal() {
        return val;
    }

    public ABR getSag() {
        return sag;
    }

    public ABR getSad() {
        return sad;
    }

    public boolean isNill() {
        return nill;
    }

    // Setter

    public void setVal(int val) {
        this.val = val;
    }

    public void setSag(ABR sag) {
        this.sag = sag;
    }

    public void setSad(ABR sad) {
        this.sad = sad;
    }

    public void setNill(boolean nill) {
        this.nill = nill;
    }

}
