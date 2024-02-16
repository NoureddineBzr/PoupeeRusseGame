package PoupeeRussePack;



class PoupeeRusse extends Poupee {
    private PoupeeRusse contenue;

    public PoupeeRusse(int taille) {
        super(taille);
    }

    @Override
    
    public void placerDans(Poupee p) {
        if (!p.estOuverte()) {
            System.out.println("La poupée dans laquelle vous voulez placer une autre poupée est fermée.");
            return;
        }
        if (p.getTaille() < this.getTaille()) {
            System.out.println("Impossible de placer une poupée plus grande à l'intérieur.");
            return;
        }
        if (contenue != null) {
            System.out.println("Il y a déjà une poupée à l'intérieur.");
            return;
        }
        contenue =(PoupeeRusse) p;
        System.out.println("La poupée de taille " + p.getTaille() + " est placée dans la poupée de taille " + this.getTaille() + ".");
    }

    @Override
    public void sortirDe(Poupee p) {
        if (contenue == null) {
            System.out.println("Il n'y a pas de poupée à l'intérieur.");
            return;
        }
        if (p != contenue) {
            System.out.println("Cette poupée n'est pas à l'intérieur de la poupée spécifiée.");
            return;
        }
        contenue = null;
        System.out.println("La poupée de taille " + p.getTaille() + " est sortie de la poupée de taille " + this.getTaille() + ".");
    }
}
