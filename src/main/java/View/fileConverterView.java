/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Converter.DATTConverter;
import Converter.PDTBConverter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Murathan
 */
public class fileConverterView extends javax.swing.JFrame {

    boolean pdtb = false;
    boolean datt = false;
    boolean dattAnnotationSelected = false;
    boolean PDTBAnnotationSelected = false;
    boolean PDTBTextSelected = false;
    String outputFileName = "";

    String dir = "";

    /**
     * Creates new form fileChooser
     */
    public fileConverterView() {
        initComponents();
    }

    public File getCurrentDirectory() {
        ProtectionDomain pd = fileConverterView.class.getProtectionDomain();
        CodeSource cs = pd.getCodeSource();
        URL location = cs.getLocation();
        File initialFile = null;
        try {
            initialFile = new File(location.toURI());
        } catch (Exception e) {
        }
        return initialFile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        FileChooserToConvert = new javax.swing.JFileChooser(getCurrentDirectory());
        RadioButtonDATT = new javax.swing.JRadioButton();
        RadioButtonPDTB = new javax.swing.JRadioButton();
        TextField_annotation = new javax.swing.JTextField();
        TextField_text = new javax.swing.JTextField();
        Button_ChooseAnnotationFile = new javax.swing.JButton();
        Button_ChooseTextFile = new javax.swing.JButton();
        Button_run = new javax.swing.JButton();
        textFieldNameDLVTFile = new javax.swing.JTextField();

        FileChooserToConvert.setMinimumSize(new java.awt.Dimension(590, 400));
        FileChooserToConvert.setFileSelectionMode(FileChooserToConvert.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert and Run");

        RadioButtonDATT.setText("DATT");
        buttonGroup.add(RadioButtonDATT);
        RadioButtonDATT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonDATTActionPerformed(evt);
            }
        });

        RadioButtonPDTB.setText("PDTB");
        buttonGroup.add(RadioButtonPDTB);
        RadioButtonPDTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonPDTBActionPerformed(evt);
            }
        });

        Button_ChooseAnnotationFile.setText("Choose Annotation Files");
        Button_ChooseAnnotationFile.setEnabled(false);
        Button_ChooseAnnotationFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ChooseAnnotationFileActionPerformed(evt);
            }
        });

        Button_ChooseTextFile.setText("Choose Text Files");
        Button_ChooseTextFile.setEnabled(false);
        Button_ChooseTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ChooseTextFileActionPerformed(evt);
            }
        });

        Button_run.setText("RUN");
        Button_run.setEnabled(false);
        Button_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_runActionPerformed(evt);
            }
        });

        textFieldNameDLVTFile.setText("jTextField1");
        textFieldNameDLVTFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNameDLVTFileMouseClicked(evt);
            }
        });
        textFieldNameDLVTFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldNameDLVTFileKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 166, Short.MAX_VALUE)
                        .addComponent(RadioButtonDATT)
                        .addGap(33, 33, 33)
                        .addComponent(RadioButtonPDTB)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldNameDLVTFile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_annotation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_ChooseAnnotationFile)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Button_ChooseTextFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Button_run)))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_annotation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_ChooseAnnotationFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_ChooseTextFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNameDLVTFile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonPDTB)
                    .addComponent(RadioButtonDATT)
                    .addComponent(Button_run))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ChooseAnnotationFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ChooseAnnotationFileActionPerformed
        // TODO add your handling code here:
        int status = FileChooserToConvert.showOpenDialog(null);

        if (status == FileChooserToConvert.APPROVE_OPTION) {
            File selectedFile = FileChooserToConvert.getSelectedFile();
            TextField_annotation.setText(selectedFile.getAbsolutePath());
            if (!TextField_annotation.getText().equals("") && RadioButtonDATT.isSelected()) {
                dattAnnotationSelected = true;
            }
            if (!TextField_annotation.getText().equals("") && RadioButtonPDTB.isSelected()) {
                PDTBAnnotationSelected = true;
            }

            System.out.println("n: " + selectedFile.getAbsolutePath() + " " + PDTBTextSelected + " " + PDTBAnnotationSelected);
        } else if (status == FileChooserToConvert.CANCEL_OPTION) {
            System.out.println("canceled");
        }

    }//GEN-LAST:event_Button_ChooseAnnotationFileActionPerformed
    
  
    
    private void RadioButtonPDTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPDTBActionPerformed
        // TODO add your handling code here:
        Button_ChooseTextFile.setVisible(true);
        TextField_text.setVisible(true);
        Button_ChooseAnnotationFile.setEnabled(true);
        Button_ChooseTextFile.setEnabled(true);
    }//GEN-LAST:event_RadioButtonPDTBActionPerformed

    private void RadioButtonDATTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonDATTActionPerformed
        // TODO add your handling code here:
        Button_ChooseTextFile.setVisible(false);
        TextField_text.setVisible(false);
        Button_ChooseAnnotationFile.setEnabled(true);
        // Button_ChooseTextFile.setEnabled(true);

    }//GEN-LAST:event_RadioButtonDATTActionPerformed

    private void Button_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_runActionPerformed
        // TODO add your handling code here:

        if (RadioButtonDATT.isSelected()) {
            try {
                System.out.println("Selected::: " + TextField_annotation.getText());
                DATTConverter converterDATT = new DATTConverter(TextField_annotation.getText(), outputFileName);
                dir = converterDATT.getOutputDir();

            } catch (ParserConfigurationException | SAXException | IOException ex) {
                Logger.getLogger(fileConverterView.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (RadioButtonPDTB.isSelected()) {

            try {
                PDTBConverter converterPDTB = new PDTBConverter(TextField_annotation.getText(), TextField_text.getText(), outputFileName);
                dir = converterPDTB.getOutputDir();
            } catch (IOException ex) {
                Logger.getLogger(fileConverterView.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        this.dispose();
        try {
            new MainWindow(dir).setVisible(true);
        } catch (IOException | SAXException | ParserConfigurationException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "COULD NOT BE CONVERTED!!");
        }
    }//GEN-LAST:event_Button_runActionPerformed

    private void Button_ChooseTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ChooseTextFileActionPerformed
        // TODO add your handling code here:
                                                
        int status = FileChooserToConvert.showOpenDialog(null);

        if (status == FileChooserToConvert.APPROVE_OPTION) {
            File selectedFile = FileChooserToConvert.getSelectedFile();
            TextField_text.setText(selectedFile.getAbsolutePath());
			
            if (!TextField_text.getText().equals("") && RadioButtonPDTB.isSelected()) {
                PDTBTextSelected = true;
            }
			
            System.out.println("n: " + selectedFile.getAbsolutePath() + " " + PDTBTextSelected + " " + PDTBAnnotationSelected);
        } else if (status == FileChooserToConvert.CANCEL_OPTION) {
            System.out.println("canceled");
        }
    }//GEN-LAST:event_Button_ChooseTextFileActionPerformed

    private void textFieldNameDLVTFileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNameDLVTFileKeyPressed
        // TODO add your handling code here:

        if (!(evt.getKeyChar() == 27 || evt.getKeyChar() == 65535) && !textFieldNameDLVTFile.getText().equals("")
                && dattAnnotationSelected && RadioButtonDATT.isSelected()) {
            outputFileName = textFieldNameDLVTFile.getText();
        } else if (!(evt.getKeyChar() == 27 || evt.getKeyChar() == 65535) && !textFieldNameDLVTFile.getText().equals("")
                && PDTBAnnotationSelected && PDTBTextSelected && RadioButtonPDTB.isSelected()) {
            outputFileName = textFieldNameDLVTFile.getText();
        }
        if (!outputFileName.equals("")) {
            Button_run.setEnabled(true);
        }

    }//GEN-LAST:event_textFieldNameDLVTFileKeyPressed

    private void textFieldNameDLVTFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNameDLVTFileMouseClicked
        // TODO add your handling code here:
        textFieldNameDLVTFile.setText("");
    }//GEN-LAST:event_textFieldNameDLVTFileMouseClicked

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
            java.util.logging.Logger.getLogger(fileConverterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fileConverterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fileConverterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fileConverterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fileConverterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_ChooseAnnotationFile;
    private javax.swing.JButton Button_ChooseTextFile;
    private javax.swing.JButton Button_run;
    private javax.swing.JFileChooser FileChooserToConvert;
    private javax.swing.JRadioButton RadioButtonDATT;
    private javax.swing.JRadioButton RadioButtonPDTB;
    private javax.swing.JTextField TextField_annotation;
    private javax.swing.JTextField TextField_text;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField textFieldNameDLVTFile;
    // End of variables declaration//GEN-END:variables
}
