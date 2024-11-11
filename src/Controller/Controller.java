package src.Controller;

import src.Service.Service;

public class Controller {
    private final Service service;
    public Controller(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }


}
