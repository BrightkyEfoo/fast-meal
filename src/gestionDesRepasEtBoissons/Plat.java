package gestionDesRepasEtBoissons;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionEmployers.webmaster;

@objid ("22a95825-fe02-444d-86d7-986bb4b5adc6")
public class Plat {
    @objid ("b75cfbec-8580-4314-9c59-2ee2bc6020b4")
    protected int id;

    @objid ("6b9e4323-01fc-407e-b8ad-32040f68b7b2")
    protected String nom;

    @objid ("12c1ad67-82d2-4f65-a231-c56d2a7583ea")
    private String desription;

    @objid ("25f5798e-eff1-48c0-b5dc-6645a0e09d6b")
    private String image;

    @objid ("47d107b0-ea39-4c24-8b57-9be9b042363f")
    private float prix;

    @objid ("8d613c86-5aed-4110-9758-06b4c91828e2")
    public webmaster webmaster;

    @objid ("a7e877b4-8f39-4020-97c9-82bda876a365")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("1eb0241b-b0c5-426e-87fd-e2f0a12ce20d")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("9380daba-f18c-4ae0-8abe-5fc0043308bb")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("7ab4d6b4-8a5b-4486-a8ec-4fb460c8942b")
    String getDesription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.desription;
    }

    @objid ("e1d6b2bd-a70a-469b-ae38-76cc10f0eafa")
    void setDesription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.desription = value;
    }

    @objid ("89db3dfe-e551-4d06-b3dc-871e89872fc6")
    String getImage() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.image;
    }

    @objid ("2fa66f47-8984-4b6c-a400-71a035cbfc95")
    void setImage(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.image = value;
    }

    @objid ("f0744235-59eb-42cc-93fa-3dd24e693139")
    float getPrix() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prix;
    }

    @objid ("2f9398eb-4e4e-4672-8a72-f6c4767d92f4")
    void setPrix(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prix = value;
    }

}
