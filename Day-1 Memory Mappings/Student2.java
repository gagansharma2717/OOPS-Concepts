public class Student2 {

    public static class Student {
        int age;
        String name;

        public void announceYourSelf()
        {
            System.out.println(this.name+"["+ this.age +"]");
        }
    }
    
    public static void swap(Student s1, Student s2)
    {
        int age = s1.age;
        s1.age = s2.age;
        s2.age = age;

        String temp = s1.name;
        s1.name = s2.name;
        s2.name = temp; 

    }

    public static void main(String[] args)
    {
        Student s1;

        s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        
        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";

        s1.announceYourSelf();
        s2.announceYourSelf();
        swap(s1, s2);
        s1.announceYourSelf();
        s2.announceYourSelf();
        
    }
    
}

/* In this case swap hoga bcoz abhi vo swap method m object ki properties ko swap kar rha h jo heap m stored hoga so when swap method 
stack se pop hoga toh heap m changes hua hai toh use jab hm main se access krenge toh vo changes reflect honge
 */

/* Output is 
A10
B20
B20
A10
 */

    