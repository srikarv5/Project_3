
public class TestBackend {

  public static void main(String[] args) {
    testGetBuildings();
    testShortestDistance();
    testShortestPath();

  }
  
  public static void testGetBuildings() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    testBE.printBuildings();
  }
  
  public static void testShortestDistance() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    System.out.println(testBE.getShortestDistance("8", "3"));
  }
  
  public static void testShortestPath() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    System.out.println(testBE.getShortestPath("6", "3"));
  }
  
  

}
