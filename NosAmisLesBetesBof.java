

public class NosAmisLesBetesBof {
  public static void main(String[] args) {
    ListeAssociativeBof<Personne,Chat> maitreChat = new ListeAssociativeBof<Personne,Chat>();
    Personne personneA = new Personne("Shark", "Nico");
    Personne personneB = new Personne("Prune", "Carlita");
    Personne personneC = new Personne("Melangeons", "Tout");
    Chat chat1 = new Chat("Chouchou");
    Chat chat2 = new Chat("Garfield");
    maitreChat.put(personneA, chat1);
    maitreChat.put(personneB, chat1);
    maitreChat.put(personneC, chat2);
    System.out.println(maitreChat.toString());
    Object recherche = maitreChat.get(personneB);
    if ((recherche != null) && recherche instanceof Chat) {
      Chat chat = (Chat)recherche;
      System.out.println("chat recherché : "+chat.toString());
    };
  }
}
