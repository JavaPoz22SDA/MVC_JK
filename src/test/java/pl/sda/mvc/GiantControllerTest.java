package pl.sda.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GiantControllerTest {

    private GiantModel giantModel;
    private GiantView giantView;
    private GiantController giantController;


    @BeforeEach
    public void setUp(){
        System.out.println("przed");
        giantModel = Mockito.mock(GiantModel.class);
        giantView = Mockito.mock(GiantView.class);
        giantController = new GiantController(giantModel, giantView);
    }

    @Test

    public void testSetHealth(){

/*        Mockito.verify(giantModel,
                Mockito.times(0));*/

        for(final Health health: Health.values()){
            giantController.setHealth(health);
            Mockito.verify(giantModel).setHealth(health); //verify sprawdza czy okrślony obiekt wywołał metodę
        }

        giantController.getHealth();
        Mockito.verify(giantModel).getHealth();

    }
    @Test
    public void testSetFatigue(){

        for(final Fatigue fatigue: Fatigue.values()){
            giantController.setFatigue(fatigue);
            Mockito.verify(giantModel).setFatigue(fatigue);
        }
        giantController.getFatigue();
        Mockito.verify(giantModel).getFatigue();

    }
    @Test
    public  void testSetNourishment(){

        for (final Nourishment nourishment: Nourishment.values()){
            giantController.setNourishment(nourishment);
            Mockito.verify(giantModel).setNourishment(nourishment);
        }
        giantController.getNourishment();
        Mockito.verify(giantModel).getNourishment();
    }

}