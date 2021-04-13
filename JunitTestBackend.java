// --== CS400 File Header Information ==--
// Name: Carter Lindstrom
// Email: cjlindstrom@wisc.edu
// Team: BF
// TA: Brianna Cochran
// Lecturer: Gary Dahl
// Notes to Grader: N/A

import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class JunitTestBackend {

  /**
   * Test method for the getBuildings() backend method.
   * 
   * This test method compares the expected list of buildings 
   * to the String that is returned by getBuildings()
   */
  @Test
  void testGetBuildings() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    String actual = "Vilas Hall, University Book Store, "
        + "Memorial Library, Memorial Union, College Library, "
        + "Humanities, Bascom Hall, Grainger Hall";
    Assert.assertEquals(actual, testBE.getBuildings());
  }
  
  /**
   * Test method for the getShortestDistance() backend method.
   * 
   * This test method compares the expected shortest distances 
   * between 3 different pairs of buildings to the return value
   * of a getShortestDistance call on those same 2 buildings.
   */
  @Test
  void testShortestDistance() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    int actual = 30;
    Assert.assertEquals(actual, testBE.getShortestDistance("Grainger Hall", "Bascom Hall"));
    actual = 27;
    Assert.assertEquals(actual, testBE.getShortestDistance("College Library", "Vilas Hall"));
    actual = 10;
    Assert.assertEquals(actual, testBE.getShortestDistance("Humanities", "University Book Store"));
  }
  
  /**
   * Test method for the getWalkTime() backend method.
   * 
   * This test method compares the expected walk times 
   * between 3 different pairs of buildings to the return value
   * of a getWalkTime call on those same 2 buildings.
   */
  @Test
  void testGetWalkTime() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    int actual = 15;
    Assert.assertEquals(actual, testBE.getWalkTime("Grainger Hall", "Bascom Hall"));
    actual = 13;
    Assert.assertEquals(actual, testBE.getWalkTime("College Library", "Vilas Hall"));
    actual = 5;
    Assert.assertEquals(actual, testBE.getWalkTime("Humanities", "University Book Store"));
    
  }
  
  /**
   * Test method for the getDriveTime() backend method.
   * 
   * This test method compares the expected drive times 
   * between 3 different pairs of buildings to the return value
   * of a getDriveTime call on those same 2 buildings.
   */
  @Test
  void testGetDriveTime() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    int actual = 6;
    Assert.assertEquals(actual, testBE.getDriveTime("Grainger Hall", "Bascom Hall"));
    actual = 5;
    Assert.assertEquals(actual, testBE.getDriveTime("College Library", "Vilas Hall"));
    actual = 2;
    Assert.assertEquals(actual, testBE.getDriveTime("Humanities", "University Book Store"));
    
  }
  
  /**
   * Test method for the getShortestPath() backend method.
   * 
   * This test method compares the expected shortest path 
   * between 3 different pairs of buildings to the return value
   * of a getShortestPath call on those same 2 buildings.
   */
  @Test
  void testShortestPath() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    List<String> actual = new LinkedList<>();
    actual.add("Grainger Hall");
    actual.add("Humanities");
    actual.add("Bascom Hall");
    Assert.assertEquals(actual, testBE.getShortestPath("Grainger Hall", "Bascom Hall"));
    
    actual = new LinkedList<>();
    actual.add("College Library");
    actual.add("Memorial Union");
    actual.add("Humanities");
    actual.add("Vilas Hall");
    Assert.assertEquals(actual, testBE.getShortestPath("College Library", "Vilas Hall"));
    
    actual = new LinkedList<>();
    actual.add("Humanities");
    actual.add("University Book Store");
    Assert.assertEquals(actual, testBE.getShortestPath("Humanities", "University Book Store"));
  }

}
