class Student {

  private int id;
  private int midtermExam;
  private int finalExam;

  private double avgVal;

  public void setMidterm(int midtermVal) {
    midtermExam = midtermVal;
  }

  public void setFinal(int finalVal) {
    finalExam = finalVal;
  }

  public double calcAvg() {
    double avg;
    avg = (midtermExam + finalExam) / 2;
    
    avgVal = avg;
    
    return avg;
  }

  public char getGrade() {

    double avg = calcAvg();

    char grade;

    if (avg >= 90)
      grade='A';
    else
    if (avg >= 80)
      grade='B';
    else
    if (avg >= 70)
      grade='C';
    else
      grade='F';

    return grade;  

  }


}