<h1 align="center">✨ O2gether — Teamwork, Tailored by Personality ✨</h1>

<p align="center">
  <em>Turn a list of students into balanced, personality-aware teams — fast, fair, and enjoyable.</em><br/>
  <strong>OOP Final Project - OOPALICIOUS</strong><br/>
</p>


## 📌 Overview
02gether is a console-based Java application designed to help users/students from CS-2102 to register, manage, and group students using an interactive personality-based system. 

## Users can:
🖋️ Register students  
📔 View registered students  
❌ Delete registered students  
✏️ Update student information  
👥 Form groups based on personalities 

## 🗂️ Project Structure

```
📂 src/
└── 📂 O2gether/
├── 📂 data/
│ ├── 🛠️GroupBuilder.java
│ ├── 👥PreselectedStudent.java
│ ├── 🎒StudentInputHandler.java
│ ├── 🗂️StudentManager.java
│ └── 📝StudentRegistry.java  
├── 📂 personality/
│ ├── 🧠AbstractPersonality.java
│ ├── 🎨CreativeaPersonality.java
│ ├── 📚LiteraturePersonality.java
│ ├── 💻ProgrammingPersonality.java
│ ├── 🧪SciencePersonality.java
│ └── 🎓Student.java
└── ☕ Main.java
```

## ▶️ How to Run the Program
Open your terminal in the `src/` folder and run:
```
javac O2gether/*.java O2gether/data/*.java O2gether/personality/*.java
```

Run the program:
```
java O2gether.Main
```


## ✨ Features
1. **Register Students**. Add student information such as name, SR-Code and personality type. 
2. **View Registered Student/s**.  Display all the registered students along with their details. 
3. **Update Student Information**. Modify a student's name, SR-Code and Personality Test.
4. **Delete Student/s**. Removes a selected student from the system. 
5. **Form Groups**. Fairly organizes students into groups. 
6. **Exit Program**. Ends the current console session.

## 🧠 Object-oriented Principles

### 🔐 Encapsulation
In our system, the Student class keeps the personality data (science, creative, literature, programming) private. These can only be accessed through getters and setters like setScience() or getCreativePersonality(). This protects the student’s data so nothing outside the class can accidentally change it.


### 💡 Abstraction
AbstractPersonality defines getAvailableRoles() without revealing how each personality type stores roles. GroupBuilder and other classes just call this method to get a student’s roles. This way, the program doesn’t need to know the internal workings of SciencePersonality, CreativePersonality, etc. — it just cares about what roles are available.


### 🧬 Inheritance
All personality types (SciencePersonality, CreativePersonality, LiteraturePersonality, ProgrammingPersonality) inherit from AbstractPersonality. They follow the same blueprint but define their own sets of roles. This allows us to add new personality types easily without rewriting existing code.


### 🎭 Polymorphism
Polymorphism happens when we call getAvailableRoles() on any personality object. Even though it’s the same method name, the actual behavior depends on whether the object is SciencePersonality, CreativePersonality, etc. The program automatically uses the correct version at runtime.

## 🖥️ Example Output

### Main Menu and Registration
```
Welcome to 02gether!  
Your student grouping assistant! 

-------------------------------
           Main Menu
-------------------------------
1. Register Students
2. View Students
3. Update Information
4. Form Groups
5. Delete Student
6. Exit
-------------------------------
Choose option: 1

[Press 'C' to cancel anywhere]
Please enter the number of students you want to register: 1

Register Student 1:
Enter the student's full name (FN-MI-LN): Dane Mercy J. Cura
Enter the student's SR-Code (format: 00-00000): 24-04398
```

### Personality Test
```
=== Personality Test ===
[Press 'C' to cancel and skip this student]

In a Science Project, which roles do you identify with? (Select comma-separated numbers ? cannot skip)
1. Researcher
2. Experimenter
3. Data Recorder
4. Analyst
5. Writer
6. Presenter
7. Designer
Your choices: 1, 2, 5

In a Creative Project, which roles do you identify with? (Select comma-separated numbers ? cannot skip)
1. Scriptwriter
2. Actor
3. Video Editor
4. Graphic Designer
5. Director
6. Cinematographer
7. Singer
8. Dancer
Your choices: 1, 6, 2,

In a Literature Project, which roles do you identify with? (Select comma-separated numbers ? cannot skip)
1. Literature Reviewer
2. Research Designer
3. Concept Developer
4. Academic Writer
5. Editor
6. Presenter
Your choices: 5, 6

In a Programming Project, which roles do you identify with? (Select comma-separated numbers ? cannot skip)
1. Programmer
2. Debugger
3. Documentation Writer
4. Researcher
5. UI Designer
6. Concept Developer
7. Project Organizer
Your choices: 2, 6, 5
Student registered successfully!
```
### View Students
```
Choose option: 2

  ---------------------- Registered Students ------------------------

24-08440 - Gian Christian V. Vitug
  Science Roles:     [Experimenter, Data Recorder, Analyst, Designer]
  Creative Roles:    [Actor, Video Editor, Graphic Designer, Director, Videographer]
  Literature Roles:  [Data Collector, Editor]
  Programming Roles: [Documentation Writer, Concept Developer]

24-08950 - Marjol F. Alvendia
  Science Roles:     [Researcher, Presenter]
  Creative Roles:    [Actor]
  Literature Roles:  [Editor, Presenter]
  Programming Roles: [Debugger, Concept Developer, Project Organizer]

24-01203 - Adrian Laganzon G.
  Science Roles:     [Experimenter, Data Recorder, Analyst, Designer]
  Creative Roles:    [Actor, Videographer, Singer, Dancer]
  Literature Roles:  [Data Collector, Editor]
  Programming Roles: [Programmer, Concept Developer]
  ...
```
### Update
```
Choose option: 3

[Press 'C' to cancel anywhere]
Please enter the SR-Code: 24-05233
Enter the new full name or press 'Enter' to keep current (FN-MI-LN): 
Enter new SR-Code or press 'Enter' to keep current (format: 00-00000): 24-05222
Do you want to retake the personality test? (Y/N): n

Student updated successfully!
```
### Form Groups
```
Choose option: 4

[Press 'C' to cancel anywhere]
Select Project Type:
1. Programming
2. Research
3. Video Presentation
4. Performing Arts
5. Visual Arts
Your choice: 1
Enter the desired number of groups: 6

--- Group 1 ---
Menard Troy V. Fernandez (24-09514) - Programmer
Mikyla V. Carranceja (24-04989) - Documention Writer
Mark Aldrin L. Pinero (24-08216) - Concept Developer
Vianci Mariz G. Boo (24-07949) - Debugger

--- Group 2 ---
Trixter Lanz C. Donatos (24-05714) - Programmer
Kent Patrick M. Ilao (24-07529) - Concept Developer
Vinz Gabriel S. De Castro (24-07009) - Debugger
Juliana Cecille P. Rioflorido (24-04474) - Programmer
...
```
### Delete
```
Choose option: 5

[Press 'C' to cancel anywhere]
Enter SR-Code to delete: 24-05222
Student deleted successfully.
```
### Exit
```
Choose option: 6

Thank you for using O2gether!
  Collaboration starts here.
         Goodbye!
```
## 👥 Contributors
<table style="width:100%">
<tr>
    <th> &nbsp; </th>
    <th> Name </th>
</tr>
<tr>
    <td> <img src="static\Shanea.jpg" width="100" height="100"> </td>
    <td>
        <strong>Aniñon, Shanea May B.</strong> <br/>
        <a href="https://github.com/shaneamay" target="_blank">
            <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Shanea's Github">
        </a>
    </td>
</tr>
<tr>
    <td> <img src="static\Ace.jpg" width="100" height="100"> </td>
    <td>
        <strong>Banaag, Ace Angela P.</strong> <br/>
        <a href="https://github.com/azaeeeiiii" target="_blank">
            <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Ace's Github">
        </a>
    </td>
</tr>
<tr>
    <td> <img src="static\Jaren.jpg" width="100" height="100"> </td>
    <td>
        <strong>Bituin, Jan Lawrence L.</strong> <br/>
        <a href="https://github.com/Jarennn15" target="_blank">
            <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Jaren's Github">
        </a>
    </td>
</tr>
<tr>
    <td> <img src="static\Dane.jpg" width="100" height="100"> </td>
    <td>
        <strong>Cura, Dane Mercy J.</strong> <br/>
        <a href="https://github.com/deynblip" target="_blank">
            <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Dane's Github">
        </a>
    </td>
</tr>
</table>

## 💡 Acknowledgement
We sincerely express our gratitude to our instructor, Ms. Fatima Marie P. Agdon, MSCS, for her guidance and support throughout the completion of this project. We also extend our appreciation to our classmates and peers in CS-2102 for their cooperation and encouragement during the development process.

## ❕DISCLAIMER
This project and its code were developed by OOPalicious of CS - 2102 for educational purposes. It demonstrates the implementation of object-oriented programming concepts and is intended exclusively for use by students of the course.


