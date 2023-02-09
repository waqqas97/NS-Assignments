public class Student 
{
    private String firstName;
    private String secondName;
    // private int age;
    // private Static String courseName;
        

        public String getFullName()
        {
            return this.firstName +" "+ this.secondName;
        }

        public void setFirstName(String _firstName)
        {
            this.firstName= _firstName;
        }

        public void setSecondName(String _secondName)
        {
            this.secondName= _secondName;
        }
        // public String getCourseName()
        // {
        //     return courseName;
        // }
        // public void setCourseName(String _courseName)
        // {
        //     courseName = courseName;
        // }
        public static void main(String[] args)
        {
            Student s1 = new Student();
            s1.setFirstName("virat");
            s1.setSecondName("Kohli");

            System.out.println("The full name of the student :: "+s1.getFullName());
            // s1.setCourseName("Full stack develoment");
            // System.out.println("The course name is :: "+s1.getCourseName());
        }    
}
