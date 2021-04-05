import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    System.out.println("This program creates 3 geometric objects and returns their areas,\n" +
                      "names, ID and position.");
    
    /* *Creating the ArrayList */
    ArrayList<GeometricObject>geometricObjects = new ArrayList<>();
    geometricObjects.add(new Circle("Circle", 10, 156, 1, 1));
    geometricObjects.add(new Square("Square", 2, 237, 1, 3));
    geometricObjects.add(new Triangle("Triangle", 4, 3, 212, 3, 3));

    /* *Try Catch to create a file, write to it, and read from it */
    try{
      /* *Printing output header */
      System.out.printf("%-10s %3s %-9s %-5s\n", "Shape", "ID", "Position", "Area");

      /* *Creating File, and writer / writer with format objects */
      File myFile = new File("objects.txt");
      myFile.createNewFile();
      FileWriter myWriter = new FileWriter("objects.txt");
      PrintWriter printWriter = new PrintWriter(myWriter); // Filewriter with format
      
      /* *Writing to the file */
      for(GeometricObject i : geometricObjects) {
      String position = "(" + i.getCoord()[0] + "," + i.getCoord()[1] + ")";
      printWriter.printf( "%-10s %-3s %-9s %6.2f\n", i.getName(), i.getIdentifier(), position,  i.getArea());
      }
      myWriter.close(); // Closing writer

      /* *Creating reader object */
      Scanner myReader = new Scanner(myFile);

      /* *Reading and printing the data from the file */
      while(myReader.hasNextLine()){
        String data = myReader.nextLine();
        System.out.println(data);
      }
      // Closing reader
      myReader.close();
    } catch (IOException e) {
      /* *Exception1: creating the file, writing to it or reading it failed */
      System.out.println("An error occurred while creating a file, wiring data to it, or reading it.");
    } 
    catch (Exception e) {
      /* *Exception2: catching an unchecked exception */
      System.out.println("An unknown error occurred while handling the file.");
    } // End Try Catch
       
    System.out.println("Goodbye.");
  }
}