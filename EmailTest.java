//read username before @email.com

import java.util.*;

class EmailTest {

  public static void main(String[] args) {

     Email arr = new Email();
          
     String myEmail = "jchin@pace.edu";

     String str;

     str = arr.parseEmail(myEmail);

     System.out.println("Email is: " + myEmail);
     System.out.println("Name is: " + str);

  }


}