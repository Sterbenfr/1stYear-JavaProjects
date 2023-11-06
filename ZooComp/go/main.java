package ZooComp.go;
import ZooComp.bo.*;
public class main{


public static void main(String[] args){
    
    Manager monManager = new Manager("Manu",65);
    Zoo monZoo = new Zoo(monManager, 10);
    Animal a = new Monkey("Harambe",16);
    Animal jeanclaudeAnimal= new Bird("jeanclaude",5,"Blue");
    Animal kamikaze=new CatLike("kitty",5,"de la rue");
    monZoo.add(jeanclaudeAnimal);
    monZoo.add(a);
    monZoo.add(kamikaze);
    monZoo.listZoo();
    monZoo.remove();
    monZoo.listZoo();
    monZoo.feedAnimal();
    monZoo.birthZoo();
    monZoo.listZoo();
}


}
