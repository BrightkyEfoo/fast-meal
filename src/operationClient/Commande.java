package operationClient;

import java.util.Date;
import Adresse;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionClient.Client;
import gestionEmployers.Livreur;
import gestionPayement.Facture;

@objid ("de401708-fb85-4a68-a466-05c037175367")
public class Commande {
    @objid ("67f20e0c-7f05-45a7-9acc-04c01c39c412")
    private int id;

    @objid ("917f2845-14f7-471d-a2a0-b52c4ab7fb9e")
    private Date date;

    @objid ("0ede005f-d569-42a6-b59e-087964081f40")
    private float total;

    @objid ("ef5a7ae3-df6e-4ab0-9b39-8da62d5ca0d6")
    private String statusCmd;

    @objid ("5a23b385-4ce0-4b5a-9ac1-b84b8122583f")
    private int quantite;

    @objid ("a04e1d6d-d353-4b3c-8d27-70eab6ec1b6b")
    private Client client;

    @objid ("38168225-5bd1-49a4-8409-b2ba67592955")
    public Livreur estlivrer;

    @objid ("fae52424-7ca0-435c-8635-7e111c47f7be")
    private Facture facture;

    @objid ("582fef8f-2540-42ea-af94-e338295ef8e6")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("9b1de496-47d9-4ccd-9cf2-e6c9b72fe9e9")
    Date getDate() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.date;
    }

    @objid ("6682fba5-f3a3-431f-9dde-2ca482682037")
    void setDate(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.date = value;
    }

    @objid ("8e25d40a-0248-4aba-84ce-4e2d1b0fde08")
    float getTotal() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.total;
    }

    @objid ("6e386da8-568d-4650-9134-71e7f5524687")
    void setTotal(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.total = value;
    }

    @objid ("2652ac29-49d7-4792-b31b-1bced09185df")
    String getStatusCmd() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.statusCmd;
    }

    @objid ("d3473017-e0f2-4ea7-bf5a-7eaf5a1fa62a")
    void setStatusCmd(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.statusCmd = value;
    }

    @objid ("dba06aa2-0377-46f5-aa71-a506b19fc8d8")
    int getQuantite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.quantite;
    }

    @objid ("9a44760d-9bee-4a98-9465-c767c26ba87d")
    void setQuantite(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.quantite = value;
    }

    @objid ("e81d0e2c-8078-4f6b-9ac0-5bdaed63607e")
    Client getClient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.clients;
    }

    @objid ("a0c413c9-cb22-48c1-aef6-0edea93e91b0")
    public void setClient(Client value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.clients = value;
    }

    @objid ("91f669dd-ff3f-4be2-a567-7b5750c354d7")
    Facture getFacture() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.facture;
    }

    @objid ("27ff67cb-b028-469b-8015-a2421afb2dca")
    void setFacture(Facture value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.facture = value;
    }

}
