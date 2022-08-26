import java.util.*;

class Student1{
    private int id;
    private String fname;
    private double cgpa;
    public Student1(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparer implements Comparator<Student1> {
    @Override
    public int compare(Student1 x, Student1 y){

        // sort by GPA
        if (x.getCgpa() > y.getCgpa()){
            return -1;
        } else if ( x.getCgpa() < y.getCgpa()) {
            return 1;
        }

        // sort by Name
        int test = x.getFname().compareToIgnoreCase(y.getFname());
        if (test < 0){
            return -1;
        } else if (test > 0){
            return 1;
        }

        // sort by ID
        if (x.getId() > y.getId()){
            return 1;
        } else if (x.getId() < y.getId()) {
            return -1;
        }

        System.out.println("We should never have this");
        return 0;
    }
}

//Complete the code

public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student1> studentList = new ArrayList<Student1>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student1 st = new Student1(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //write 1
        Checker checker = new Checker();
        Collections.sort(studentList,checker);

        for(Student1 st: studentList){
            System.out.println(st.getFname());
        }
    }
}

//write 2
class Checker implements Comparator<Student1>{
    @Override
    public int compare(Student1 a, Student1 b){
        if(a.getCgpa()==b.getCgpa() && a.getFname().compareTo(b.getFname())==0){
            return a.getId()-b.getId();
        }
        else if(a.getCgpa()==b.getCgpa() ){
            return a.getFname().compareTo(b.getFname());
        }
        else{
            return (int)(1000.0*(b.getCgpa() - a.getCgpa()));
        }
    }

}
