package Projects;
import static java.awt.Color.CYAN;
import static java.awt.Color.GREEN;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.ORANGE;
import static java.awt.Color.RED;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Java_TicTacToe extends javax.swing.JFrame {

    private String startGame="X";
    private int xcount=0;
    private int ocount=0;
    boolean checker;
    
  
    public Java_TicTacToe() {
        initComponents();
    }

    
    private void gameScore()
    {
       lb1PlayerX.setText(String.valueOf(xcount));
       lb2PlayerO.setText(String.valueOf(ocount));
       
    }
    
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="o";
        }
        else
            {
            startGame="X";
        }
    }
    
     private void winningGame()
    {
        String b1=jbtnTic1.getText();
        String b2=jbtnTic2.getText();
        String b3=jbtnTic3.getText();
        String b4=jbtnTic4.getText();
        String b5=jbtnTic5.getText();
        String b6=jbtnTic6.getText();
        String b7=jbtnTic7.getText();
        String b8=jbtnTic8.getText();
        String b9=jbtnTic9.getText();
        
        if(b1==("X") && b2==("X") && b3==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(ORANGE);
            jbtnTic2.setBackground(ORANGE);
            jbtnTic3.setBackground(ORANGE);
            xcount++;
            gameScore();
        }
        
        if(b4==("X") && b5==("X") && b6==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(CYAN);
            jbtnTic5.setBackground(CYAN);
            jbtnTic6.setBackground(CYAN);
            xcount++;
            gameScore();
        }
        if(b7==("X") && b8==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(GREEN);
            jbtnTic8.setBackground(GREEN);
            jbtnTic9.setBackground(GREEN);
            xcount++;
            gameScore();
        }
        if(b1==("X") && b4==("X") && b7==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(GREEN);
            jbtnTic4.setBackground(GREEN);
            jbtnTic7.setBackground(GREEN);
            xcount++;
            gameScore();
        }
        if(b1==("X") && b5==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(RED);
            jbtnTic5.setBackground(RED);
            jbtnTic9.setBackground(RED);
            xcount++;
            gameScore();
        }
        if(b3==("X") && b6==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(GREEN);
            jbtnTic6.setBackground(GREEN);
            jbtnTic9.setBackground(GREEN);
            xcount++;
            gameScore();
        }
        if(b3==("X") && b5==("X") && b7==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(CYAN);
            jbtnTic5.setBackground(CYAN);
            jbtnTic7.setBackground(CYAN);
            xcount++;
            gameScore();
        }
        
        if(b1==("o") && b2==("o") && b3==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(ORANGE);
            jbtnTic2.setBackground(ORANGE);
            jbtnTic3.setBackground(ORANGE);
            ocount++;
            gameScore();
        }
        
        if(b4==("o") && b5==("o") && b6==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(CYAN);
            jbtnTic5.setBackground(CYAN);
            jbtnTic6.setBackground(CYAN);
            ocount++;
            gameScore();
        }
        if(b7==("o") && b8==("o") && b9==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(GREEN);
            jbtnTic8.setBackground(GREEN);
            jbtnTic9.setBackground(GREEN);
            ocount++;
            gameScore();
        }
        if(b1==("o") && b4==("o") && b7==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(GREEN);
            jbtnTic4.setBackground(GREEN);
            jbtnTic7.setBackground(GREEN);
            ocount++;
            gameScore();
        }
        if(b1==("o") && b5==("o") && b9==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(RED);
            jbtnTic8.setBackground(RED);
            jbtnTic9.setBackground(RED);
            ocount++;
            gameScore();
        }
        if(b3==("o") && b6==("o") && b9==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(GREEN);
            jbtnTic6.setBackground(GREEN);
            jbtnTic9.setBackground(GREEN);
            ocount++;
            gameScore();
        }
        if(b3==("o") && b5==("o") && b7==("o"))
        {
            JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(CYAN);
            jbtnTic5.setBackground(CYAN);
            jbtnTic7.setBackground(CYAN);
            ocount++;
            gameScore();
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lb2PlayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb1PlayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 680, 680));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 610, 270));

        jPanel11.setBackground(new java.awt.Color(95, 158, 160));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(95, 158, 160));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 680, 680));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -130, 1110, 90));

        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 150));

        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 180, 150));

        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 180, 150));

        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 150));

        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 150));

        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 180, 150));

        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 180, 150));

        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 180, 150));

        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 180, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 660, 560));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 680, 680));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 680, 680));

        lb2PlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        lb2PlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2PlayerO.setOpaque(true);
        jPanel7.add(lb2PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 280, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, -1));

        lb1PlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        lb1PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1PlayerX.setOpaque(true);
        jPanel7.add(lb1PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 280, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player X:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 640, 230));

        jPanel15.setBackground(new java.awt.Color(95, 158, 160));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(95, 158, 160));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 680, 680));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jButton2.setText("New Game");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 620, 90));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jButton13.setText("Reset");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 310, 100));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jButton14.setText("Exit");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton14.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton14.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 300, 100));

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 640, 240));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 680, 560));

        jPanel13.setBackground(new java.awt.Color(95, 158, 160));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(95, 158, 160));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 680, 340));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Java Advance Tic tac toe Game");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 1150, 50));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1350, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(LIGHT_GRAY);
        jbtnTic2.setBackground(LIGHT_GRAY);
        jbtnTic3.setBackground(LIGHT_GRAY);
        jbtnTic4.setBackground(LIGHT_GRAY);
        jbtnTic5.setBackground(LIGHT_GRAY);
        jbtnTic6.setBackground(LIGHT_GRAY);
        jbtnTic7.setBackground(LIGHT_GRAY);
        jbtnTic8.setBackground(LIGHT_GRAY);
        jbtnTic9.setBackground(LIGHT_GRAY);
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        lb1PlayerX.setText("0");
        lb2PlayerO.setText("0");
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(LIGHT_GRAY);
        jbtnTic2.setBackground(LIGHT_GRAY);
        jbtnTic3.setBackground(LIGHT_GRAY);
        jbtnTic4.setBackground(LIGHT_GRAY);
        jbtnTic5.setBackground(LIGHT_GRAY);
        jbtnTic6.setBackground(LIGHT_GRAY);
        jbtnTic7.setBackground(LIGHT_GRAY);
        jbtnTic8.setBackground(LIGHT_GRAY);
        jbtnTic9.setBackground(LIGHT_GRAY);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        jbtnTic1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        jbtnTic3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
       jbtnTic4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        jbtnTic5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        jbtnTic7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        jbtnTic9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            checker=false;
        }
        else{
            checker=true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel lb1PlayerX;
    private javax.swing.JLabel lb2PlayerO;
    // End of variables declaration//GEN-END:variables
}
