public class Student3 {
    
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
        s1 = new Student();
        s2 = new Student();

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

/* Swap Nahi hoga bcoz swap method m aate hi hmne object ka references ko new kr diya so vo abhi kisi aur location ko point kar rhe h 
Heap m jha par by default 0 for age and null for name hoga for both objects and unka swapping hone se kuch nhi hoga and then jab swap
method stack se pop hoga toh hm main se original s1 and s2 print kar denge */

/* Output is 
A10
B20
A10
B20
 */