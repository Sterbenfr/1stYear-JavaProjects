package ZooComp.bo;

public class CatLike extends Animal{

    private String race=null;
    
    public CatLike(String name, int age, String race){
        super(name, age,10,"Miaou");
        this.race=race;
    }
    
    public String getRace(){
        return race;
    }

    
    public String toString(){
        return getName()+" is a Cat-Like, it is "+getAge()+" years old and it is a "+race;
    }
    
    }