//here's the answer to #1, regarding rule handling of method overrinding.
//
//If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
//
//If the superclass method declares an exception, subclass overridden method can declare the same subclass exception or no exception but cannot declare parent exception.
//
//and then here is immutable class that follows the 6 rules:

final class immute {
    private final int id;
    private final String name;

    public immute(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
//to check if it works
class Main {
    public static void main(String[] args){
        immute a = new immute(1,"kid");
        System.out.println(a.getname());
        System.out.println(a.getid());
    }  
}