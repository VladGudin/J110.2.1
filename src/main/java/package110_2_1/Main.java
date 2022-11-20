package package110_2_1;

public class Main {
    public static void main(String[] args) {
       Person[] pull = new Person[6];
       pull[0] = new Teacher("Ronald Turner", Gender.MALE, "Computer science", Degree.PHD, "Programming paradigms");
       pull[1] = new Teacher("Ruth Hollings", Gender.FEMALE, "Jurisprudence", Degree.MSC, "Domestic arbitration");
       pull[2] = new StudentB("Leo Wilkinson", Gender.MALE, "Computer science", 3, Stage.BACHELOR);
       pull[3] = new StudentB("Anna Cunningham", Gender.FEMALE, "World economy",1, Stage.BACHELOR);
       pull[4] = new StudentB("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", 1, Stage.MASTER);
       pull[5] = new StudentM("Ronald Correa", Gender.MALE, "Computer science", "Design of a functional programming language");
       Person.printAll(pull);





    }
}