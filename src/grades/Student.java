package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){                                    // adds the given grade to the grades property
        this.grades.add(grade);
    }
    public double getGradeAverage(){                                    // returns the average of the students grades
        double averageGrade = 0;
        for(int grade : this.grades){
            averageGrade += grade;
        }
//        for (int i = 0; i < this.grades.size(); i++) {                //alt in conventional for loop
//            averageGrade += this.grades.get(i);
//        }
        return averageGrade / grades.size();

    }
    public static void main(String[] args) {
        Student Maria = new Student("Maria");
        Maria.addGrade(90);
        Maria.addGrade(95);
        System.out.println(Maria.grades);
        System.out.println(Maria.getGradeAverage());
    }

}
