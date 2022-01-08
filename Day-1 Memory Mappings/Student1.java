public class Student1 {

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
        Student temp = s1;
        s1 = s2;
        s2 = temp;
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


/* In this case Swap nahi hoga bcoz swap method call krne par dono objects ke references copy ho jayenge from main method in fuction call stack for swap method.
Then Vo references swap honge and swap method stack se pop ho jayenge and main m object ke references toh same hi hai
Then vo s1 and s2 ki properties print kr dega through announceYourSelf method */

/* Output is 
    A10
    B20
    A10
    B20
*/
/* Note : Agar swapping k baad hmne s1 and s2 ko usi method m print kra dete toh swapping reflect hoti but jaise hi swap stack se pop hua main m toh s1,s2 ke original reference hi the and hmne main se print kiya toh swapping reflect nhi hui */