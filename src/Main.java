
import com.formdev.flatlaf.FlatLightLaf;
import views.Login;

public class Main {

    public static void main(String args[]) {
        
        FlatLightLaf.install();        
        Login start = new Login();
        start.setVisible(true);
        
    }
    
}
