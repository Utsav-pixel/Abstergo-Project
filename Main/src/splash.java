/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * splash.java
 *
 * Created on Nov 22, 2018, 12:06:49 AM
 */

/**
 *
 * @author Prajapati
 */
public class splash extends javax.swing.JFrame {

    /** Creates new form splash */
    public splash() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        LoadingBar.setBackground(new java.awt.Color(0, 0, 0));
        LoadingBar.setForeground(new java.awt.Color(102, 255, 102));
        LoadingBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        LoadingBar.setBorderPainted(false);
        jPanel1.add(LoadingBar);
        LoadingBar.setBounds(260, 430, 400, 30);

        LoadingN.setBackground(new java.awt.Color(255, 255, 255));
        LoadingN.setFont(new java.awt.Font("LCD", 0, 48));
        LoadingN.setForeground(new java.awt.Color(102, 255, 102));
        LoadingN.setText("99 %");
        jPanel1.add(LoadingN);
        LoadingN.setBounds(400, 250, 110, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/23568.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 498);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-978)/2, (screenSize.height-493)/2, 978, 493);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar LoadingBar;
    public javax.swing.JLabel LoadingN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
