package com.company;

public class ABRR {

    int val;
    boolean nill;
    ABRR sag;
    ABRR sad;

    /**
     * Plusieurs Constructeurs
     *
     */
    public ABRR(int value, ABRR gauche, ABRR droit){

        this.val = value;
        this.sag = gauche;
        this.sad = gauche;
        this.nill = false;
    }

    public ABRR(int value){
        this.val = value;
        this.sag = null;
        this.sad = null;
        this.nill = false;
    }

    public ABRR(){
        this.val = 0;
        this.sag = null;
        this.sad = null;
        this.nill = true;
    }

    /**
     * Méthode permettant de transformer un noeud en une feuille de l'arbre
     *
     */
    public void toFeuille(int v){
        this.val = v;
        nill = false;
        sag = new ABRR();
        sad = new ABRR();
    }

    /**
     * Méthode permettant de copier les informations d'un Noeud
     *
     */
    public void Recopier(ABRR n){
        this.val = n.val;
        this.sag = n.sag;
        this.sad = n.sad;
        this.nill = n.nill;
    }

    /**
     * Méthode permettant d'ajouter un élément dans un ABRR
     *
     */
    public void Ajouter(int v){

        if(nill){
            toFeuille(v);
        } else {

            if(v <= val){
                sad.Ajouter(v);
            } else {
                sag.Ajouter(v);
            }
        }

    }


    /**
     * Méthode permettant de rechercher un élément dans un ABRR
     *
     */
    public boolean Rechercher(int v){

        if(nill){

            return false;

        } else {

            if(val == v) {

                return true;

            } else if(v <=val){

                return sad.Rechercher(v);

            } else {

                return sag.Rechercher(v);

            }
        }
    }
}
