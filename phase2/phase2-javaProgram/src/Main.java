import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import parser.YYParser;



public class Main {
  
  public Main() {
    try {
      FileReader f = new FileReader(new File("input.txt"));
      YYParser p = new YYParser(new Yylex(f));
      p.parse();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    new Main();
  }
}