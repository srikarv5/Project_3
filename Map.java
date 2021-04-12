
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;


public class Map extends CS400Graph<String>{

    public Map(String CSVpath){

        //create graph object to store the data
        //read in input data from the provide CSV file
        try{
            BufferedReader csvReader = new BufferedReader(new FileReader(CSVpath));
            String row = csvReader.readLine();
            //skip first row with column labels
            row = csvReader.readLine();
            while ( row != null ) {

                String[] data = row.split(",");
                if(!this.containsVertex(data[0])){
                    this.insertVertex(data[0]);
                }
                
                if(!this.containsVertex(data[1])){
                    this.insertVertex(data[1]);
                }
                if(!this.containsEdge(data[0], data[1])){
                    this.insertEdge(data[0], data[1], Integer.valueOf(data[2]));
                }
                if(!this.containsEdge(data[1], data[0])){
                    this.insertEdge(data[1], data[0], Integer.valueOf(data[2]));
                }
                row = csvReader.readLine();
            }

            csvReader.close();
        }
        catch(IOException e){
            System.out.println("File Not Found.");
        }
        catch(Exception e){
            System.out.println("Incorrect Input Data.");
        }
        
    }

    public static void main(String[] args){
        Map map = new Map("MapData.csv");
        System.out.println(map.getVertexCount());
    }

}