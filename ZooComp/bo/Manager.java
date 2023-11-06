package ZooComp.bo;

public class Manager {
    private String Name = null;
    private int ysSeniority ;
    
    public Manager(String Name,int ysSeniority){

        this.Name=Name;
        this.ysSeniority=ysSeniority;

    }

    int GetysSeniority(){
        return this.ysSeniority;
    }

    int SetysSeniority(int ysSeniority){

        this.ysSeniority=ysSeniority;

        return ysSeniority;
    }

    public String getName() {
        return Name;
    } 

    public String toString(){
        return Name + " is the zoo Manager since " +ysSeniority+" years.";
    }
}