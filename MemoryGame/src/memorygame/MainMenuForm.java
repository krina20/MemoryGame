package memorygame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author user
*/
public class MainMenuForm extends javax.swing.JFrame {
 
    GameBoard Game = new GameBoard();
    public MainMenuForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MainMenuLabel = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to MemoryTiles");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/Icon.png"))); // NOI18N
        jPanel1.add(MainMenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        StartButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 149, 37));

        ExitButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        ExitButton.setText("Quit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 149, 37));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        Game.setVisible(true);
    }//GEN-LAST:event_StartButtonActionPerformed

    //Quit the whole program
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        JOptionPane.showConfirmDialog(null, "Do you want to quit the game?","WARNING",dialogButton);
        if(dialogButton == 0)
        {
            //JOptionPane.showMessageDialog(null, "BYE!");
            //System.exit(0);
            this.dispose();
        }
        else{
            //Game.setVisible(true);
            //remove(dialogButton);
        }  
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel MainMenuLabel;
    private javax.swing.JButton StartButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}