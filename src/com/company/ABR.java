package com.company;

public class ABR {

    // Valeur du noeud racine
    int node;

    // Sous arbres gauche et droit
    ABR sag;
    ABR sad;

    /**
     * Constructeur
     *
     * @param nodeVal
     * @param sag
     * @param sad
     */
    public ABR(int nodeVal, ABR sag, ABR sad) {
        this.node = nodeVal;
        this.sag = sag;
        this.sad = sad;
    }

    /**
     * Ajoute un element à l'arbre
     *
     * @param val
     */
    public void add(int val){
        if (val <= node){
            this.sag.add(val);
        }
        else{
            this.sad.add(val);
        }
    }


}
