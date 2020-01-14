package naru.trainer_app.service.client;

import naru.trainer_app.model.Client;


import java.util.List;


public interface ClientService {

   List<Client> findAll();
   Client getById(int clientId);
   void save (Client client);
   void delete(int clientId);

}
