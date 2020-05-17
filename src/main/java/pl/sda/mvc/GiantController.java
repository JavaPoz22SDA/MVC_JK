package pl.sda.mvc;

public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView){
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public void updateView(){
        this.giantView.displayGiant(this.giantModel);
    }

}
