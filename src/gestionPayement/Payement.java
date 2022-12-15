package gestionPayement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionEmployers.Employer;

@objid ("c008e2a1-924e-4324-bf61-777b9b4570cf")
public class Payement {
    @objid ("5f4559e1-de6c-441d-b2a7-277fcc8565c1")
    private int id_payement;

    @objid ("6e362c6b-a276-4b35-95da-9b15f0c6b903")
    public Employer employer;

    @objid ("e4d53bc8-ac96-4cd1-82d8-b9e59e91cccd")
    int getId_payement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id_payement;
    }

}
