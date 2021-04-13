// --== CS400 File Header Information ==--
// Name: Srikar Vootkur
// Email: svootkur@wisc.edu
// Team: BF Red
// Role: Data Wrangler
// TA: Brianna Cochran
// Lecturer: Gary Dahl
// Notes to Grader: 

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;


//This class describes map objects that store locations as vertices and routes to move between vertices as edges
//weights of edges represent the distances between each location
public class Map extends CS400Graph<String>{

    public Map(String CSVpath){

        //create graph object to store the data
        //read in input data from the provide CSV file
        //for input data: first column is source vertex, second column is target vertex, and third column is weight of edge
        try{
            BufferedReader csvReader = new BufferedReader(new FileReader(CSVpath));
            String row = csvReader.readLine();
            //skip first row with column labels
            row = csvReader.readLine();
            while ( row != null ) {
                //add source/target vertices if not already present in our map
                String[] data = row.split(",");
                if(!this.containsVertex(data[0])){
                    this.insertVertex(data[0]);
                }
                
                if(!this.containsVertex(data[1])){
                    this.insertVertex(data[1]);
                }
                //add weighted edges for vertices in both directions (to allow for movement either way)
                //only add if edge is not already present
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
        //If CSV file is not able to be read in 
        catch(IOException e){
            System.out.println("Problem Reading in the CSV File.");
        }
        //if error is not an IOExcpection, the input data must have formatting differences than what is expected
        catch(Exception e){
            System.out.println("Input Data Incorrectly Formatted.");
        }
        
    }

    public static void main(String[] args){
        //Map map = new Map("MapData.csv");
        //System.out.println(map.getVertexCount());
    }

}
