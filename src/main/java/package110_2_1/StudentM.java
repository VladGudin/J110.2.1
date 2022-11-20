package package110_2_1;

public class StudentM extends AbstractStudent{
    private String thesis_Title;

    public StudentM(String name, Gender gender, String department, String thesis_Title) {
        super(name, gender, department);
        setThesis_Title(thesis_Title);

    }

    public String getThesis_Title() {
        return thesis_Title;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getGender().getPronounHisHer()+ " thesis title is"+thesis_Title);
    }

    public void setThesis_Title(String thesis_Title) {
        if (thesis_Title == null) throw new NullPointerException("Значение thesis_Title не может быть пустым");
        this.thesis_Title = thesis_Title;
    }
}
