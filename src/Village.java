public class Village extends Area {
    String villageName;
    public Village(String villageName){
        this.villageName = villageName;
    }

    @Override
    public String getVillageName() {
        return villageName;
    }

    @Override
    public void displayMap() {
        System.out.println("The "+getVillageName());
    }
}
