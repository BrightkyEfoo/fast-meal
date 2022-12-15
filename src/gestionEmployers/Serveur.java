package gestionEmployers;

import Service;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0077d3bf-b62b-4c90-a757-487d7261e1c0")
public class Serveur extends Employer {
    @objid ("af3b4e30-07f1-4d35-881a-2f803f0fdef5")
    private Service services;

    @objid ("40770884-7928-417c-a576-f887c26a9786")
    Service getServices() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.services;
    }

    @objid ("fed0fc3c-ff97-4251-8d27-f6eccac88a4d")
    void setServices(Service value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.services = value;
    }

    @objid ("d550d2ff-cdbb-41e6-85c0-6c41724dc518")
    private void Servir() {
    }

}
