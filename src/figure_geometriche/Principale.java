/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure_geometriche;

import javax.swing.JOptionPane;

/**
 *
 * @author Maurizio
 */
public class Principale extends javax.swing.JFrame {

    public static String PATH = "";
    public static int SCELTA;
    public Principale() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuforme = new javax.swing.JMenu();
        Item_quadrato = new javax.swing.JMenuItem();
        Item_rettangolo = new javax.swing.JMenuItem();
        Item_cerchio = new javax.swing.JMenuItem();
        Item_sfera = new javax.swing.JMenuItem();
        Menuaiuto = new javax.swing.JMenu();
        Item_aiuto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figure_geometriche/Principale.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -40, 760, 420));

        Menuforme.setText("Forme Geometriche");
        Menuforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuformeActionPerformed(evt);
            }
        });

        Item_quadrato.setText("Quadrato");
        Item_quadrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_quadratoActionPerformed(evt);
            }
        });
        Menuforme.add(Item_quadrato);

        Item_rettangolo.setText("Rettangolo");
        Item_rettangolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_rettangoloActionPerformed(evt);
            }
        });
        Menuforme.add(Item_rettangolo);

        Item_cerchio.setText("Circonferenza");
        Item_cerchio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_cerchioActionPerformed(evt);
            }
        });
        Menuforme.add(Item_cerchio);

        Item_sfera.setText("Sfera");
        Item_sfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_sferaActionPerformed(evt);
            }
        });
        Menuforme.add(Item_sfera);

        jMenuBar1.add(Menuforme);

        Menuaiuto.setText("Aiuto");

        Item_aiuto.setText("Informazioni");
        Item_aiuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_aiutoActionPerformed(evt);
            }
        });
        Menuaiuto.add(Item_aiuto);

        jMenuBar1.add(Menuaiuto);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Item_rettangoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_rettangoloActionPerformed
       Rettangolo r=new Rettangolo();
    }//GEN-LAST:event_Item_rettangoloActionPerformed

    private void Item_aiutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_aiutoActionPerformed
       
       JOptionPane.showMessageDialog(null, "Applicazione JAVA sviluppata da DOPPIA3MME\nSelezionando una figura geometrica potrai\nvedere tutti i dati  ", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_Item_aiutoActionPerformed

    private void Item_quadratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_quadratoActionPerformed
       //una nuova istanza la metto in q
        Quadrato q=new Quadrato();
    }//GEN-LAST:event_Item_quadratoActionPerformed

    private void MenuformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuformeActionPerformed
     
       
    }//GEN-LAST:event_MenuformeActionPerformed

    private void Item_cerchioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_cerchioActionPerformed
         Circonferenza c=new Circonferenza();
    }//GEN-LAST:event_Item_cerchioActionPerformed

    private void Item_sferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_sferaActionPerformed
        Sfera s=new Sfera();
    }//GEN-LAST:event_Item_sferaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Item_aiuto;
    private javax.swing.JMenuItem Item_cerchio;
    private javax.swing.JMenuItem Item_quadrato;
    private javax.swing.JMenuItem Item_rettangolo;
    private javax.swing.JMenuItem Item_sfera;
    private javax.swing.JMenu Menuaiuto;
    private javax.swing.JMenu Menuforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
