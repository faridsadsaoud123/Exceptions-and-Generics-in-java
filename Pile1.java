import java.util.*;
public class Pile1<T extends Object> {
  private ArrayList<T> liste;
  public Pile1() {
    liste = new ArrayList<T>();
  }
  public Pile1(Collection<T> collection) throws NullPointerException {
    // suppose que collection != null)
    if(collection==null){
        throw new NullPointerException("Collection null");
    }
    int taille = collection.size();
    liste = new ArrayList<>(taille);
    int i=0;
    for (T element : collection)
      liste.add(i++, element);
  }
  public void empiler(T element) {
    liste.add(element);
  }
  public Object sommet() {
    int taille = liste.size();
    if (taille == 0)
      return null;
    else
      return liste.get(taille - 1);
  }   
  public T depiler() throws EmptyStackException{
    int taille = liste.size();
    if (taille == 0)
      throw new EmptyStackException();
    else {
      T element = liste.get(taille - 1);
      liste.remove(taille - 1);
      return element;
    }
  }   
  public boolean estVide(){
    return (liste.size() == 0);
  }
  public String toString() {
    StringBuffer result = new StringBuffer("[[ ");
    int max = liste.size() - 1;
    for ( int i=0; i < max; i++)
      result.append(liste.get(i).toString()+",");
    if (max >= 0)
      result.append(liste.get(max).toString());
    return result.toString() + " <-";
  }
}
