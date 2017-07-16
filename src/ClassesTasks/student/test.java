package ClassesTasks.student;

public class test {

    public static void main(String[] args) {

        StudentID[] students = new StudentID[4];

        students[0] = new StudentID("Vasya", 101, 5, 4, 5, 3, 2);
        students[1] = new StudentID("Elena", 101, 5, 4, 3, 4, 4);
        students[2] = new StudentID("Ivan", 101, 4, 4, 3, 3, 3);
        students[3] = new StudentID("Victoria", 101, 5, 4, 4, 5, 3);
        String[] favoriteStudenst = new String [students.length];

        try {
            for (int i = 0; i < students.length; i++) {

                System.out.print("Студент " + students[i].getName() + " имеет средний бал ");
                System.out.println(students[i].getAvgMark());

                if (students[i].bestStudents(students[i].getAvgMark())){
                    favoriteStudenst[i] = students[i].getName();
                }
            }
        } catch (NullPointerException ex) {}

        System.out.print("\nСтуденты с баллом выше четырех: ");
        for (int i = 0; i < favoriteStudenst.length; i++) {
            System.out.print (favoriteStudenst[i] + ", ");
        }
    }
}
