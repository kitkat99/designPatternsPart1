public class Map {
    Area areaList;
    public Map(Area areaList){
        this.areaList = areaList;
    }
    public void getAreaList(){
        areaList.displayMap();
    }
}
