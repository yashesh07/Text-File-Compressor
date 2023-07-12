package HuffmanCoding;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package ui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author yashesh
 */
public class Main extends javax.swing.JFrame {

    ImageIcon imgCheck = new ImageIcon(new ImageIcon("check.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
    ImageIcon imgError = new ImageIcon(new ImageIcon("check.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
    String userFile;
    String userFileName;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radEncode = new javax.swing.JRadioButton();
        radDecode = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compressor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        Button1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Button1.setText("Choose File");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No file selected");

        Button2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Button2.setText("Encrypt / Decrypt");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        buttonGroup1.add(radEncode);
        radEncode.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        radEncode.setText("Encode");
        radEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEncodeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radDecode);
        radDecode.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        radDecode.setText("Decode");
        radDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDecodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(radEncode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(radDecode)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radEncode)
                    .addComponent(radDecode))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Button1)
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1)
                    .addComponent(jLabel1))
                .addGap(66, 66, 66)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>                        

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(evt.getSource() == Button1){
            JFileChooser fileChooser = new JFileChooser();
			if(radDecode.isSelected()){
                            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                            int response = fileChooser.showOpenDialog(null);

                            if(response == JFileChooser.APPROVE_OPTION) {
                                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                                    System.out.println(file);
                                    jLabel1.setText(file.getName());
                                    userFile = file.getAbsolutePath();
                                    userFileName = file.getName();
                            }
                        }
                        
                        else if(radEncode.isSelected()){
                            int response = fileChooser.showOpenDialog(null);
                            if(response == JFileChooser.APPROVE_OPTION) {
                                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                                    System.out.println(file);
                                    jLabel1.setText(file.getName());
                                    userFile = file.getAbsolutePath();
                            }
                        }
                        
                        else{
                            jLabel1.setText("Select Mode");
                        }
			
        }
    }

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(evt.getSource() == Button2){
            JFileChooser fileChooser = new JFileChooser();

			int response = fileChooser.showSaveDialog(null);
			
                        File file = fileChooser.getSelectedFile();
                        
                        try{
                            if(radEncode.isSelected()){
                                new HuffmanEncoder(userFile, file.getAbsolutePath(), file.getName());
                                jLabel2.setIcon(imgCheck);
                            }
                            else if (radDecode.isSelected()){
                                new HuffmanDecoder(userFile, userFileName, file.getAbsolutePath());
                            }
                            else{
                                jLabel2.setIcon(imgError);
                            }

                        }
                        catch(IOException e){
                            System.out.print(e);
                            jLabel2.setIcon(imgError);
                        }}
    }                                       

    private void radEncodeActionPerformed(java.awt.event.ActionEvent evt) {
        Button2.setText("Encrypt");
    }                                         

    private void radDecodeActionPerformed(java.awt.event.ActionEvent evt) {
        Button2.setText("Decrypt");
    }                                         

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radDecode;
    private javax.swing.JRadioButton radEncode;

}
