import javax.swing.JOptionPane;
public  class ejercicio4{
    
    
 public static void main(String[] args) {
        String name = "";
        name=JOptionPane.showInputDialog("Please enter your name");
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

