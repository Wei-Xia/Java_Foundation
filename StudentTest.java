class StudentTest {

  public static void main(String[] args) {

    Student bob = new Student();
    double avg;
    char grade;

    bob.setMidterm(100);
    bob.setFinal(90);

    avg = bob.calcAvg();
    grade = bob.getGrade();
    System.out.println("Bob avg= " + avg);
    System.out.println("Bob grade= " + grade);

    Student jill = new Student();
    jill.setMidterm(50);
    jill.setFinal(50);

    avg = jill.calcAvg();
    grade = jill.getGrade();
    System.out.println("Jill avg= " + avg);
    System.out.println("Jill grade= " + grade);

    jill=bob;
    avg = jill.calcAvg();
    grade = jill.getGrade();
    System.out.println("Jill = Bob avg= " + avg);
    System.out.println("Jill = Bob grade= " + grade);


  }

}