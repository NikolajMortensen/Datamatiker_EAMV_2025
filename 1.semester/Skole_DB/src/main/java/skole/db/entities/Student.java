package skole.db.entities;

// Student er en DBO (DataBærende Objekt)

public class Student {
  private int id;
  private String lastName, firstName;
  private int semesterNo;

  public Student(String lastName, String firstName, int semesterNo) {
    this(0, lastName, firstName, semesterNo);
  }

  public Student(int id, String lastName, String firstName, int semesterNo) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.semesterNo = semesterNo;
  }

  public int getId() {
    return id;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getSemesterNo() {
    return semesterNo;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setSemesterNo(int semesterNo) {
    this.semesterNo = semesterNo;
  }

  @Override
  public String toString() {
    return "[Student: id=" + id +
        ", lastName=" + lastName +
        ", firstName=" + firstName +
        ", semesterNo=" + semesterNo + "]";
  }
}
