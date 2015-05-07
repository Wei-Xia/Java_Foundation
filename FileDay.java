//read the file
//split the sentence into every vocabulary
//match vocabulary and count how many there are in the file

import java.io.*;
public class FileDay {

  public static void main(String [] args) throws IOException {

    BufferedReader input = new BufferedReader(
          new FileReader("OutDay.txt"));

    String str;
    String[] parse;
    int day = 0;

    while ((str = input.readLine()) !=null) {
      System.out.println (str);   //print out every sentence in the file
      System.out.println ("-------------");

      parse = str.split(" ");  //split every sentence by space

      for (int i=0; i<parse.length; i++){
      System.out.println ("i= "+ i + " parse str " + parse[i]);
      if (parse[i].contains("day"))   // match spliting words with "day"
      day = day +1;
      }
      System.out.println ("-------------");
      System.out.println ("number of day is "+day);
      System.out.println ("-------------");
    }



  }
}
