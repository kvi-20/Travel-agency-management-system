
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vijay
 */
public class issue extends javax.swing.JFrame {

    /**
     * Creates new form issue
     */
    public issue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdIssue = new javax.swing.JButton();
        cmdExit4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lst1 = new javax.swing.JList();
        l17 = new javax.swing.JLabel();
        txtMNo1 = new javax.swing.JTextField();
        l29 = new javax.swing.JLabel();
        txtMName1 = new javax.swing.JTextField();
        l30 = new javax.swing.JLabel();
        txtMDate1 = new javax.swing.JTextField();
        l31 = new javax.swing.JLabel();
        txtMStatus1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList();
        jLabel37 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtIDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue vehicle");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cmdIssue.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cmdIssue.setText("Issue");
        cmdIssue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIssueActionPerformed(evt);
            }
        });

        cmdExit4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cmdExit4.setText("Exit");
        cmdExit4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdExit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExit4ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jButton15.setText("BACK TO MAIN FORM");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ISSUE VEHICLE");
        jLabel16.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        lst1.setBackground(new java.awt.Color(0, 0, 0));
        lst1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select a member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        lst1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lst1.setForeground(new java.awt.Color(255, 255, 255));
        lst1.setModel(new DefaultListModel());
        lst1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(lst1);

        l17.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l17.setText("Member No.");

        txtMNo1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtMNo1.setForeground(new java.awt.Color(51, 204, 0));
        txtMNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMNo1.setDisabledTextColor(new java.awt.Color(0, 102, 0));

        l29.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        l29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l29.setText("Name");

        txtMName1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtMName1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMName1ActionPerformed(evt);
            }
        });
        txtMName1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtMName1PropertyChange(evt);
            }
        });
        txtMName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMName1KeyPressed(evt);
            }
        });

        l30.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        l30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l30.setText("Membership Date");

        txtMDate1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtMDate1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        l31.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        l31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l31.setText("Status");

        txtMStatus1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtMStatus1.setForeground(new java.awt.Color(0, 102, 0));
        txtMStatus1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(l17)
                        .addGap(39, 39, 39)
                        .addComponent(txtMNo1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l30)
                            .addComponent(l29)
                            .addComponent(l31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMDate1)
                            .addComponent(txtMName1)
                            .addComponent(txtMStatus1))))
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l17)
                            .addComponent(txtMNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l29)
                            .addComponent(txtMName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l30)
                            .addComponent(txtMDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l31)
                            .addComponent(txtMStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(698, 220));

        list2.setBackground(new java.awt.Color(0, 0, 0));
        list2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select a Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        list2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        list2.setForeground(new java.awt.Color(255, 255, 255));
        list2.setModel(new DefaultListModel());
        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list2MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(list2);

        jLabel37.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Accession No.");

        jTextField1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 102, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 102, 0));

        jLabel42.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Vehicle Name");

        jTextField18.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel66.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Disc");

        jTextField19.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel67.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("veh_no");

        jTextField20.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(0, 102, 0));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setDisabledTextColor(new java.awt.Color(51, 102, 0));

        jLabel68.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Status");

        jTextField21.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(0, 0, 153));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setDisabledTextColor(new java.awt.Color(0, 0, 102));

        jLabel69.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Enter Issue Date :");

        txtIDate.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        txtIDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(29, 29, 29)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextField20)
                            .addComponent(jTextField21)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(txtIDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 604, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Statement stmt;
ResultSet rs;
 Statement mem = null;
    ResultSet rmem = null;
    String st1 = "YES";
 String meme = "SELECT * FROM Member WHERE mem_issue = '" + st1 +  "';";

 
   Statement ve = null;
    ResultSet rve = null;
      String st2 = "YES";
 String vee= "SELECT * FROM veh WHERE issue_status = '" + st2 +  "';";
    Statement smissue = null;
    ResultSet rsmissue = null;
    String m = "SELECT * FROM Missue";

    Statement stissue = null;
    ResultSet rstissue = null;
    String t = "SELECT * FROM Tissue";
    String sql = "SELECT * FROM Member;";
    
    private void cmdIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIssueActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","blue");
            // Missue table
            Statement smissue = con.createStatement();
            rsmissue =smissue.executeQuery(m);
           
            // Tissue table
            stissue = con.createStatement();
            rstissue = stissue.executeQuery(t);
            int Acno = Integer.parseInt(jTextField1.getText().trim());
            int Mno = Integer.parseInt(txtMNo1.getText().trim());
            String idt = txtIDate.getText();
            String rdt = idt;
            int code = JOptionPane.showConfirmDialog(this, "Are you sure to add?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {
                // Record updated into Missue and Tissue tables
                String strSQL = "INSERT INTO Missue(acc_no, memb_no, idate, rdate) VALUES ("+(Acno)+", "+(Mno)+", '"+(idt)+"', '"+(rdt)+"')";
                String strSQL1 = "INSERT INTO Tissue(acc_no, memb_no, idate, rdate) VALUES ("+(Acno)+", "+(Mno)+", '"+(idt)+"', '"+(rdt)+"')";

                int rowEffected = smissue.executeUpdate(strSQL);

                int rowsEffected = stissue.executeUpdate(strSQL1);

                // Change the status as veh issued
                String sta = "YES";  // Lib table
                String strSQLa = "Update veh set issue_status ='"+(sta)+"' where v_no = " + (Acno)+"";
                ve.executeUpdate(strSQLa);

               

                String stb = "YES";  // Member table
                String strSQLb = "Update Member set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                mem.executeUpdate(strSQLb);
                JOptionPane.showMessageDialog(this, "Record update successfully"
                    + '\n'+"thanks have a nice journey");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cmdIssueActionPerformed

    private void cmdExit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExit4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cmdExit4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        new first().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void lst1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst1MouseClicked
        String MembNo = (String) lst1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String quer = "SELECT * FROM member WHERE memb_no = " +(Mno)+ ";";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","blue");
            // Create SQL statement and execute query.
            mem = con.createStatement();
            rmem = mem.executeQuery(quer);

            if (rmem.next()) {
                String MName = rmem.getString("memb_name");
                String MDate = rmem.getString("mdate");
                String MStatus = rmem.getString("mem_issue");

                // Displaying the contents in respective text boxes.
                txtMNo1.setText(Mno);
                txtMName1.setText(MName);
                txtMDate1.setText(MDate);
                txtMStatus1.setText(MStatus);
            } else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN TABLE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lst1MouseClicked

    private void txtMName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMName1ActionPerformed

    }//GEN-LAST:event_txtMName1ActionPerformed

    private void txtMName1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMName1PropertyChange

    }//GEN-LAST:event_txtMName1PropertyChange

    private void txtMName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMName1KeyPressed

    }//GEN-LAST:event_txtMName1KeyPressed

    private void list2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MouseClicked

        String MembNo = (String) list2.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String Mno =MembNo.trim().substring(0, 4);
        String quer = "SELECT * FROM veh WHERE v_no = " +(Mno)+ ";";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","blue");

            ve = con.createStatement();
            rve = ve.executeQuery(quer);

            if (rve.next()) {
                String MName = rve.getString("v_name");
                String disc = rve.getString("oth_disc");
                String MStatus = rve.getString("issue_status");
                // Displaying the contents in respective text boxes.

                jTextField1.setText(Mno);
                jTextField18.setText(MName);
                jTextField19.setText(disc);
                jTextField20.setText(Mno);
                jTextField21.setText(MStatus);

            }
            else {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT FOUND IN TABLE");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_list2MouseClicked

    private void txtIDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDateActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    txtMNo1.setEditable(false);
        txtMName1.setEditable(false);
        txtMDate1.setEditable(false);
        txtMStatus1.setEditable(false);
        jTextField18.setEditable(false);
        jTextField19.setEditable(false);
        jTextField20.setEditable(false);
        jTextField1.setEditable(false);
        jTextField21.setEditable(false);

     
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","blue");

            mem = con.createStatement();
            rmem = mem.executeQuery(meme);
            //for service users
                      
   DefaultListModel dModel = (DefaultListModel) lst1.getModel();
                dModel.clear();
            while (rmem.next()) {
                String Mno = rmem.getString("memb_no");
                String MName = rmem.getString("memb_name");
   
           dModel.addElement(Mno + " - " + MName);
            
          }
           lst1.setModel(dModel);
 //for veh
           DefaultListModel fModel = (DefaultListModel) list2.getModel();
                 fModel.clear();
            ve = con.createStatement();
            rve = ve.executeQuery(vee);
            while (rve.next()) {
                String Ano = rve.getString("v_no");
                String BTitle = rve.getString("v_name");

                fModel.addElement(Ano + "- " + BTitle);

        }
             list2.setModel(fModel);

        }

    catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit4;
    private javax.swing.JButton cmdIssue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l30;
    private javax.swing.JLabel l31;
    private javax.swing.JList list2;
    private javax.swing.JList lst1;
    private javax.swing.JTextField txtIDate;
    private javax.swing.JTextField txtMDate1;
    private javax.swing.JTextField txtMName1;
    private javax.swing.JTextField txtMNo1;
    private javax.swing.JTextField txtMStatus1;
    // End of variables declaration//GEN-END:variables
}
