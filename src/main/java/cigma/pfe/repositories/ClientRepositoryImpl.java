package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements IClientRepository {

    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl");
    }

    @Override
    public Client save(Client c) {
        System.out.println("Layer : ClientRepositoryImpl Level");
        return null;
    }

}
