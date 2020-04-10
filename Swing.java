import javax.swing.*;
;
public class Swing extends JFrame {
    public Swing(){
        super ("Frame Title");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc){

        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        SimpleFrame sf = new SimpleFrame();
        sf.setVisible(true);
    }

}