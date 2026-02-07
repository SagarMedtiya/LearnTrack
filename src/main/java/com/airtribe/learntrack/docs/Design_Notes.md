1) Why you used ArrayList instead of array?  
   \-- I used ArrayList instead of arrays because the number of students/courses is dynamic. ArrayList provides resizing, built-in methods,  
   and easier management compared to fixed-size arrays.  
   eg. private List<Student> students = new ArrayList<>();  
   \-- Students keep increasing  
   \-- No fixed limit  
   \-- Need search/filter operations

2) Where you used static members and why?  
   I used static members for ID generation and utility methods because they are shared across all objects and don't require   
   object creation.  
   eg. IdGeneration.nextStudentId()  
   Because,  
   \-- ID must be global  
   \-- Same counter shared  
   \-- No need to create IdGenerator object  
   \-- Memory efficient  
   \-- One copy only  
   we can use it in,  
   \-- Utility classes  
   \-- Constants  
   \-- ID generators  
   \-- Factory Methods

3) Where you used inheritance and what you gained from it?  
   I used inheritance to avoid code duplication and to share common properties like id , firstname, lastname and email. In this project  
   I created a base class Person and extended it with Student.   
   This means:  
   \-- Student is-a Person  
   \-- Student inherits common fields and methods  
   This gives,  
   \-- Code reuse  
   \-- Maintainability  
   \-- Clean structure  
   \-- Easy future expansion  
   Why not composition instead of inheritance?  
   \-> Because Student is a type of Person, so IS-A relationship fits inheritance.
























