public class Student4 {
    
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
        
        s2 = new Student();

        int age = s1.age;
        s1.age = s2.age;
        s2.age = age;

        String temp = s1.name;
        s1.name = s2.name;
        s2.name = temp;

        s1 = new Student();
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

/* Swap hoga lekin hmne swap m aate m swap ko new kr diya so it is pointing to some another location in heap jha pr 0 and null stored h and s1 ka reference is same as main and hm values m change kr rhe hai toh 0,Null and s1 ki original values i.e. 10,A m swap hoga and then hmne s1 ko new krke usko new location ko point kr diya uska kuch bhi impact nhi hoga and swap stack pop krne pr result hoga */
/*
    A10
    B20
    Null0
    A10
 */