package ua.kiev.prog.HomeWork.Lesson3;

import java.lang.String;

public class Group {
    private String groupname;
    private Student[] array = new Student[10];

    public Group(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public void addStudent(Student a) throws GroupException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = a;
                return;
            }
        }
        throw new GroupException();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.groupname.toUpperCase()).append("\n");
        for (int i = 0; i < array.length; i++) {
            String a = (array[i] != null) ? array[i].toString(): "";
            sb.append(i + 1).append(". ").append(a).append("\n");
        }
        return sb.toString();
    }
}
