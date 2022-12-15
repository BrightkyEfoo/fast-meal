package gestionEmployers;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import platCuisiné;

@objid ("71e7dd80-e5bc-4b65-acdc-90e43cb9630d")
public class Cuisinier extends Employer {
    @objid ("1bd579fd-965d-4773-989c-c51b71c4b8da")
    private List<platCuisiné> platsCuisinés = new ArrayList<platCuisiné> ();

    @objid ("540c243d-a4aa-4078-bdc9-b17696749f78")
    void setId_cuisi(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id_cuisi = value;
    }

    @objid ("223f013e-5650-4bbe-ace0-82ea900512d4")
    List<platCuisiné> getPlatsCuisinés() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.platsCuisinés;
    }

    @objid ("b0208292-66a5-41a8-a30a-1e12756a6128")
    void setPlatsCuisinés(List<platCuisiné> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.platsCuisinés = value;
    }

}
