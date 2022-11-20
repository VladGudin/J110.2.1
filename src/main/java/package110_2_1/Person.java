package package110_2_1;

public class Person {
    private String name;// Имя и фамилия
    private Gender gender;// Пол enum
    private String department; // Факультет
    private final String verb; // Глагол

    // Конструктор
    public Person ( String name, Gender gender, String department, String verb){
        setName(name);
        setGender(gender);
        setDepartment(department);
        if (verb == null) throw new NullPointerException("Значение verb не может быть пустым");
        this.verb = verb;
    }
    // Метод принт
    public void print(){
        System.out.println("This is "+name+" ");
        System.out.println( gender.getPronounHeShe()+" "+verb+ " at "+ department);
    }
    public static void printAll(Person[] persons){
        for (Person t : persons){
            t.print();
            System.out.println();
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new NullPointerException("Значение name не может быть пустым");
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender == null) throw new NullPointerException("Значение gender не может быть пустым");
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department== null) throw new NullPointerException("Значение department не может быть пустым");
        this.department = department;
    }
}
