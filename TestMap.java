
public class TestMap {

    public static void main(String[] args) {

        if(testDataEntry()){
            System.out.println("Test Data Entry: Passed")
        }
        else{
            System.out.println("Test Data Entry: Failed")
        }

        if(testCorrectMapFormation()){
            System.out.println("Test Correct Map Formation: Passed")
        }
        else{
            System.out.println("Test Correct Map Formation: Failed")
        }

        if(testVertexFormation()){
            System.out.println("Test Vertex Formation: Passed")
        }
        else{
            System.out.println("Test Vertex Formation: Failed")
        }
  
    }
    
    public static boolean testDataEntry() {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));
      Map testMap = new Map("IncorrectCSVFileName.csv");
      if(out.toString()=="Problem Reading in the CSV File."){
          return true;
      }
      return false;
    }
    
    public static boolean testCorrectMapFormation() {
      Map testMap = new Map("MapData.csv");
      int numOfVertices = (map.getVertexCount());
      int numOfEdges = map.numOfEdges;
      if(numOfVertices==8 && numOfEdges==11){
          return true;
      }
      return false;
    }
    
    public static boolean testVertexFormation() {
        Map testMap = new Map("MapData.csv");
        if(map.containsVertex("Humanities") && map.containsEdge("Humanities", "Grainger Hall")){
            return true;
        }
        return false;
    }
    
    
  
  }
  