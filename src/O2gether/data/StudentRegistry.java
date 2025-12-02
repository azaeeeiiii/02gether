package O2gether.data;

import O2gether.personality.Student;
import java.util.*;

public class StudentRegistry {
    private final Student[] students;
    private int count;
    private final int capacity = 300;

    public StudentRegistry(){
        students = new Student[capacity];
        count = 0;
    }

    public boolean isFull(){ 
        return count >= capacity;
    }

    public int getCount(){
        return count;
    }

    // Returns a List view of current students
   public List<Student> getStudentsList() {
        List<Student> list = new ArrayList<>();
    
        for (int i = 0; i < count; i++) {
        list.add(students[i]);
        }
    
        return list; // return a list of all currently added students
    }


    public Student[] getStudentsArray() {
        return Arrays.copyOf(students, count);
    }

    public boolean addStudent(Student s){
        if (isFull()) {
        return false;
        }
        students[count] = s;
        count++; 
        return true; 
    }


    public void loadPreselectedStudents() {
        List<Student> preselected = PreselectedStudents.getDefaultStudents();
        for (Student s : preselected) {
            if (isFull()) {
                System.out.println("Capacity reached, cannot load more preselected students.");
                break;
            }
            addStudent(s);
    }
}

    public Student findByCode(String code) {
        for (int i = 0; i < count; i++) {
            if (students[i].getSrCode().equals(code)){
                return students[i];
            }
        }
        return null;
    }

    public int findIndexByCode(String code) {
        for (int i = 0; i < count; i++) {
            if (students[i].getSrCode().equals(code)){
            return i;
        }
    }
    return -1; 
}

   public boolean removeStudentByCode(String code) {
    int idx = findIndexByCode(code);
    
    if (idx == -1) {
        return false; 
    }
    for (int j = idx; j < count - 1; j++) {
        students[j] = students[j + 1];
    }
    students[count - 1] = null;
    count--;
    
    return true; 
}


    public void viewStudents() {
        System.out.println("\n  ---------------------- Registered Students ------------------------\n");
        if (count == 0) {
            System.out.println("No students registered.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i] + "\n");
        }
    }
}

