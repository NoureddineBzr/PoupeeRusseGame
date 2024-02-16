package PoupeeRussePack;


abstract class Poupee {
    private int taille;
    private boolean ouverte;
    
    public Poupee(int taille) {
        this.taille = taille;
        this.ouverte = false;
    }
    
    public int getTaille() {
        return taille;
    }
    
    
    public boolean estOuverte() {
        return ouverte;
    }
    
    public void ouvrir() {
        ouverte = true;
        System.out.println("La poupée de taille " + taille + " est ouverte.");
    }
    
    public void fermer() {
        ouverte = false;
        System.out.println("La poupée de taille " + taille + " est fermée.");
    }
    
    public abstract void placerDans(Poupee p);
    
    public abstract void sortirDe(Poupee p);
}
