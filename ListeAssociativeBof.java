import java.util.LinkedList;
import java.util.List;

public class ListeAssociativeBof<K,E> {
    private class Association {
       private K clef;
       private E element;
       public Association(K clef, E element) {
          if ((clef == null) || (element == null))
             throw new IllegalArgumentException("clef ou element null");
          this.clef = clef; this.element = element;
       }
       public K getClef() {
          return clef;
       }
       public E getElement() {
          return element;
       }
       public void setElement(E element) {
          if (element != null)
             this.element = element;
       }
       public boolean memeClef(K autreClef) {
          return ((autreClef != null)
           && (this.clef.equals(autreClef)));
       }
	       public String toString() {
		   return "("+this.clef+" => "+this.element+")";
	       }
    }

    private List<Association> liste = new LinkedList<Association>();   // une implementation
    public boolean put(K nouvelleClef, E nouvelElement) {
       if ((nouvelleClef == null) || (nouvelElement == null))
          return false;
       Object recherche = this.getAssociation(nouvelleClef);
       if (recherche == null)
          liste.add(new Association(nouvelleClef, nouvelElement));
       else {
          Association assoc = (Association)recherche;
          assoc.setElement(nouvelElement);
       }
       return true;
    }
    private Association getAssociation(K autreClef) {
       if (autreClef == null)
          return null;
       for (Object item : liste ) {
          Association assoc = (Association)item;
          if (assoc.memeClef(autreClef))
             return assoc;
       }
       return null;
    }
    public E get(K autreClef) {
       if (autreClef == null)
          return null;
       Association assoc = (Association)this.getAssociation(autreClef);
       if (assoc == null)
             return null;
       else
          return assoc.getElement();
    }
    public boolean remove(K autreClef) {
       if (autreClef == null)
          return false;
       for (int i=liste.size()-1; i>0; i--  ) {
          Association assoc = (Association)liste.get(i);
          if (assoc.memeClef(autreClef)) {
             liste.remove(i);
             return true;
          }
       }
       return false;
    }
    public String toString() {
   	 int max = liste.size()-1;
   	 StringBuffer result = new StringBuffer("{ ");
        if (max >= 0)
       	 result.append(liste.get(0).toString());
		 for (int i=1; i<=max; i++)
			 result.append(", "+liste.get(i).toString());
		 result.append(" }");
		 return result.toString();
    }
}
