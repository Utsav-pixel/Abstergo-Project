
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author Prajapati
 */
public class screen {

    public static void main(String[] args) {

        splashlogo Splash1 = new splashlogo();      // It Opens Slash Scrren
        Splash1.setVisible(true);
        try {
            Thread.sleep(7000);                     // Time Lag 7 Seconds
        } catch (InterruptedException ex) {
            Logger.getLogger(screen.class.getName()).log(Level.SEVERE, null, ex);
        }
        Splash1.setVisible(false);
        splash Splash = new splash();               // It Opens Loading Sscreen
        Splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                Splash.LoadingN.setText(Integer.toString(i) + "%");
                Splash.LoadingBar.setValue(i);
            }
            Splash.setVisible(false);
            new Main().setVisible(true);
        } catch (Exception e) {
        }
    }
}
