# StudentDashboard

SETTING UP THE UI

Clone the following repo: https://github.com/Nadia-Gizdova/StudentDashboard.git in Android Studio using Git.

The application can run both in the emulator or on a physical device with Android version 8.0 and above, API version 29

The general idea of the application is that a student or a teacher may look up a student or their associated curriculum data 
for the purposes of how many students are in a particular class, for example. A student may use the application to find who's 
in their class at a particular time slot in order to identify a "study buddy".

In the current state, the log in screen checks for properly formated email address and a password (any password) with a length
of 8 or more characters. Currently, it does not validate against a backend service. 

The rest of the screens for the courses and students' information also do not have backend connection but the idea is that 
an HTTP RESTful client will be included in order to retrieve the necessary information. 

A student's information includes:
•	Name
•	Year
•	Major
•	List of classes currently being taken 

The courses information includes:
•	Course ID 
•	Corresponding name and #
•	Course Description
•	A list of classes along with their time slots

The individual classes will be defined by which days of the week they are on and the specific time for that class, for each day.
This way the courses and classes form 1-to-many relationship and so do the student and classes he/she is taking. 

Upon listing the classes for a specific course, the user will be able to select a specific class alongside with its time slot 
and show which students are associated with it.
Similarly for students, you should be able to look up a student by their student ID and show all the classes that they are
taking with the specific time slots.

Looking up the student, also displays the rest of the contact information for that person.
