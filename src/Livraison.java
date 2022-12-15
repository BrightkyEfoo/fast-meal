import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionClient.Client;
import gestionEmployers.Livreur;

@objid ("adeb9360-43f0-42da-97b0-868360fa5c2c")
public class Livraison {
    @objid ("2e414aab-3313-4ac1-91d5-10173e1c8931")
    private Date date;

    @objid ("78121aab-7660-4c04-b364-7cb90620c5c0")
    private int heure;

    @objid ("606bb2ce-be7a-4a41-85b2-6bc3a4d4f2fd")
    private int id;

    @objid ("380d8c53-909e-443b-aa71-d1c9d45bfde4")
    private static int count;

    @objid ("2766d42c-14ed-4f57-a053-af530f67919b")
    private Livreur livreur;

    @objid ("42df7595-fc8e-4af2-a228-7fe96afcf6aa")
    private Client client;

    @objid ("def45081-97a6-4d1f-a363-5cc131434867")
    private Adresse adresse;

    @objid ("b0e33153-9fd6-4455-94e2-c37d3d93bce7")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("0a1b5177-636f-4382-9815-6eacc7f15400")
    protected void finalize() {
    }

    @objid ("3dfb3f5a-d20a-431c-b0df-b3ef0d28840c")
    public Livraison(Date date, Adresse adresse, Livreur livreur, int heure, Client client) {
        this.count = this.count ++;
        this.date = date;
        this.adresse = adresse;
        this.livreur = livreur;
        this.heure = heure;
        this.client = client;
    }

    @objid ("9a866ff5-82ac-4be4-b044-b0bb85b6e7d7")
    static int getCount() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return count;
    }

}
