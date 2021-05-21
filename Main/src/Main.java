
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
public class Main extends javax.swing.JFrame {

    private String other;

    /** Creates new form Complain */
    public Main() {
        initComponents();
    }

    public Main(String Transfer1) {
        initComponents();
        trans2.setText(Transfer1);   // Retrivind PIN Compalin OR Non_Complain Frame
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        Pnl1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nm1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cpl1 = new javax.swing.JButton();
        Ph1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        trans2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abstergo");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFont(new java.awt.Font("LCD", 0, 24));
        setForeground(new java.awt.Color(255, 0, 0));
        setIconImages(null);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setLayout(null);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("LCD", 0, 18));
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(850, 430, 100, 30);

        t2.setFont(new java.awt.Font("LCD", 0, 12));
        jPanel5.add(t2);
        t2.setBounds(10, 420, 160, 20);

        Pnl1.setBackground(new java.awt.Color(0, 0, 0));
        Pnl1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true), "DIRECT COMPLAIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("LCD", 0, 24), new java.awt.Color(51, 255, 255))); // NOI18N
        Pnl1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("LCD", 0, 24));
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Name");

        Nm1.setFont(new java.awt.Font("LCD", 0, 18));
        Nm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nm1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nm1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("LCD", 0, 24));
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Ph No.");

        Cpl1.setBackground(new java.awt.Color(255, 255, 255));
        Cpl1.setFont(new java.awt.Font("LCD", 0, 18));
        Cpl1.setForeground(new java.awt.Color(51, 51, 51));
        Cpl1.setText("Complain");
        Cpl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cpl1ActionPerformed(evt);
            }
        });

        Ph1.setFont(new java.awt.Font("LCD", 0, 18));
        Ph1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Ph1KeyTyped(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("LCD", 0, 18));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl1Layout = new javax.swing.GroupLayout(Pnl1);
        Pnl1.setLayout(Pnl1Layout);
        Pnl1Layout.setHorizontalGroup(
            Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(Nm1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(Pnl1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl1Layout.createSequentialGroup()
                                .addComponent(Cpl1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addComponent(Ph1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        Pnl1Layout.setVerticalGroup(
            Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Ph1))
                .addGap(28, 28, 28)
                .addGroup(Pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpl1)
                    .addComponent(jButton6))
                .addGap(20, 20, 20))
        );

        jPanel5.add(Pnl1);
        Pnl1.setBounds(30, 70, 590, 220);

        jButton1.setText("WARNING!!!!!!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(910, 10, 120, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__abstergo___by_0blackcell-d46zmul.jpg"))); // NOI18N
        jPanel5.add(jLabel3);
        jLabel3.setBounds(0, 0, 1040, 480);

        ta1.setColumns(20);
        ta1.setRows(5);
        ta1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                ta1ComponentRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(ta1);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(606, 150, 230, 150);

        trans2.setText("jTextField1");
        jPanel5.add(trans2);
        trans2.setBounds(290, 390, 59, 20);

        jMenu9.setText("For User");
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("To Register");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("In Emergency Cases");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuBar1.add(jMenu9);

        jMenu1.setText("Officier Use");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Non_User");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("User Reference");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem4.setText("Help??");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem5.setText("About The Program");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1038)/2, (screenSize.height-495)/2, 1038, 495);
    }// </editor-fold>//GEN-END:initComponents

    private void Cpl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cpl1ActionPerformed
        String Name = Nm1.getText();            // Matching the Name to find a record
        String Ph = Ph1.getText();              //Matching the Phone Number to find a record
        if (Ph.isEmpty()) {
            Nm1.setText("");
            Ph1.setText("");
            JOptionPane.showMessageDialog(this, "Enter the Name and Ph.No");
        }
        else {
            try {                                               // Getting connection with a_register table in mysql
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Abstergo", "root", "u");
                Statement stmt = (Statement) con.createStatement();
                String query = "SELECT * FROM a_register WHERE Phone=" + Ph + ";";
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next()) {
                    Name = rs.getString("name");
                    String PIN = rs.getString("Pin");
                    String Address = rs.getString("Address");

                    Nm1.setText(Name);
                    t2.setText(PIN);
                    ta1.setText("Name :" + Name + '\n' + "Address :" + Address + '\n' + PIN);
                    String Complain1 = ta1.getText();
                    this.setVisible(false);
                    new Complain(Ph).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry!!!!  No Such Record Found .. PLEASE Register First");// This part is executed if no matching record is found
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                Nm1.setText("");
                Ph1.setText("");
            }
        }




  
}//GEN-LAST:event_Cpl1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);     // Close the Frame
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Nm1.setText("");  // Reseting Name and Phone Text Field
        t2.setText("");
        Ph1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ta1.setVisible(false);
        t2.setVisible(false);


    }//GEN-LAST:event_formWindowOpened

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        new Non_Registrated().setVisible(true);         // Opens Non_Register Frame
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        new Register().setVisible(true);     // Opens Register Frame
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String Details2 = trans2.getText();
        this.setVisible(false);
        new Non_User_Login(Details2).setVisible(true);        // Transfering PIN to Non_User_Login Frame
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\1\\Documents\\NetBeansProjects\\Abstergo\\src\\Help.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CHECK FILE DETAILS");
        }                                                                    // Opens PDF for "Help"
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void Ph1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Ph1KeyTyped
        boolean max = Ph1.getText().length() > 9;
        if (max) {
            evt.consume();
        }                         // Limits the digit upto 10 only
}//GEN-LAST:event_Ph1KeyTyped

    private void Nm1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nm1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Nm1KeyTyped

    private void Nm1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nm1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nm1KeyPressed

    private void ta1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ta1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ta1ComponentRemoved

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
try {
              Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\1\\Documents\\NetBeansProjects\\Abstergo\\src\\About The Program.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CHECK FILE DETAILS");
        }        // Open PDF for " About the Help "
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JOptionPane.showMessageDialog(null, " There can be a call after making complain to confirm the USER's  Complain. \n" + "Invalid Complain can charge Rs.10000. & 1 Week Imprisonment.");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cpl1;
    private javax.swing.JTextField Nm1;
    private javax.swing.JTextField Ph1;
    private javax.swing.JPanel Pnl1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField trans2;
    // End of variables declaration//GEN-END:variables
}
