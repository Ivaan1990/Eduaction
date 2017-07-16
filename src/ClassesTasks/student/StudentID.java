package ClassesTasks.student;

public class StudentID {

    String name;
    int group;
    int[] performance;

    StudentID () {
    }

    StudentID (String name, int group, int...marks) {

        this.name = name;
        this.group = group;
        this.performance = new int[5];
        for (int i = 0; i < marks.length && i < this.performance.length; i++) {
            this.performance[i] = marks[i];
        }


    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    boolean bestStudents (double salary) {
        if (salary >= 4) return true;
        return false;
    }

    double getAvgMark () {

        double ret = 0.0;
        for (int i : this.performance) {
            ret += i;
        }
        ret /= this.performance.length;

        return ret;

    }

}
