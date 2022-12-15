package gestionEmployers;

import java.util.Date;
import Personne;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import contrat_embauche;

@objid ("31205b12-b295-4ec2-b6e3-77cea3ebc3d4")
public class Employer extends Personne {
    @objid ("58321a51-597e-4663-beff-264751622d6f")
    private Date dateEmbauche;

    @objid ("3df14dcd-27c8-40c4-b6a7-acfea1be0b1b")
    private float solde;

    @objid ("076e97f9-e726-4b01-aac0-bb8f32cbb5f0")
    private contrat_embauche contrat;

    @objid ("c6e74bf3-fc92-4c8e-ab59-4d7d77f02936")
    Date getDateEmbauche() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateEmbauche;
    }

    @objid ("9bd891cd-37d5-4491-8856-147fae912714")
    void setDateEmbauche(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateEmbauche = value;
    }

    @objid ("48b2dbdf-2e8a-40d8-83e9-bd175464eff5")
    float getSolde() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solde;
    }

    @objid ("5f74193d-e64b-4733-8263-d769a3e1fa67")
    void setSolde(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solde = value;
    }

    @objid ("73f710cc-4105-4e75-b32b-77dd255c59e7")
    contrat_embauche getContrat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.contrat;
    }

    @objid ("f1ac715e-c8e2-4ac8-9e75-3471287c3dc0")
    void setContrat(contrat_embauche value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.contrat = value;
    }

}
