public class Student5 {
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

        s1 = new Student();
        
        String temp = s1.name;
        s1.name = s2.name;
        s2.name = temp;

        s2 = new Student();
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

/* Iss Case m bhi swap hoga lekin result is bit different bcoz values swap krne par usme original reference tha and then string se phle s1 new location ko poingt krne lga and fir hmne string swap kiya last m s2 kisi or location ko poingt kr rha h jiska koi bhi impact nhi hua */

/* Output is
A[10]
B[20]
A[20]
null[10]
 */