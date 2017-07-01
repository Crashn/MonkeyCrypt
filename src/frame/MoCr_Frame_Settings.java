/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import crypt.Alphabet;
/**
 *
 * @author Jonas
 */
public class MoCr_Frame_Settings extends javax.swing.JFrame {

    MoCr_Frame localFrame;
    public Alphabet localAlphabet;
   
    /**
     * Creates new form MoCr_Frame_Settings
     */
    public MoCr_Frame_Settings(MoCr_Frame f) {
        localFrame = f;
        localAlphabet = Alphabet.getInstance();
        initComponents();
    }
    
    public void renew() {
        this.setVisible(true);
        MoCr_SettingsFrame_AlphabetField.setText(localAlphabet.getAlphabet());
    }
    
    public void changeResizability(boolean s) {
        localFrame.setResizable(s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoCr_SettingsFrame_Heading1 = new javax.swing.JLabel();
        MoCr_SettingsFrame_AlphabetField = new javax.swing.JTextField();
        MoCr_SettingsFrame_Checkbox = new javax.swing.JCheckBox();
        MoCr_SettingsFrame_Validation = new javax.swing.JButton();
        MoCr_SettingsFrame_ResetButton = new javax.swing.JButton();
        MoCr_SettingsFrame_ClearBox = new javax.swing.JComboBox<>();
        MoCr_SettingsFrame_ClearButton = new javax.swing.JButton();

        setTitle("Einstellungen");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        MoCr_SettingsFrame_Heading1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        MoCr_SettingsFrame_Heading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoCr_SettingsFrame_Heading1.setText("Alphabet ändern");

        MoCr_SettingsFrame_AlphabetField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        MoCr_SettingsFrame_AlphabetField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MoCr_SettingsFrame_AlphabetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_SettingsFrame_AlphabetFieldActionPerformed(evt);
            }
        });

        MoCr_SettingsFrame_Checkbox.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_SettingsFrame_Checkbox.setText("Vergrößerbarkeit des Hauptfensters aktiviert");

        MoCr_SettingsFrame_Validation.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_SettingsFrame_Validation.setText("Änderungen speichern");
        MoCr_SettingsFrame_Validation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_SettingsFrame_ValidationActionPerformed(evt);
            }
        });

        MoCr_SettingsFrame_ResetButton.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_SettingsFrame_ResetButton.setText("Standardalphabet wiederherstellen");
        MoCr_SettingsFrame_ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_SettingsFrame_ResetButtonActionPerformed(evt);
            }
        });

        MoCr_SettingsFrame_ClearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alle Felder leeren", "Lokale Felder leeren", "Alle Schlüsselfelder leeren", "Ein- und Ausgabefelder leeren" }));

        MoCr_SettingsFrame_ClearButton.setText("Bestätigen");
        MoCr_SettingsFrame_ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_SettingsFrame_ClearButtonActionPerformed(evt);
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
                        .addComponent(MoCr_SettingsFrame_ClearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoCr_SettingsFrame_ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MoCr_SettingsFrame_Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_Heading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_AlphabetField)
                    .addComponent(MoCr_SettingsFrame_Validation, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_SettingsFrame_Heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_SettingsFrame_AlphabetField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoCr_SettingsFrame_ResetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoCr_SettingsFrame_Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoCr_SettingsFrame_ClearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoCr_SettingsFrame_ClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MoCr_SettingsFrame_Validation)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoCr_SettingsFrame_ValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_SettingsFrame_ValidationActionPerformed
        // TODO add your handling code here:
        changeResizability(MoCr_SettingsFrame_Checkbox.isSelected());
        localAlphabet.setAlphabet(MoCr_SettingsFrame_AlphabetField.getText());
        this.setVisible(false);
    }//GEN-LAST:event_MoCr_SettingsFrame_ValidationActionPerformed

    private void MoCr_SettingsFrame_AlphabetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_SettingsFrame_AlphabetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoCr_SettingsFrame_AlphabetFieldActionPerformed

    private void MoCr_SettingsFrame_ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_SettingsFrame_ResetButtonActionPerformed
        // TODO add your handling code here:
        MoCr_SettingsFrame_AlphabetField.setText("abcdefghijklmnopqrstuvwxyz");
    }//GEN-LAST:event_MoCr_SettingsFrame_ResetButtonActionPerformed

    private void MoCr_SettingsFrame_ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_SettingsFrame_ClearButtonActionPerformed
        // TODO add your handling code here:
        int d = MoCr_SettingsFrame_ClearBox.getSelectedIndex();
        switch(d) {
            case 0: localFrame.clearAll(); break;
            case 1: localFrame.clearLocal(); break;
            case 2: localFrame.clearKeys(); break;
            case 3: localFrame.clearIO(); break;
        }
    }//GEN-LAST:event_MoCr_SettingsFrame_ClearButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoCr_SettingsFrame_AlphabetField;
    private javax.swing.JCheckBox MoCr_SettingsFrame_Checkbox;
    private javax.swing.JComboBox<String> MoCr_SettingsFrame_ClearBox;
    private javax.swing.JButton MoCr_SettingsFrame_ClearButton;
    private javax.swing.JLabel MoCr_SettingsFrame_Heading1;
    private javax.swing.JButton MoCr_SettingsFrame_ResetButton;
    private javax.swing.JButton MoCr_SettingsFrame_Validation;
    // End of variables declaration//GEN-END:variables
}
