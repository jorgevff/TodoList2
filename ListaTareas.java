import java.util.ArrayList;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    // instance variables - replace the example below with your own
    private ArrayList<Tarea> tareas;

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        // initialise instance variables
        tareas = new ArrayList<Tarea>();
    }

    public void añadeTarea(String textoTarea)
    {
      Tarea tarea = new Tarea(textoTarea);
      tareas.add(tarea);
      
     
    }
    
    public void mostrarTarea()
    {
    
    
    }
    
    
}