package package110_2_1;

public class Teacher extends Person{
    private Degree degree;
    private String speciality;

    public Teacher(String name, Gender gender, String department, Degree degree, String speciality) {
        super(name, gender, department, "teaches");
        setDegree(degree);
        setSpeciality(speciality);
    }
    public void print (){
        super.print();
        System.out.println(getGender().getPronounHeShe()+ " has "+degree+" degree in "+speciality );
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        if (degree == null) throw new NullPointerException("Значение degree не может быть пустым");
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        if (speciality== null) throw new NullPointerException("Значение speciality не может быть пустым");
        this.speciality = speciality;
    }
}
