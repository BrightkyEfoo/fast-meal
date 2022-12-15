package gestionEmployers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Livraison;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionDesRepasEtBoissons.Plat;

@objid ("9d34cd59-f38e-4fb4-818e-af03cfdc76a3")
public class Livreur extends Employer {
    @objid ("d5fb2c55-b9f0-4e06-8b4d-b166d5324280")
    private String moyenLocomotion;

    @objid ("1a8f7690-f1a8-4e40-8c2c-86cc34ef2764")
    private String ville_travail;

    @objid ("831bde5c-9746-4655-bdcb-780cbb260125")
    private String ville_habitation;

    @objid ("65259257-f98c-4bf3-b7c1-09d3c23dd7c9")
    public List<Plat> recuperer = new ArrayList<Plat> ();

    @objid ("bf110d54-0f53-4c7b-9a94-e5ded3db2226")
    private List<Livraison> livraisons = new ArrayList<Livraison> ();

    @objid ("bb8d953a-0041-4073-9460-ce71c5e72f86")
    public void listeLivraisonDispo() {
    }

    @objid ("0a00c199-804d-4728-89dc-3a1a73928406")
    String getMoyenLocomotion() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.moyenLocomotion;
    }

    @objid ("3e90aa9f-8b66-4ad2-b26c-47d0310dba92")
    void setMoyenLocomotion(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.moyenLocomotion = value;
    }

    @objid ("d2d133ff-a634-4a97-844b-7fd05f548e28")
    String getLieuNais() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.lieuNais;
    }

    @objid ("8d4a8344-52f8-4c47-a60f-e1c58db315e9")
    void setLieuNais(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.lieuNais = value;
    }

    @objid ("0147084c-5755-4a29-be18-94dcb0e8dcc5")
    String getVille_travail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ville_travail;
    }

    @objid ("84075de2-366c-474e-b3ad-5e7a295c609f")
    void setVille_travail(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.ville_travail = value;
    }

    @objid ("67ea488f-f217-47be-9255-6c50b8ada340")
    String getVille_habitation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ville_habitation;
    }

    @objid ("edf9658f-440c-45ae-b812-75c0e8ccea63")
    void setVille_habitation(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.ville_habitation = value;
    }

    @objid ("213789d2-b9c7-4ec0-a20b-f5b511bc0ad6")
    List<Livraison> getLivraisons() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.livraisons;
    }

    @objid ("277a4f32-0f64-4b6a-82eb-77b17883bfc2")
    void setLivraisons(List<Livraison> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.livraisons = value;
    }

    @objid ("95cdf768-6af5-497a-b27f-5bb53766ca56")
    void set(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this. = value;
    }

}
