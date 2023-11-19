import java.util.*;


public class SommeListeNombre{
    public static <T extends Number> double Somme(List<T> list){
        double s=0;
        for(T element : list){
            s=s+element.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        list.add(5.0);
        list.add(5.0);
        list.add(5.0);
        list.add(5.0);
        list.add(5.0);
        System.out.println("la somme est : \n"+Somme(list));
    }
}
