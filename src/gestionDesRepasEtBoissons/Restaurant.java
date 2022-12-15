package gestionDesRepasEtBoissons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Adresse;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import contrat_embauche;
import gestionClient.Client;

@objid ("ad5d04d2-8327-423c-966d-4de4d553c1a3")
public class Restaurant {
    @objid ("86249898-f82e-4f02-9f36-95c815e5f0c6")
    private static int id;

    @objid ("d23b1110-06ea-4b72-afd5-425c76c5e7ab")
    private String nom;

    @objid ("628c53d1-22a0-4596-a4b3-7c6f774bcdfb")
    private String heure_overture;

    @objid ("e7a9ad64-98f6-48b7-bdb5-cde41d45aed3")
    private String heure_fermeture;

    @objid ("98cf218b-80c4-4db5-a1db-befbba402f15")
    private Date[] joursOuvrables;

    @objid ("973bcd96-3ee4-4138-b4a0-5f9a8b016b02")
    public List<Client> client = new ArrayList<Client> ();

    @objid ("746f5a63-d678-480b-8476-60b41361e87a")
    private List<Adresse> adresses = new ArrayList<Adresse> ();

    @objid ("b80d4cc2-d2b7-4994-9295-ef7576a345f4")
    private List<Menu> menus = new ArrayList<Menu> ();

    @objid ("d5db927b-7355-42d2-97fd-d945f7325404")
    private List<Boisson> boissons = new ArrayList<Boisson> ();

    @objid ("aa8daba8-5ccf-4bda-aea9-f4ed71b2070c")
    private List<contrat_embauche> contrats = new ArrayList<contrat_embauche> ();

    @objid ("264c72bf-beb3-4c7e-86a0-c6b45b6185d2")
    String getHeure_overture() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.heure_overture;
    }

    @objid ("32cfca9d-1372-464d-9e6b-c0a3b0d53e73")
    void setHeure_overture(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.heure_overture = value;
    }

    @objid ("d8e7062f-70ff-46a9-888c-d3c3c3569e58")
    String getHeure_fermeture() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.heure_fermeture;
    }

    @objid ("5afaeb41-180c-41a3-a2a6-20f69736a97f")
    void setHeure_fermeture(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.heure_fermeture = value;
    }

    @objid ("dd1d477f-f263-4fce-b27a-03761b9f5db8")
    Date[] getJoursOuvrables() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joursOuvrables;
    }

    @objid ("8dd0148e-d330-4758-b70e-07bd0a02c085")
    void setJoursOuvrables(Date[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joursOuvrables = value;
    }

    @objid ("890850dd-cd02-4cbf-a0ee-1b519426b1b7")
    static int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return id;
    }

    @objid ("53de94a5-066a-4421-b9f2-2c6ef040bc3d")
    List<Adresse> getAdresses() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresses;
    }

    @objid ("524ddb34-fdd9-47d6-9c6b-a80d99e5b0b6")
    void setAdresses(List<Adresse> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresses = value;
    }

    @objid ("ab0b649e-e8b1-4055-9da2-276c9797d77f")
    List<Boisson> getBoissons() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.boissons;
    }

    @objid ("b1bf1f2a-13c8-4e33-992f-fcb6dd362f10")
    void setBoissons(List<Boisson> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.boissons = value;
    }

    @objid ("73dc6859-37d5-4508-9b22-3591071eafa1")
    List<Menu> getMenus() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.menus;
    }

    @objid ("bfef43ab-6a11-43ee-8e3c-d62bb108d020")
    void setMenus(List<Menu> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.menus = value;
    }

    @objid ("919e5ad4-b062-41ac-83e9-3083b1f0c811")
    List<contrat_embauche> getContrats() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.contrats;
    }

    @objid ("1c4fb118-08b3-4356-9a59-690d0bdd2034")
    void setContrats(List<contrat_embauche> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.contrats = value;
    }

}
