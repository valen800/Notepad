
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.FileChooserUI;
import javax.swing.undo.UndoManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu54279423k
 */
public class BlocNotas extends javax.swing.JFrame {

    JFileChooser chooser = new JFileChooser();
    JFileChooser chooser2 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    String newFileName;
    UndoManager undoManager;
    
    public BlocNotas() {
        initComponents();
        initMyCode();
    }

    private void initMyCode() {
        undoManager = new UndoManager();
        jTextArea1.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                // TODO Auto-generated method stub
                undoManager.addEdit(e.getEdit());
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonGuardarDown = new javax.swing.JButton();
        jButtonCargarDown = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuExit = new javax.swing.JMenu();
        jMenuItemNuevoArchivo = new javax.swing.JMenuItem();
        jMenuItemAbrirFichero = new javax.swing.JMenuItem();
        jMenuItemGuardarUp = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemCopy = new javax.swing.JMenuItem();
        jMenuItemPaste = new javax.swing.JMenuItem();
        jMenuItemDeshacer = new javax.swing.JMenuItem();
        jMenuItemHacer = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButtonGuardarDown.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/Actions-document-save-icon (1).png")); // NOI18N
        jButtonGuardarDown.setText("Guardar");
        jButtonGuardarDown.setFocusable(false);
        jButtonGuardarDown.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonGuardarDown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGuardarDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarDownActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonGuardarDown);

        jButtonCargarDown.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/Folder-icon.png")); // NOI18N
        jButtonCargarDown.setText("Cargar");
        jButtonCargarDown.setFocusable(false);
        jButtonCargarDown.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCargarDown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCargarDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarDownActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCargarDown);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuExit.setText("Archivo");

        jMenuItemNuevoArchivo.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/Document-Blank-icon.png")); // NOI18N
        jMenuItemNuevoArchivo.setText("Nuevo");
        jMenuItemNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoArchivoActionPerformed(evt);
            }
        });
        jMenuExit.add(jMenuItemNuevoArchivo);

        jMenuItemAbrirFichero.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/Folder-icon.png")); // NOI18N
        jMenuItemAbrirFichero.setText("Abrir fichero");
        jMenuItemAbrirFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirFicheroActionPerformed(evt);
            }
        });
        jMenuExit.add(jMenuItemAbrirFichero);

        jMenuItemGuardarUp.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/Actions-document-save-icon (1).png")); // NOI18N
        jMenuItemGuardarUp.setText("Guardar");
        jMenuExit.add(jMenuItemGuardarUp);
        jMenuExit.add(jSeparator1);

        jMenuItemExit.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/delete-icon.png")); // NOI18N
        jMenuItemExit.setText("Salir");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuExit.add(jMenuItemExit);

        jMenuBar1.add(jMenuExit);

        jMenuEditar.setText("Editar");

        jMenuItemCopy.setText("Copiar");
        jMenuItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopyActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemCopy);

        jMenuItemPaste.setText("Pegar");
        jMenuItemPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPasteActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemPaste);

        jMenuItemDeshacer.setText("Deshacer");
        jMenuItemDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeshacerActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemDeshacer);

        jMenuItemHacer.setText("Hacer");
        jMenuItemHacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHacerActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemHacer);

        jMenuBar1.add(jMenuEditar);

        jMenu3.setText("Ayuda");

        jMenuItemAyuda.setIcon(new javax.swing.ImageIcon("/home/INFORMATICA/alu54279423k/NetBeansProjects/BlocNotas/Actions-help-about-icon.png")); // NOI18N
        jMenuItemAyuda.setText("About");
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAyuda);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarDownActionPerformed
        saveFile();
    }//GEN-LAST:event_jButtonGuardarDownActionPerformed
    
    private void jButtonCargarDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarDownActionPerformed
        openFile();
    }//GEN-LAST:event_jButtonCargarDownActionPerformed
    
    private void jMenuItemNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoArchivoActionPerformed
        saveFile();
    }//GEN-LAST:event_jMenuItemNuevoArchivoActionPerformed

    private void jMenuItemAbrirFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirFicheroActionPerformed
        openFile();
    }//GEN-LAST:event_jMenuItemAbrirFicheroActionPerformed

    private void jMenuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopyActionPerformed
        jTextArea1.copy();
    }//GEN-LAST:event_jMenuItemCopyActionPerformed

    private void jMenuItemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPasteActionPerformed
        jTextArea1.paste();
    }//GEN-LAST:event_jMenuItemPasteActionPerformed

    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "infoBox: This is a infoBox");
    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeshacerActionPerformed
        if (undoManager.canUndo()) {
            undoManager.undo();
        }
    }//GEN-LAST:event_jMenuItemDeshacerActionPerformed

    private void jMenuItemHacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHacerActionPerformed
        if (undoManager.canRedo()) {
            undoManager.redo();
        }
    }//GEN-LAST:event_jMenuItemHacerActionPerformed

    
    public void saveFile() {
        chooser2.setDialogTitle("Specify a file to save");
        int userSelection = chooser2.showSaveDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = chooser2.getSelectedFile();
            try {
                FileWriter wr = new FileWriter(fileToSave);
                wr.write(jTextArea1.getText());
                wr.close();
            } catch (IOException ex) {
                System.out.println("Error reading File");
               
            }
            System.out.println("Save file: " + fileToSave.getAbsolutePath());
        }
    }
    public void openFile() {
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(file));
                String line;
                while((line = in.readLine()) != null) {
                    jTextArea1.setText(jTextArea1.getText() + line + "\n");   
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
                System.exit(1);
            } catch (IOException ex2) {
                System.out.println("Error reading file");
                System.exit(1);
            } finally {
                if(in != null) {
                    try {
                        in.close();
                    } catch (IOException ex3) {
                        System.out.println("Error closing file");
                        System.exit(1);
                    }
                }
            }    
        } else {
            System.out.println("File access cancelled by user.");
        }
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
            java.util.logging.Logger.getLogger(BlocNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlocNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlocNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlocNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlocNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargarDown;
    private javax.swing.JButton jButtonGuardarDown;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenuItem jMenuItemAbrirFichero;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemCopy;
    private javax.swing.JMenuItem jMenuItemDeshacer;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemGuardarUp;
    private javax.swing.JMenuItem jMenuItemHacer;
    private javax.swing.JMenuItem jMenuItemNuevoArchivo;
    private javax.swing.JMenuItem jMenuItemPaste;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
