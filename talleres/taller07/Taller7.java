
/**
 * Write a description of class Taller7 here.
 * 
 * @author (Jacobo Rave y Sebastian Guerra) 
 * @version (a version number or a date)
 */
public class Taller7
{  
    public static void main(String args[]){
    LinkedListJacSeb a = new LinkedListJacSeb();
  
    a.insert(3,0);
    a.insert(8,0);
    a.insert(10,1);
    a.insert(1,2);
    a.insert(7,3);
    
    int respuesta = encontrarMayor(a);
    System.out.println("El mayor es: "+ respuesta) ;
    }
    
    public static int encontrarMayor(LinkedListJacSeb listaEnlazada){
    Node cabeza = listaEnlazada.first();
    return size(cabeza,0);
    }
    
    public static int size(Node nodoActual, int mayor){
        if(nodoActual==null){
            return mayor;
        }
        else{
           
            mayor=Math.max(nodoActual.data,mayor);
            return size(nodoActual.next,mayor);
        }
        }
}