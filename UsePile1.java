import java.util.*;
public class UsePile1  {
  public static void main(String args[]) {
      Collection<String> collection = Arrays.asList("ceci", "est", "une", "pile", "de", "mots");
      // Collection<> collection = null;
      Pile1<String> pile = null;
      try {
        pile= new Pile1<String>(collection);
      } catch (NullPointerException npe) {
        System.out.println(npe.getMessage());
        return;
      }
      System.out.println("q(uitter), a(fficher), s(ommet), e(mpiler) mot, d(epiler), v(ide)");
      Scanner sc = new Scanner(System.in);
      String rep;
      try{        
      do {
        rep = sc.next().trim();
        if (rep.equals("a"))          
          System.out.println(pile.toString());
        else if (rep.equals("s") && !pile.estVide()) {
          String mot = (String) pile.sommet();
          System.out.println(mot);
        } else if (rep.equals("v"))          
          System.out.println(pile.estVide()?"vide":"non vide");
        else if (rep.equals("d"))          
          pile.depiler();
        else if (rep.equals("e")) {
          rep = sc.next().trim();   
          pile.empiler(rep);
          rep = "";
        }
      } while (! rep.equals("q")) ;
    }catch(EmptyStackException es){
      System.out.println("La pile est vide ");
    }
  }
}
