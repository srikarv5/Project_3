import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;


public class Backend {
  
  private CS400Graph<String> map;
  
  
  public Backend(Map map) {
    this.map = map;
  }
  
  /*
   * Prints all of the buildings in the Map
   */
  public void printBuildings() {
    //String[] buildings = new String[];
    Enumeration<String> enumeration = map.vertices.keys();
    
    while(enumeration.hasMoreElements()) {
      String key = enumeration.nextElement();
      System.out.println(map.vertices.get(key).data);
      
    }
  }
  
  /*
   * Returns the shortest distance between two buildings sent in as parameters
   * 
   * @param String buildingOne
   * @param String buildingTwo
   * @return int shortest distance between the two parameters
   */
  public int getShortestDistance(String buildingOne, String buildingTwo) {
    if(!map.vertices.containsKey(buildingOne) || !map.vertices.containsKey(buildingOne)) {
      throw new NoSuchElementException();
    }
    return map.getPathCost(buildingOne, buildingTwo);
  }
  
  /*
   * Returns the shortest path between two buildings sent in as parameters
   * 
   * @param String buildingOne
   * @param String buildingTwo
   * @return List<String> shortest path between the two parameters
   */
  public List<String> getShortestPath(String buildingOne, String buildingTwo) {
    if(!map.vertices.containsKey(buildingOne) || !map.vertices.containsKey(buildingOne)) {
      throw new NoSuchElementException();
    }
    return map.shortestPath(buildingOne, buildingTwo);
  }
  
  /*
   * Returns the time to walk from one building to another
   * 
   * @param String buildingOne
   * @param String buildingTwo
   * @return int walk time between the two parameters
   */
  public int getWalkTime(String buildingOne, String buildingTwo) {
    return getShortestDistance(buildingOne, buildingTwo) / 2;
  }
  /*
   * Returns the time to drive from one building to another
   * 
   * @param String buildingOne
   * @param String buildingTwo
   * @return int drive time between the two parameters
   */
  public int getDriveTime(String buildingOne, String buildingTwo) {
    return getShortestDistance(buildingOne, buildingTwo) / 5;
  }

}
