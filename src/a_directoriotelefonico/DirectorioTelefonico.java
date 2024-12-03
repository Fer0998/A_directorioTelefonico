
package a_directoriotelefonico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class DirectorioTelefonico {
    
    private HashMap<Integer,Cliente> directorio;

public DirectorioTelefonico() {
        this.directorio = new HashMap();
    }
//-----------------------------------------------------------------------------
public void agregarCliente(int nroTel,Cliente cli){
/*que permite registrar un nuevo cliente con su respectivo nro de teléfono. 
Siendo el nro del teléfono la clave del mismo.*/

    if(directorio.containsKey(nroTel)){
        System.out.print("No se pudo agregar "+nroTel);
        System.out.print(" .El número esta asignado a : "+directorio.get(nroTel).getNombre());
        System.out.println(" "+directorio.get(nroTel).getApellido());
    }else{
    directorio.put(nroTel, cli);
        System.out.println("Agregado "+nroTel);
    }
}
//-----------------------------------------------------------------------------
public Cliente buscarCliente(int nroTel){

    return directorio.get(nroTel);
}
//----------------------------------------------------------------------------
public ArrayList<Integer> buscarTelefono(String apellido){
    
    ArrayList<Integer> nrosTelefonos = new ArrayList();
   
    for (Map.Entry<Integer,Cliente> ap:directorio.entrySet()){
        if (apellido.equalsIgnoreCase(ap.getValue().getApellido())){
            nrosTelefonos.add(ap.getKey());
        }   
    }   
return nrosTelefonos;
}
//-----------------------------------------------------------------------------
public ArrayList<Cliente> buscarCiudadCliente(String ciudad){
  
    ArrayList<Cliente> ciudades = new ArrayList();
   
    for (Cliente ap:directorio.values()){
        if (ciudad.equalsIgnoreCase(ap.getCiudad())){
            ciudades.add(ap);
        }   
    }   
return ciudades;
}
//-----------------------------------------------------------------------------
public void borrarCliente(int nroTel){
    if(directorio.containsKey(nroTel)){
        directorio.remove(nroTel);
        System.out.println("Nro eliminado :"+nroTel);
    }else{
        System.out.println("No se encontro ningún cliente con ese número");
    }
}
//-----------------------------------------------------------------------------
public void mostrarDirectorio(){
      
    for (Map.Entry<Integer,Cliente> r : directorio.entrySet()){
        System.out.println("---------------------------- ");
        System.out.println("Llave : "+r.getKey());
        System.out.println(r.getValue());
    }
}  
 public <T>void mostrarArreglo(ArrayList<T> lista){
     
     Iterator itera = lista.iterator();
     
     System.out.print("[ ");
     
     while (itera.hasNext()){
        System.out.print(itera.next());
         System.out.print(" ");   
     }
     System.out.println("]");
 }

}// fin class
