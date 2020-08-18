import java.util.ArrayList;
import java.util.Iterator;

public class Town extends Area {
    ArrayList townList = new ArrayList();
    String townName;
    public Town(String townName){
        this.townName = townName;
    }
    public String getTownName() {
        return townName;
    }
    public void add(Area newArea){
        townList.add(newArea);
    }
    public void remove(Area newArea){
        townList.remove(newArea);
    }
    public Area getArea(int AreaIndex){
        return (Area)townList.get(AreaIndex);
    }
    public void displayMap(){
        System.out.println("Map of "+getTownName()+"\n");
        Iterator areaIterator = townList.iterator();
        while(areaIterator.hasNext()){
            Area villageInfo = (Area)areaIterator.next();
            villageInfo.displayMap();
        }
        System.out.println("End map of "+getTownName()+"\n");
    }
}
