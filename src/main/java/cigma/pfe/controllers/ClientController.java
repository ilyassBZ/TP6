package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {

    IClientService service;

    public ClientController() {
        System.out.println("Client controler");
    }

    public IClientService getService() {
        return service;
    }

    public void setService(IClientService service) {
        this.service = service;
    }

    public void save(Client c) {
        System.out.println("Layer Level...");
        service.save(c);
    }
}
