package gestionDesRepasEtBoissons;

import java.util.ArrayList;
import java.util.List;
import Service;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("35a55d38-1a81-4193-82e7-f6f42f3cabac")
public class Menu {
    @objid ("27289966-051b-4172-8230-1e2655c2a6e5")
    private int id;

    @objid ("400e9f8c-1f52-412e-9df8-f4f523c4ab38")
    private String datePublication;

    @objid ("39597719-2bda-458e-bce1-2e3c3a8183c5")
    private float prix;

    @objid ("e75b99ba-d9c5-4604-a7a3-35ea336026de")
    private List<Plat> plats = new ArrayList<Plat> ();

    @objid ("b48f2ac5-1df7-4583-a1f7-e13d593fcc7b")
    private List<Boisson> boissons = new ArrayList<Boisson> ();

    @objid ("9077663a-3889-409b-a6f5-0c297c43ecc1")
    private Service service;

    @objid ("eaed1054-59d6-4ab9-a611-68a72a23c5e7")
    private Restaurant restaurant;

    @objid ("80e26dc0-f4f0-4671-8466-c0ad00db8073")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("f75cf1e6-2f04-4cbe-810e-a38bb755dd29")
    void setId(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id = value;
    }

    @objid ("e47904b4-69d1-4f72-9bb1-0535a3993438")
    String getDatePublication() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.datePublication;
    }

    @objid ("5cdacc77-384c-4733-ab1c-12a733ef9dc5")
    void setDatePublication(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.datePublication = value;
    }

    @objid ("8d224bd3-f221-4b1d-b226-bfdb85442cfd")
    float getPrix() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prix;
    }

    @objid ("fcf10c4a-8052-417a-be02-34ace1106891")
    void setPrix(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prix = value;
    }

    @objid ("1bcb4b8f-21be-416e-858b-9e15c173e270")
    List<Plat> getPlats() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.plats;
    }

    @objid ("e434e7bb-5068-46c0-8bd9-500ef899268d")
    void setPlats(List<Plat> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.plats = value;
    }

    @objid ("bbe12255-69fb-445e-9c1d-b0e7f384d042")
    Service getService() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.service;
    }

    @objid ("ef9a435e-2d7e-4dd4-abd0-5f7ae0658827")
    void setService(Service value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.service = value;
    }

    @objid ("7867ce79-8820-4e5c-a09c-7481d277296b")
    void setPlats(List<Plat> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.plats = value;
    }

}
