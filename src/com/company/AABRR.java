package com.company;

import java.io.InputStream;
import java.io.InputStreamReader;

public class AABRR {

    int min;
    int max;
    ABRR abrr;
    AABRR sag;
    AABRR sad;
    boolean nill;

    /**
     * Plusieurs Constructeurs pour la classe
     *
     */

    public AABRR(int min, int max, ABRR abrr, AABRR gauche, AABRR droit){

        this.min = min;
        this.max = max;
        this.abrr = abrr;
        this.sag = gauche;
        this.sad = droit;
        this.nill = false;

    }

    public AABRR(int min, int max, ABRR abrr){

        this.min = min;
        this.max = max;
        this.abrr = abrr;
        this.sag = new AABRR();
        this.sad = new AABRR();
        this.nill = false;
    }

    public AABRR(int min, int max){

        this.min = min;
        this.max = max;
        this.abrr = new ABRR();
        /*this.sag = null;
        this.sad = null;
        this.nill = false;*/
    }

    public AABRR(){

        this.min = 0;
        this.max = 0;
        this.abrr = new ABRR();
        this.sag = null;
        this.sad = null;
        this.nill = true;
    }

    /**
     * Méthode permettant de transformer le noeud en une feuille
     *
     */
    public void toFeuille(ABRR abrr, int min, int max){
        this.abrr = abrr;
        this.nill = false;
        this.min = min;
        this.max = max;
        this.sag = new AABRR();
        this.sad = new AABRR();
    }

    /**
     * Méthode permettant de recopier les informations d'un noeud n
     *
     */
    public void Recopier(AABRR n){
        this.abrr = n.abrr;
        this.min = n.min;
        this.max = n.max;
        this.nill = n.nill;
        this.sag = n.sag;
        this.sad = n.sad;

    }

    /**
     * Méthode permettant d'ajouter un ABRR dans un AABRR.
     * Pré-Condition : m et M ne sont pas compris dans un interval existant
     */
    public void Ajouter(ABRR abrr, int m, int M){

        if(this.nill){

            toFeuille(abrr,m,M);

        } else {

            if(m <= min){
                sag.Ajouter(abrr,m,M);
            } else {
                sad.Ajouter(abrr,m,M);
            }
        }

    }

    /**
     * Méthode permettant de créer un AABRR depuis un fichier
     *
     */
    public AABRR creerAABRRviaFichier(String cheminFichier){

        String ligne = "";

        //InputStream ips = new
        return new AABRR();
    }

}
