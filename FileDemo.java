//read a file
//match how many specific words are in the file

import java.io.*;
public class FileDemo {

  public static void main(String [] args) throws IOException {

    BufferedReader input = new BufferedReader(new FileReader("Out.txt"));

    String str;

    int num;
    int sum10 = 0;

    while ((str = input.readLine()) !=null) {

      System.out.println (str);

      //num = Integer.parseInt (str);

      //if (num == 10)   //way 1
      //sum10 = sum10 +1;

      if (str.equals("10"))    //way 2
          sum10 = sum10 +1;

    }

    System.out.println ("number of 10 is "+sum10);

  }
}
