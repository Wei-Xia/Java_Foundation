//read username before @email.com

class Email {

	 String parseEmail (String email) {

     int x = email.indexOf('@');
     String retStr;

     retStr = email.substring(0,x);

     return retStr;

  }
}