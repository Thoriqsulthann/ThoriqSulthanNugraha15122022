public class Student extends Person {

    private String nobp;

    public Student(){ 
        super ("Anna","Padang");
        System.out.println("Inside Student:Constructor"); 
    } 

    @Override
    public String getName(){ 
        System.out.println("get Name Student");
        return name; 
    }

    public String getNobp(){ 
        System.out.println("get Name Student");
        return nobp; 
    }

    public static void main( String[] args ){ 
        Student anna = new Student(); 
        Student anna = new Student();
//        anna.name ="Anna";
//        anna.address ="Padang";
//        anna.nobp ="1111111";
        System.out.println(anna.name);
        System.out.println(anna.address);
//        System.out.println(anna.address);
//        System.out.println(anna.nobp);
    }
     public String getName(){ 
        System.out.println("getName Student");
        return name; 
    } 
}
