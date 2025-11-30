<h1 align="center">*:・ﾟ✧ O2gether ✧ *:・ﾟ</h1>

<h3 align="center">Your interactive console tool for student management.</h3>

<p align="center">
  <strong>CS 2102</strong><br/>
  Aninon, Shanea May B.<br/>
  Banaag, Ace Angela P.<br/>
  Bituin, Jan Lawrence L.<br/>
  Cura, Dane Mercy J.
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


## ▶️ How to Run the Program
text here

## ✨ Features
1. **Register Students**. Add student information such as name, SR-Code and personality type. 
2. **View Registered Student/s**.  Display all the registered students along with their details. 
3. **Update Student Information**. Modify a student's name, SR-Code and Personality est
4. **Delete Student/s**. Removes a selected student from the system. 
5. **Form Groups**. Faily organizes students into groups. 
6. **Exit Program**. Ends the current console session.

## 🧠 Object-oriented Principles

### 🔐 Encapsulation
Encapsulation was applied through class design and private fields. For instance, in `Student`, the selected roles (science, creative, literature, programming) are private and can only be accessed or modified through methods like `setScience()` and `getSelectedScienceRoles()`.

This ensures that student data is bundled with the operations on it and protected from unauthorized or accidental modification.


### 💡 Abstraction
Abstraction was implemented through the `AbstractPersonality` class and its subclasses. Classes like `SciencePersonality` and `CreativePersonality` define how to retrieve available roles without exposing the internal storage or handling of role arrays.

This hides implementation details from classes like `GroupBuilder` and keeps the group formation logic clean and focused.


### 🧬 Inheritance
Inheritance is used where personality classes extend the abstract class `AbstractPersonality`. For example, `SciencePersonality` inherits from `AbstractPersonality` and provides a concrete implementation of `getAvailableRoles()`.

This allows new personality types to be added easily, promoting code reuse and scalability without rewriting shared logic.


### 🎭 Polymorphism
Polymorphism is demonstrated by treating all personality objects as `AbstractPersonality` instances. Methods like `getSciencePersonality()` return an `AbstractPersonality`, allowing `GroupBuilder` to work with any personality type uniformly.

Additionally, if a subclass overrides `getAvailableRoles()`, the program dynamically calls the correct version at runtime, enabling flexible behavior for different student types.


## 🖥️ Example Output


## 👥 Contributors
<table style = "width:100%">
<tr>
<tr>
    <th> &nbsp; </th>
    <th> Name </th>
</tr>
<tr>
    <td> <img src="static\Shanea.jpg" width="100" height="100"> </td>
    <td><strong>Aniñon, Shanea May B.</strong> <br/>
      <a href="https://github.com/shaneamay" target="_blank">
      <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Shanea's Github">
      </a>
    </td>
</tr>
<tr>
    <td> <img src="static\Ace.jpg" width="100" height="100"> </td>
    <td><strong>Banaag, Ace Angela P.</strong> <br/>
      <a href="https://github.com/azaeeeiiii" target="_blank">
      <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Ace's Github">
      </a>
    </td>
</tr>
<tr>
    <td> <img src="static\Jaren.jpg" width="100" height="100"> </td>
    <td><strong>Bituin, Jan Lawrence L.</strong> <br/>
    <a href="https://github.com/Jarennn15" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=pink" alt="Jaren's Github">
      </a>
    </td>
</tr>
<tr>
    <td> <img src="static\Dane.jpg" width="100" height="100"> </td>
    <td><strong>Cura, Dane Mercy J.</strong> <br/>
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

