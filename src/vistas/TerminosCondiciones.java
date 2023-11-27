package vistas;

import javax.swing.JOptionPane;

public class TerminosCondiciones extends javax.swing.JFrame {


    public TerminosCondiciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        checkAcepto = new javax.swing.JCheckBox();
        checkNoAcepto = new javax.swing.JCheckBox();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Acepta que por la presente su informacion personal, asi como su\nalma, espiritu, vida, compromiso y todo su ser le pertenecen a la\nempresa.\nAl hacerle presente el contrato queda suscrito de por vida, a menos\nque solicite cerrar su cuenta, lo cual debe de ser revisado y solicitado\ncon una cita de previo aviso.\nCon el presente contrato aceptar poner una calificacion del 100% a\nlos desarrolladores que crearon el programa sin importar si el mismo\nno tiene todos los requisitos dados por el profesor dado de la\nmateria de programacion orientada a eventos.");
        jScrollPane1.setViewportView(jTextArea1);

        buttonGroup1.add(checkAcepto);
        checkAcepto.setText("Acepto que lei todo");
        checkAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAceptoActionPerformed(evt);
            }
        });

        buttonGroup1.add(checkNoAcepto);
        checkNoAcepto.setText("No acepto");
        checkNoAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoAceptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkAcepto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkNoAcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAcepto)
                    .addComponent(checkNoAcepto))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private boolean terminosAceptados = false;
//aqui tengo que hacer que cambie esta opcion despues de validar que la opcion haya cambiado
    
    private void checkNoAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoAceptoActionPerformed
        // TODO add your handling code here:
        if (checkNoAcepto.isSelected()){
        JOptionPane.showMessageDialog(this, "Por favor, acepta los términos y condiciones.",
        "Advertencia", JOptionPane.WARNING_MESSAGE);
        terminosAceptados = false;
        }
        System.out.println("No se aceptaron los terminos y condiciones");
    }//GEN-LAST:event_checkNoAceptoActionPerformed

    private void checkAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAceptoActionPerformed
        // TODO add your handling code here:
        if(checkAcepto.isSelected()){
        JOptionPane.showMessageDialog(this, "Gracias por aceptar.");
        terminosAceptados = true;
        }
        System.out.println("Se aceptaron los terminos y condiciones");
    }//GEN-LAST:event_checkAceptoActionPerformed

    public boolean areTerminosAceptados() {
    return terminosAceptados;
}
    
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
            java.util.logging.Logger.getLogger(TerminosCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminosCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminosCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminosCondiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminosCondiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkAcepto;
    private javax.swing.JCheckBox checkNoAcepto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}