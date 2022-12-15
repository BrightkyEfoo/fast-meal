package gestionClient;

import java.util.ArrayList;
import java.util.List;
import Livraison;
import Personne;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionPayement.Facture;
import operationClient.Commande;
import operationClient.Panier;

@objid ("720c913f-7285-42f6-9da2-e379dcddee93")
public class Client extends Personne {
    @objid ("3ba85ffe-1310-42f0-80eb-fd352e277a01")
    private float solde;

    @objid ("ccd170ed-e8d1-427e-8cfb-14ce610c6193")
    private Panier panier;

    @objid ("78b549e7-a5fb-43eb-98f5-67ef65ea2d99")
    private List<Commande> commandes = new ArrayList<Commande> ();

    @objid ("9e6b7cef-6e8a-4be5-883e-310d1cf08063")
    private List<Facture> factures = new ArrayList<Facture> ();

    @objid ("64ba5be1-10c0-40e8-b0fa-ea2ed710bcfd")
    private List<Livraison> livraisons = new ArrayList<Livraison> ();

    @objid ("951312fd-db6a-4618-9ef6-3a2225be9d49")
    private void commander() {
    }

    @objid ("e1704a8d-6e84-4fdf-98d6-a169521c3606")
    private void modifierCommande(int id_cmd) {
    }

    @objid ("703a17ea-83b7-4258-8d4c-cae9ad8de09b")
    private void annulerCommande(int id_cmd) {
    }

    @objid ("d1c2310e-3d69-4035-a2fb-35e5d1a57b18")
    float getSolde() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solde;
    }

    @objid ("4f5ff917-6a79-4775-a13f-4cd14118d296")
    void setSolde(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solde = value;
    }

    @objid ("5c411537-a9ad-47b7-9b70-6871adeefe93")
    private void ajoutPanier(int id_produit, int qte) {
    }

    @objid ("1bc20376-97d4-497c-aaf3-20df9e441ec1")
    public Client(String nom, String prenom, String email, String password, String dateNaiss, String telPers) {
    }

    @objid ("c5bbb082-e8af-4657-a40e-b1e81fc4d9c0")
    public Panier getPanier() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.panier;
    }

    @objid ("08a567c6-b7fa-4700-8998-2bd9b428e4ba")
    void setPanier(Panier value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.panier = value;
    }

    @objid ("a587c4a0-0917-44f4-ba97-2d102f38816e")
    List<Commande> getCommandes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.commandes;
    }

    @objid ("2c338e1c-bae4-4dad-a9bb-9a521dc450e9")
    void setCommandes(List<Commande> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.commandes = value;
    }

    @objid ("89c9dbec-4d5c-4615-ae63-3f278488d3f1")
    List<Livraison> getLivraisons() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.livraisons;
    }

    @objid ("d72451fe-6c17-4f0b-9863-f819d1d9a12a")
    void setLivraisons(List<Livraison> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.livraisons = value;
    }

    @objid ("a2cd6250-1510-446b-846e-37e95a188b31")
    protected void finalize() {
    }

}
