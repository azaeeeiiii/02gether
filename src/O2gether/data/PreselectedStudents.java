package O2gether.data;

import java.util.*;
import O2gether.personality.Student;

public class PreselectedStudents {

    // Returns a list of preconfigured student objects
    public static List<Student> getDefaultStudents() {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("Gian Christian V. Vitug", "24-08440");
        s1.setScience(new String[]{"Experimenter", "Data Recorder", "Analyst", "Designer"});
        s1.setCreative(new String[]{"Actor", "Video Editor", "Graphic Designer", "Director", "Videographer"});
        s1.setLiterature(new String[]{"Data Collector", "Editor"});
        s1.setProgramming(new String[]{"Documentation Writer", "Concept Developer"});
        list.add(s1);

        Student s2 = new Student("Marjol F. Alvendia", "24-08950");
        s2.setScience(new String[]{"Researcher", "Presenter"});
        s2.setCreative(new String[]{"Actor"});
        s2.setLiterature(new String[]{"Editor", "Presenter"});
        s2.setProgramming(new String[]{"Debugger", "Concept Developer", "Project Organizer"});
        list.add(s2);

        Student s3 = new Student("Adrian Laganzon G.", "24-01203");
        s3.setScience(new String[]{"Experimenter", "Data Recorder", "Analyst", "Designer"});
        s3.setCreative(new String[]{"Actor", "Videographer", "Singer", "Dancer"});
        s3.setLiterature(new String[]{"Data Collector", "Editor"});
        s3.setProgramming(new String[]{"Programmer", "Concept Developer"});
        list.add(s3);

        Student s4 = new Student("Menard Troy V. Fernandez", "24-09514");
        s4.setScience(new String[]{"Researcher", "Experimenter"});
        s4.setCreative(new String[]{"Video Editor", "Director", "Videographer", "Singer"});
        s4.setLiterature(new String[]{"Data Collector", "Research Designer", "Concept Developer"});
        s4.setProgramming(new String[]{"Programmer", "Debugger", "Documentation Writer", "Researcher", "UI Designer"});
        list.add(s4);

        Student s5 = new Student("Juliana Cecille P. Rioflorido", "24-04474");
        s5.setScience(new String[]{"Experimenter", "Designer"});
        s5.setCreative(new String[]{"Actor", "Director"});
        s5.setLiterature(new String[]{"Concept Developer"});
        s5.setProgramming(new String[]{"Programmer", "Debugger"});
        list.add(s5);

        Student s6 = new Student("Benedict P. Borillo", "24-09680");
        s6.setScience(new String[]{"Analyst"});
        s6.setCreative(new String[]{"Video Editor"});
        s6.setLiterature(new String[]{"Data Collector"});
        s6.setProgramming(new String[]{"Programmer", "Debugger", "Concept Developer"});
        list.add(s6);

        Student s7 = new Student("Shanea May B. Aninon", "24-08103");
        s7.setScience(new String[]{"Researcher", "Data Recorder", "Designer"});
        s7.setCreative(new String[]{"Graphic Designer", "Singer"});
        s7.setLiterature(new String[]{"Literature Reviewer", "Data Collector", "Academic Writer"}); 
        s7.setProgramming(new String[]{"Debugger", "Documentation Writer"});
        list.add(s7);

        Student s8 = new Student("Jyvhan Earl Ponce", "24-04669");
        s8.setScience(new String[]{"Experimenter", "Data Recorder", "Writer"});
        s8.setCreative(new String[]{"Graphic Designer"});
        s8.setLiterature(new String[]{"Concept Developer", "Academic Writer", "Editor"});
        s8.setProgramming(new String[]{"Programmer", "Debugger", "Documentation Writer", "Researcher", "UI Designer", "Concept Developer", "Project Organizer"});
        list.add(s8);

        Student s9 = new Student("Trixter Lanz C. Donatos", "24-05714");
        s9.setScience(new String[]{"Experimenter", "Presenter"});
        s9.setCreative(new String[]{"Scriptwriter", "Video Editor"});
        s9.setLiterature(new String[]{"Presenter"});
        s9.setProgramming(new String[]{"Programmer", "Project Organizer"});
        list.add(s9);

        Student s10 = new Student("Vinz Gabriel S. De Castro", "24-07009");
        s10.setScience(new String[]{"Experimenter", "Data Recorder", "Analyst", "Designer"});
        s10.setCreative(new String[]{"Scriptwriter", "Video Editor", "Graphic Designer", "Videographer"});
        s10.setLiterature(new String[]{"Literature Reviewer", "Academic Writer", "Editor"});
        s10.setProgramming(new String[]{"Programmer", "Debugger", "Documentation Writer", "Researcher", "UI Designer", "Concept Developer", "Project Organizer"});
        list.add(s10);

        Student s11 = new Student("Mark Aldrin L. Pinero", "24-08216");
        s11.setScience(new String[]{"Researcher", "Experimenter"});
        s11.setCreative(new String[]{"Actor"});
        s11.setLiterature(new String[]{"Research Designer"});
        s11.setProgramming(new String[]{"Programmer", "Concept Developer", "Project Organizer"});
        list.add(s11);

        Student s12 = new Student("Vianci Mariz G. Boo", "24-07949");
        s12.setScience(new String[]{"Writer", "Designer"});
        s12.setCreative(new String[]{"Graphic Designer"});
        s12.setLiterature(new String[]{"Concept Developer", "Editor"});
        s12.setProgramming(new String[]{"Debugger", "Concept Developer"});
        list.add(s12);

        Student s13 = new Student("Angelyn A. Cruzat", "24-09583");
        s13.setScience(new String[]{"Researcher", "Data recorder", "Analyst", "Writer", "Presenter"});
        s13.setCreative(new String[]{"Scriptwriter", "Actor", "Video Editor", "Singer", "Dancer"});
        s13.setLiterature(new String[]{"Literature Reviewer", "Concept Developer"});
        s13.setProgramming(new String[]{"Programmer", "Debugger", "Documentation Writer", "Concept Developer"});
        list.add(s13);

        Student s14= new Student("Kent Patrick M. Ilao", "24-07529");
        s14.setScience(new String[]{"Writer", "Presenter"});
        s14.setCreative(new String[]{"Video Editor", "Videographer", "Singer"});
        s14.setLiterature(new String[]{"Academic Writer", "Editor"});
        s14.setProgramming(new String[]{"Concept Developer"});
        list.add(s14);

        Student s15 = new Student("Mikyla V. Carranceja", "24-04989");
        s15.setScience(new String[]{"Data Recorder", "Designer"});
        s15.setCreative(new String[]{"Video Editor", "Graphic Designer", "Director", "Videographer"});
        s15.setLiterature(new String[]{"Editor", "Presenter"});
        s15.setProgramming(new String[]{"Documention Writer", "UI Designer", "Concept Developer"});
        list.add(s15);

        Student s16 = new Student("Xiamara T. Bernardo", "24-09252");
        s16.setScience(new String[]{"Researcher", "Data recorder", "Analyst", "Writer", "Designer"});
        s16.setCreative(new String[]{"Actor", "Videographer", "Singer", "Dancer"});
        s16.setLiterature(new String[]{"Data Collector"});
        s16.setProgramming(new String[]{"Progect Organizer"});
        list.add(s16);

        Student s17 = new Student("Aaron Daniel L. Mercado", "24-04698");
        s17.setScience(new String[]{"Data recorder", "Analyst"});
        s17.setCreative(new String[]{"Scriptwriter"});
        s17.setLiterature(new String[]{"Concept Developer"});
        s17.setProgramming(new String[]{"Programmer", "Debugger"});
        list.add(s17);

        Student s18 = new Student("Franz Daniel H. Villanueva", "24-01122");
        s18.setScience(new String[]{"Experimenter", "Data Recorder"});
        s18.setCreative(new String[]{"Actor", "Singer"});
        s18.setLiterature(new String[]{"Presenter"});
        s18.setProgramming(new String[]{"Debugger", "Concept Developer"});
        list.add(s18);

        Student s19 = new Student("Shanlee Yvonne T. Gupilan", "24-08498");
        s19.setScience(new String[]{"Designer"});
        s19.setCreative(new String[]{"Videographer"});
        s19.setLiterature(new String[]{"Research Designer"});
        s19.setProgramming(new String[]{"Debugger"});
        list.add(s19);

        Student s20 = new Student("Jan Lawrence L. Bituin", "24-05233");
        s20.setScience(new String[]{"Researcher", "Experimenter", "Writer", "Presenter"});
        s20.setCreative(new String[]{"Director", "Scriptwriter", "Videographer", "Graphic Designer", "Video Editor"});
        s20.setLiterature(new String[]{"Academic writer", "Editor", "Presenter"});
        s20.setProgramming(new String[]{"Programmer", "UI Designer", "Debugger"});
        list.add(s20);

        Student s21 = new Student("Ace Angela P. Banaag", "24-08288");
        s21.setScience(new String[]{"Researcher", "Experimenter", "Writer"});
        s21.setCreative(new String[]{"Scriptwriter", "Videographer", "Singer"});
        s21.setLiterature(new String[]{"Literature Reviewer", "Data Collector", "Editor"});
        s21.setProgramming(new String[]{"Programmer", "Debugger", "Concept Developer"});
        list.add(s21);




        return list;
    }
}
