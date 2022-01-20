package cigma.pfe.application;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("idCtrl");

        ctrl.save(new Client(1, "ilyass"));
        ctrl.save(new Client(1, "yassine"));
        ctrl.save(new Client(1, "ahmed"));

    }

}
