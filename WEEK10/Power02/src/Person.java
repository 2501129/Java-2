public class Person {
    private String name;

    public Person(){
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return String.format("%3s",name);
    }
}
