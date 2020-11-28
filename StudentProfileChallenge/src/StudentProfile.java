public class StudentProfile {
    String FirstName;
    String LastName;
    int ExpYear;
    double GPA;
    String decMajor;

    public StudentProfile(String FirstName, String LastName, int ExpYear , double GPA , String decMajor){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ExpYear = ExpYear;
        this.GPA = GPA;
        this.decMajor = decMajor;
    }
    public int incrementYearOfGraduation(){
        return(this.ExpYear+=1);
    }
}
