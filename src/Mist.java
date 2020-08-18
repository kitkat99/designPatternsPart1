import java.util.ArrayList;

public class Mist extends AreaDecorator {
    public Mist(Area newArea){
        super(newArea);
    }

    @Override
    public void displayMap() {
        System.out.println("The following area is covered by heavy mist today");
        newArea.displayMap();
    }

}
