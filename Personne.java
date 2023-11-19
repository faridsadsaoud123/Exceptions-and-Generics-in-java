public class Personne {
  public String nom;
  public String prenom;
  public Personne(String nom, String prenom) {
    this.nom = nom; this.prenom = prenom;
  }
  public String toString() {
    System.out.println("sssss");
    return "personne: "+prenom+" "+nom.toUpperCase();
  }
}