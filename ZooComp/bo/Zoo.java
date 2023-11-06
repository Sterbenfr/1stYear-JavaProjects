package ZooComp.bo;

public class Zoo{

    private Manager dir =null;
    private int nbMax=getNbMax();
    private int compteur = 0;
    Animal[] tabAnim;


    public Zoo(Manager dir, int nbMax){
    this.dir=dir;
    this.nbMax=nbMax;
    tabAnim=new Animal[getNbMax()];
    }

    public int getNbMax(){
        return this.nbMax;
    }




    public boolean add(Animal an) {
         Animal temp = null;
        if (compteur<nbMax && an.getAge()<=an.getAgeMax()){
            tabAnim[compteur] = an;
            temp=tabAnim[compteur];
            System.out.println(temp.getName()+" à été ajouter dans l'enclo numéro "+compteur);
            compteur++;
        }else if (an.getAge()<=an.getAgeMax()){
            for (int j=0;j==tabAnim.length;j++){
                if (tabAnim[j]==null){
                    tabAnim[j] = an;
                    temp = tabAnim[j];
                    System.out.println(temp.getName()+" à été ajouter dans l'enclo numéro "+j);
                }else{
                    if (j!=tabAnim.length-1){
                        continue;
                    }else{
                        System.out.println("le zoo est plein");
                    }
                }
        }
        }else{
            System.out.println("l'annimal est mort");
        }
return true;

}

    public boolean remove(){
        boolean result = false;
        Animal temp = null;
            compteur--;
            temp=tabAnim[compteur];
            tabAnim[compteur]=null;
            System.out.println(temp.getName()+" à été tuer et est au cimetière");
            result= true;
        return result;
    }

    public void birthZoo(){
        Animal temp = null;
        for (int index=0;index<compteur;index++){
            temp=tabAnim[index];
            if (temp.getOlder()!=false){
                continue;
            }
            else{
                tabAnim[index]=null;
            }
        }
    }

    public void feedAnimal(){
        Animal temp = null;
        for (int index=0;index!=tabAnim.length;index++){
            temp=tabAnim[index];
            if (temp!=null){
                System.out.println(temp.eat());
            }else{
                continue;
            }
        }
    }

    public void listZoo(){
        Animal temp = null;
        for (int index=0;index!=tabAnim.length;index++){
            temp=tabAnim[index];
            if (temp==null){
                continue;
            }else{
                System.out.println(temp.toString()+"");
            }
        }
        System.out.println( dir.toString());
    }
}