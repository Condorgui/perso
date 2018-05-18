/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet.Vue.graph;

import Projet.Modele.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Guillaume.Rigaux
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        this.setBackground(Color.ORANGE);
        ClasseModele cm = ClasseModeleJDBC.getInstance();
        ajoutEnseignant1.setModele(cm);
        ajoutClasse1.setModele(cm);
        affichage3.setModele(cm);
        affichage3.initPanel();
        rechEnseignant1.setModele(cm);
        rechEnseignant1.initPanel();
        rechClasse3.setModele(cm);
        rechClasse3.initPanel();
        ajoutAttrib2.setModele(cm);
        ajoutAttrib2.initPanel();
        rechAttrib5.setModele(cm);
        rechAttrib5.initPanel();
        
        setTitle("Projet Java");


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
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        affichage1 = new Projet.Vue.graph.affichage();
        affichage2 = new Projet.Vue.graph.affichage();
        ajoutAttrib1 = new Projet.Vue.graph.attribution.ajoutAttrib();
        rechAttrib1 = new Projet.Vue.graph.attribution.rechAttrib();
        rechAttrib2 = new Projet.Vue.graph.attribution.rechAttrib();
        rechAttrib3 = new Projet.Vue.graph.attribution.rechAttrib();
        rechAttrib4 = new Projet.Vue.graph.attribution.rechAttrib();
        ajoutAttrib3 = new Projet.Vue.graph.attribution.ajoutAttrib();
        ajoutAttrib4 = new Projet.Vue.graph.attribution.ajoutAttrib();
        accueil = new javax.swing.JPanel();
        panelAccueil1 = new Projet.Vue.graph.panelAccueil();
        jLabel2 = new javax.swing.JLabel();
        boutonentrer = new javax.swing.JButton();
        ajoutEnseignant1 = new Projet.Vue.graph.enseignant.ajoutEnseignant();
        ajoutClasse1 = new Projet.Vue.graph.classe.ajoutClasse();
        affichage3 = new Projet.Vue.graph.affichage();
        rechEnseignant1 = new Projet.Vue.graph.enseignant.rechEnseignant();
        rechClasse3 = new Projet.Vue.graph.classe.rechClasse();
        ajoutAttrib2 = new Projet.Vue.graph.attribution.ajoutAttrib();
        rechAttrib5 = new Projet.Vue.graph.attribution.rechAttrib();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAjout = new javax.swing.JMenu();
        ajoutEnseignant = new javax.swing.JMenuItem();
        ajoutClasse = new javax.swing.JMenuItem();
        ajoutAtt = new javax.swing.JMenuItem();
        MenuModif = new javax.swing.JMenu();
        modifEns = new javax.swing.JMenuItem();
        modifClasse = new javax.swing.JMenuItem();
        modifAtt = new javax.swing.JMenuItem();
        affichage = new javax.swing.JMenu();
        affListe = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        javax.swing.GroupLayout rechAttrib1Layout = new javax.swing.GroupLayout(rechAttrib1);
        rechAttrib1.setLayout(rechAttrib1Layout);
        rechAttrib1Layout.setHorizontalGroup(
            rechAttrib1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rechAttrib1Layout.setVerticalGroup(
            rechAttrib1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rechAttrib2Layout = new javax.swing.GroupLayout(rechAttrib2);
        rechAttrib2.setLayout(rechAttrib2Layout);
        rechAttrib2Layout.setHorizontalGroup(
            rechAttrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rechAttrib2Layout.setVerticalGroup(
            rechAttrib2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().setLayout(new java.awt.CardLayout());

        accueil.setLayout(new java.awt.GridLayout(4, 2, 5, 0));
        accueil.add(panelAccueil1);

        jLabel2.setText("                       Bienvenue sur la page d'accueil du gestionnaire ");
        jLabel2.setMaximumSize(new java.awt.Dimension(15, 16));
        accueil.add(jLabel2);

        boutonentrer.setText("Accéder au gestionnaire");
        boutonentrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonentrerActionPerformed(evt);
            }
        });
        accueil.add(boutonentrer);

        getContentPane().add(accueil, "card4");
        getContentPane().add(ajoutEnseignant1, "card2");
        getContentPane().add(ajoutClasse1, "card3");
        getContentPane().add(affichage3, "card5");
        getContentPane().add(rechEnseignant1, "card6");
        getContentPane().add(rechClasse3, "card7");

        ajoutAttrib2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ajoutAttrib2.setToolTipText("");
        getContentPane().add(ajoutAttrib2, "card8");
        getContentPane().add(rechAttrib5, "card9");

        MenuAjout.setText("Ajout");

        ajoutEnseignant.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone.png")); // NOI18N
        ajoutEnseignant.setText("Enseignant");
        ajoutEnseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutEnseignantActionPerformed(evt);
            }
        });
        MenuAjout.add(ajoutEnseignant);

        ajoutClasse.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone3.png")); // NOI18N
        ajoutClasse.setText("Classe");
        ajoutClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutClasseActionPerformed(evt);
            }
        });
        MenuAjout.add(ajoutClasse);

        ajoutAtt.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone4.png")); // NOI18N
        ajoutAtt.setText("Attributions");
        ajoutAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutAttActionPerformed(evt);
            }
        });
        MenuAjout.add(ajoutAtt);

        jMenuBar1.add(MenuAjout);

        MenuModif.setText("Modifications");

        modifEns.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone2.png")); // NOI18N
        modifEns.setText("Enseignants");
        modifEns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifEnsActionPerformed(evt);
            }
        });
        MenuModif.add(modifEns);

        modifClasse.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone2.png")); // NOI18N
        modifClasse.setText("Classe");
        modifClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifClasseActionPerformed(evt);
            }
        });
        MenuModif.add(modifClasse);

        modifAtt.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone2.png")); // NOI18N
        modifAtt.setText("Attribution");
        modifAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifAttActionPerformed(evt);
            }
        });
        MenuModif.add(modifAtt);

        jMenuBar1.add(MenuModif);

        affichage.setText("Affichages");

        affListe.setIcon(new javax.swing.ImageIcon("C:\\Users\\guill\\Pictures\\icone5.png")); // NOI18N
        affListe.setText("Affichage des listes");
        affListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affListeActionPerformed(evt);
            }
        });
        affichage.add(affListe);

        jMenuBar1.add(affichage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifEnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifEnsActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card6");
        rechEnseignant1.initPanel();
    }//GEN-LAST:event_modifEnsActionPerformed

    private void modifClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifClasseActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card7");
        rechClasse3.initPanel();
    }//GEN-LAST:event_modifClasseActionPerformed

    private void boutonentrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonentrerActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card2");
        JOptionPane.showMessageDialog(this, "Bienvenue", "Résultat", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_boutonentrerActionPerformed

    private void affListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affListeActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card5");
        affichage3.initPanel();
    }//GEN-LAST:event_affListeActionPerformed

    private void ajoutEnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEnseignantActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card2");
    }//GEN-LAST:event_ajoutEnseignantActionPerformed

    private void ajoutClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutClasseActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card3");
    }//GEN-LAST:event_ajoutClasseActionPerformed

    private void ajoutAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutAttActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card8");
         ajoutAttrib2.initPanel();
    }//GEN-LAST:event_ajoutAttActionPerformed

    private void modifAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifAttActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card9");        // TODO add your handling code here:
    }//GEN-LAST:event_modifAttActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FenetrePrincipale().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjout;
    private javax.swing.JMenu MenuModif;
    private javax.swing.JPanel accueil;
    private javax.swing.JMenuItem affListe;
    private javax.swing.JMenu affichage;
    private Projet.Vue.graph.affichage affichage1;
    private Projet.Vue.graph.affichage affichage2;
    private Projet.Vue.graph.affichage affichage3;
    private javax.swing.JMenuItem ajoutAtt;
    private Projet.Vue.graph.attribution.ajoutAttrib ajoutAttrib1;
    private Projet.Vue.graph.attribution.ajoutAttrib ajoutAttrib2;
    private Projet.Vue.graph.attribution.ajoutAttrib ajoutAttrib3;
    private Projet.Vue.graph.attribution.ajoutAttrib ajoutAttrib4;
    private javax.swing.JMenuItem ajoutClasse;
    private Projet.Vue.graph.classe.ajoutClasse ajoutClasse1;
    private javax.swing.JMenuItem ajoutEnseignant;
    private Projet.Vue.graph.enseignant.ajoutEnseignant ajoutEnseignant1;
    private javax.swing.JButton boutonentrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem modifAtt;
    private javax.swing.JMenuItem modifClasse;
    private javax.swing.JMenuItem modifEns;
    private Projet.Vue.graph.panelAccueil panelAccueil1;
    private Projet.Vue.graph.attribution.rechAttrib rechAttrib1;
    private Projet.Vue.graph.attribution.rechAttrib rechAttrib2;
    private Projet.Vue.graph.attribution.rechAttrib rechAttrib3;
    private Projet.Vue.graph.attribution.rechAttrib rechAttrib4;
    private Projet.Vue.graph.attribution.rechAttrib rechAttrib5;
    private Projet.Vue.graph.classe.rechClasse rechClasse3;
    private Projet.Vue.graph.enseignant.rechEnseignant rechEnseignant1;
    // End of variables declaration//GEN-END:variables
}
