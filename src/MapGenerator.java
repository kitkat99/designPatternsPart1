public class MapGenerator {
    public static void main(String[] args) {
        Area westArea = new Town("West Area");
        Area cityOfWaterbane = new Town("City Of Waterbane");
        var cityDecorator = new Mist(cityOfWaterbane);
        Area dungeonOfDespair = new Town(" Dungeon of Despair");
        var dungeonDecorator = new UnknownArea(dungeonOfDespair);
        Area eastArea = new Town("East Area");
        var eastMistDecorator = new Mist( new UnknownArea(eastArea));
        Area worldMap = new Town("World Map");
        worldMap.add(westArea);
        westArea.add(cityDecorator);
        cityOfWaterbane.add(new Village("Townhall"));
        cityOfWaterbane.add(new Village("Tavern"));
        westArea.add(dungeonDecorator);
        dungeonOfDespair.add(new Village("Entrance Hall"));
        worldMap.add(eastMistDecorator);
        eastArea.add(new Village("Pit of Wyrms"));
        Map map = new Map(worldMap);
        map.getAreaList();
    }
}
