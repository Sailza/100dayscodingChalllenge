PROBLEM : By using throw keyword in Exception handling Solve the IOEXCEPTION in java 

SOLUTION 

CODE 
import java.io.*;

class Main {
  public static void findFile() throws IOException {

    File newFile = new File("test.txt");
    FileInputStream stream = new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try {
      findFile();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}

OUTPUT 

java.io.FileNotFoundException: test.txt (No such file or directory)
