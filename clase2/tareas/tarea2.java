/*tarea 2 
@Eduardo Villanueva*/
import javax.swing.JOptionPane;
public  class tarea2{
    
    
 public static void main(String[] args) {
        String name = "";
        name=JOptionPane.showInputDialog("Por favor introduce tu nombre");
        String msg = "hola " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

