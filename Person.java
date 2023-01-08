public class Person {
    protected String name; 
    protected String address; 

    public Person(){ 
        System.out.println("Inside Person:Constructor"); 
        name = ""; 
        address = ""; 
        name = "Anna"; 
        address = "Padang"; 
    } 
    public Person( String name, String address ){ 
        this.name = name; 
@@ -25,14 +25,17 @@ public Person( String name, String address ){
    public String getName(){ 
        System.out.println("getName Person");
        return name; 
    } 
    public String getAddress(){ 
        return address; 
    } 
    }  
    public void setName( String name ){ 
        this.name = name; 
    } 
     public String getAddress(){ 
        return address; 
    } 
    public void setAddress( String add ){ 
        this.address = add; 
    } 
    public static void main (String[] args){
        Person p = new Person();
    }
}
