import java.io.IOException;

public class POSTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProgramOfStudy pos = new ProgramOfStudy();
        pos.addCourse(new Course("CPSC", 121, "Computer Science I"));
        pos.addCourse(new Course("CPSC", 221, "Computer Science II"));
        pos.addCourse(new Course("CPSC", 208, "Intro to Full Stack Development"));
        pos.addCourse(new Course("CPSC", 155, "Intro to Version Control"));
        pos.addCourse(new Course("CPSC", 153, "Navigating Computer Systems"));
        pos.addCourse(new Course("PHYS", 211, "Physics for Scientists and Engineers I"));
        pos.addCourse(new Course("MATH", 175, "Calculus II"));
        pos.addCourse(new Course("MATH", 170, "Calculus I"));

        System.out.println(pos);

        pos.replace(new Course("MATH", 175, "Calculus II"), new Course("MATH", 176, "Discrete Mathematics"));
        System.out.println();

        // String fileName = "session.tmp";
        // pos.save(fileName);
        // ProgramOfStudy pos = ProgramOfStudy.load(fileName);
        
        System.out.println(pos);
    }
}
