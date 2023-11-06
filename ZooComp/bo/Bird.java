package ZooComp.bo;

public class Bird extends Animal{

private String color=null;


public Bird(String name, int age, String color){
    super(name, age, 6, "cuicui");
    this.color=color;
}


public String getColor(){
    return color;
}

public String toString(){
    return getName()+" is a Bird, it is "+getAge()+" years old and it's "+color;
}

}