package tamagochi;


public class AVATAR {
	private int energy;
	private int weight;	
	private String nom;
	public AVATAR(){
        
    }
    public AVATAR(String nom,int energy, int weight){
        this.energy = energy;
        this.weight = weight;
        this.nom = nom;
    }
    //getters and setters for the attributs of the avatar class
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public int getEnergy(){
        return this.energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
	
}
