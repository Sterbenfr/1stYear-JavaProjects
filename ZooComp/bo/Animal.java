package ZooComp.bo;

public class Animal{

private String name = null;
private int age;
private int ageMax;
private String shout;

public Animal(String name,int age, int ageMax,String shout){
    this.name=name;
    this.age=age;
    this.ageMax=ageMax;
    this.shout=shout;
}



public int getAge(){
    return age;
}

public String getName(){
    return name;
}

public int getAgeMax(){
    return ageMax;
}

public String shout(){
    return shout;
}

public String eat(){
/*     if (Animal Animal==Bird Bird){
        return name+"à bien manger et dit cui cui";
    }
    else if (Animal Animal == Catlike Catlike){
        return "miaou";
    }
    else if (Animal Animal == Monkey Monkey){
        return "harambe";
    }*/
    return name+" à bien manger et dit " + shout;
}

public boolean getOlder(){
    boolean older =true;
    age = age+1;
    if (age>=ageMax) {
        System.out.println(name+" est mort de veillesse.");
        older=false;
        return older;
    }
    return older ;
}

public String toString(){
    return "test";
}

}