package package110_2_1;

public class StudentB extends AbstractStudent{
    private int course;
    private Stage stage;


    public StudentB(String name, Gender gender, String department,  int course, Stage stage) {
        super(name, gender, department);
        setCourse(course);
        setStage(stage);
    }

    @Override
    public void print() {
        super.print();
        System.out.println( getGender().getPronounHeShe()+" is "+course+ "'th year "+stage+"student");
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if ( course<1 || course>5 ) throw new IllegalArgumentException("Значение course  должно быть от 1 до 5");
        this.course = course;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        if (stage == null) throw new NullPointerException("Значение stage не может быть пустым");
        this.stage = stage;
    }
}
