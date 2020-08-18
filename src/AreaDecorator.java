import java.util.ArrayList;

public abstract class AreaDecorator extends Area {
    protected Area newArea;
    ArrayList townList = new ArrayList();
    public AreaDecorator(Area newArea){
        this.newArea = newArea;
    }
    public void add(Area newArea){
        townList.add(newArea);
    }

    public abstract void displayMap();
}
