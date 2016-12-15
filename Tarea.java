
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String nombreTarea;
    
    private boolean tareaTerminada;
    /**
     * se crea el constructor con parametro para
     * añadir las tareas
     */
    public Tarea(String nuevaTarea)
    {
        nombreTarea = nuevaTarea;
        tareaTerminada = false;
    }

    public String getTarea()
    {
        return nombreTarea;
        
    }
    
    public boolean tareaHecha()
    {
        return tareaTerminada;
    }
}

