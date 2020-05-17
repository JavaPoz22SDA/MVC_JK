package pl.sda.mvc;

public enum Fatigue {

   TIRED("tired"), SLEEPING("sleepein");

   private String title;

    Fatigue(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Fatigue{" +
                "title='" + title + '\'' +
                '}';
    }


}
