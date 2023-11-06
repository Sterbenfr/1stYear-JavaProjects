package ZooComp.bo;

public class Monkey extends Animal{


    public Monkey(String name, int age){
        super(name, age,25,"hoouba houba");
    }
    
    public String toString(){
        return getName()+" is a Monkey and is "+getAge()+" years old";
    }

    
    }