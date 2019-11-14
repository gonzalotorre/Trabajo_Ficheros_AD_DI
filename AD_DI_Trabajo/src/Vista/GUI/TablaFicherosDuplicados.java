/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.GUI;

import Vista.GUI.TableModel.FicheroTableModel;
import Vista.Logica.LogicaFichero;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gonzalo
 */
public class TablaFicherosDuplicados extends javax.swing.JDialog {

    /**
     * Creates new form TablaFicherosDuplicados
     */
    public TablaFicherosDuplicados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTableFicherosDuplicados.setModel(new FicheroTableModel(LogicaFichero.getListaFicheros()));
        iniciarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFicherosDuplicados = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Cerrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        jTableFicherosDuplicados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTableFicherosDuplicados);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 0, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Lista Ficheros Duplicados");
        getContentPane().add(jLabelTitulo, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        limpiarTabla();
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * 
     */
    private void iniciarTabla() {
        FicheroTableModel ftm = new FicheroTableModel(LogicaFichero.getListaFicheros());
        jTableFicherosDuplicados.setModel(ftm);
        //Para poder ordenar la tabla
        TableRowSorter<FicheroTableModel> sorter = new TableRowSorter<>(ftm);
        jTableFicherosDuplicados.setRowSorter(sorter);
    }
    
    /**
     * 
     */
    private void limpiarTabla() {
        for (int i = 0; i < jTableFicherosDuplicados.getRowCount(); i++) {
            FicheroTableModel ctm = (FicheroTableModel) jTableFicherosDuplicados.getModel();
            ctm.deleteRow(i);
            i--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFicherosDuplicados;
    // End of variables declaration//GEN-END:variables
}
