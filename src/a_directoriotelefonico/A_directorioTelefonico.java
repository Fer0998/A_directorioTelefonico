
package a_directoriotelefonico;


public class A_directorioTelefonico {


    public static void main(String[] args) {
        
        DirectorioTelefonico Agenda = new DirectorioTelefonico();
        Cliente p1 = new Cliente(23456345,"Román","Arguello","Buenos Aires","Paseo Alcorta 345");
        Cliente p2 = new Cliente(22543776,"Alberto","Socroto","Mendoza","Av.Budgue 453");
        Cliente p3 = new Cliente(25666431,"Romina","Paso","Salta","Paso de los bajos 222");
        Cliente p4 = new Cliente(32997110,"Sofía","Murgari","Cordoba","Av.Belgrano 311");
        Cliente p5 = new Cliente(26784555,"Rosalía","Diexler","San Luis","Dellepiane 801");
        Cliente p6 = new Cliente(19843288,"Cristian","Burzaco","Tucuman","Av.de los Libres 1790");

    
       Agenda.agregarCliente(155234361, p1);
       Agenda.agregarCliente(155234362, p2);
       Agenda.agregarCliente(155234363, p3);      
       Agenda.agregarCliente(155234364, p4);
       Agenda.agregarCliente(155234365, p5); 
       Agenda.agregarCliente(155234366, p6);
       
       Agenda.mostrarArreglo(Agenda.buscarCiudadCliente("Buenos Aires"));
       
    }
    
}
