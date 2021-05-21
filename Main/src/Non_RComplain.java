
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Complain.java
 *
 * Created on Jun 5, 2018, 10:41:11 AM
 */
/**
 *
 * @author Prajapati
 */
public class Non_RComplain extends javax.swing.JFrame {

    private String other;

    /** Creates new form Complain */
    public Non_RComplain() {
        initComponents();
    }

    public Non_RComplain(String Transfer1) {
        initComponents();
        Trans.setText(Transfer1);                 // Retrive PIN from Main Frame
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        Trans = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BCom = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Case2 = new javax.swing.JTextArea();
        Case1 = new javax.swing.JComboBox();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        Trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransActionPerformed(evt);
            }
        });
        jPanel2.add(Trans);
        Trans.setBounds(20, 440, 130, 28);

        jButton3.setFont(new java.awt.Font("LCD", 0, 24));
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(610, 420, 110, 33);

        jButton2.setFont(new java.awt.Font("LCD", 0, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(750, 420, 110, 33);

        BCom.setFont(new java.awt.Font("LCD", 0, 24));
        BCom.setText("Complain");
        BCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComActionPerformed(evt);
            }
        });
        jPanel2.add(BCom);
        BCom.setBounds(440, 420, 130, 33);

        Panel1.setBackground(new java.awt.Color(0, 0, 0));
        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true), "Describe Your Case Here..", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("LCD", 0, 18), new java.awt.Color(58, 185, 17))); // NOI18N

        Case2.setColumns(20);
        Case2.setFont(new java.awt.Font("LCD", 0, 18));
        Case2.setLineWrap(true);
        Case2.setRows(5);
        Case2.setTabSize(5);
        Case2.setWrapStyleWord(true);
        Case2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Case2KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Case2);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(Panel1);
        Panel1.setBounds(540, 20, 410, 270);

        Case1.setFont(new java.awt.Font("LCD", 0, 24));
        Case1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Murder", "Theft", "Kidnap Case", "Cyber Crime", "Conflict", "Suicide Case", "Others" }));
        Case1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Case1ActionPerformed(evt);
            }
        });
        jPanel2.add(Case1);
        Case1.setBounds(120, 140, 164, 31);

        L2.setFont(new java.awt.Font("LCD", 0, 24));
        L2.setForeground(new java.awt.Color(153, 153, 255));
        L2.setText("Type Of complain :--");
        jPanel2.add(L2);
        L2.setBounds(60, 100, 208, 25);
        jPanel2.add(L1);
        L1.setBounds(20, 410, 160, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__abstergo___by_0blackcell-d46zmul.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1040, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1038)/2, (screenSize.height-495)/2, 1038, 495);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Main().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Case1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Case1ActionPerformed
        String Pin = Trans.getText();
        String reason = "";


        {
            if (Case1.getSelectedItem() == "Murder") {
                reason = "Murder";
                Panel1.setVisible(false);
                Case2.setVisible(false);
            } else if (Case1.getSelectedItem() == "Theft") {
                reason = "Theft";
                Panel1.setVisible(false);
                Case2.setVisible(false);
            } else if (Case1.getSelectedItem() == "Kidnap Case") {
                reason = "Kidnap Case";
                Panel1.setVisible(false);
                Case2.setVisible(false);
            } else if (Case1.getSelectedItem() == "Cyber Crime") {
                reason = "Cyber Crime";
                Panel1.setVisible(false);
                Case2.setVisible(false);
            } else if (Case1.getSelectedItem() == "Conflict") {
                reason = "Conflict";
                Panel1.setVisible(false);
                Case2.setVisible(false);
            } else if (Case1.getSelectedItem() == "Suicide Case") {
                reason = "Suicide Case";
                Panel1.setVisible(false);
                Case2.setVisible(false);
            } else if (Case1.getSelectedItem() == "Others") {
                Panel1.setVisible(true);
                Case2.setVisible(true);
                Case1.setVisible(false);
                L2.setVisible(false);
            }


        }
        L1.setText(reason);

        BCom.setVisible(true);   // Complain Button
}//GEN-LAST:event_Case1ActionPerformed

    private void BComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComActionPerformed
        String Ph = Trans.getText();
        String result = L1.getText();

        if (Case1.getSelectedItem() == "Others") {

            Panel1.setVisible(true);
            Case2.setVisible(true);
            Case1.setVisible(false);
            L2.setVisible(false);
        }
        String other1 = Case2.getText();

// Search the table to find a record matching
        try {                                               // Getting connection with non_register table in mysql
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Abstergo", "root", "u");
            Statement stmt = (Statement) con.createStatement();
            String query = "SELECT *,sysdATE() FROM non_register WHERE phone='" + Ph + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                String Name = rs.getString("name");
                String PIN = rs.getString("Pin");
                String Address = rs.getString("Address");
                String Tnd = rs.getString("sysdate()");
                int ans = JOptionPane.showConfirmDialog(this, "Name :" + Name + '\n' + "Address :" + Address + '\n' + PIN + '\n' + "Type of complain:-" + result + other1 + '\n' + "Ph:-" + Ph + '\n' + "Time and date :-" + Tnd, "Confirm your information" + "2", JOptionPane.YES_NO_OPTION);
                if (ans == 0) {
                    JOptionPane.showMessageDialog(null, "Your Complain has been done.......YOU WILL GET RESULT SOON");
                    String s1 = Ph + '\n' + "Type of complain:-" + result + other1 + "       " + Tnd;
                    this.setVisible(false);
                    new Main(s1).setVisible(true);
                } else {
                    Case2.setVisible(false);
                    Case1.setVisible(true);
                    Case1.setSelectedIndex(-1);
                    Trans.setVisible(false);
                    Panel1.setVisible(false);
                    L1.setVisible(false);
                    BCom.setVisible(false);
                    L2.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }





    // TODO add your handling code here:
}//GEN-LAST:event_BComActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Case1.setVisible(true);
        L2.setVisible(true);
        Case2.setVisible(false);
        Panel1.setVisible(false);
        Case1.setSelectedIndex(-1);
        Case2.setText("");
        BCom.setVisible(false);


// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your haode here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Case2.setVisible(false);
        Case1.setSelectedIndex(-1);
        Trans.setVisible(false);
        Panel1.setVisible(false);
        L1.setVisible(false);
        BCom.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void TransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransActionPerformed

    private void Case2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Case2KeyTyped
        boolean max = Case2.getText().length() > 60;
        if (max) {
            evt.consume();
        }        // Limits the Maximum input upto 61 only
    }//GEN-LAST:event_Case2KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Complain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCom;
    private javax.swing.JComboBox Case1;
    private javax.swing.JTextArea Case2;
    private javax.swing.JTextField L1;
    private javax.swing.JLabel L2;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField Trans;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
