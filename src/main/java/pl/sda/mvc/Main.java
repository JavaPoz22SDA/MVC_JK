package pl.sda.mvc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.SATURATED);

        GiantController giantController
                = new GiantController(giantModel, giantView);


        giantController.updateView();
        giantController.getHealth(Health.DEAD);
        giantController.updateView();



    }
}
