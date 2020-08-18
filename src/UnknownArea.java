public class UnknownArea extends AreaDecorator {
    public UnknownArea(Area newArea){
        super(newArea);
    }
    @Override
    public void displayMap() {
        System.out.println("You have not been there yet");
    }
}
