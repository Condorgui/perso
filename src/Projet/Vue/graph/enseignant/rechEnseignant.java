/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet.Vue.graph.enseignant;

import Projet.Metier.Classe;
import Projet.Metier.Enseignant;
import Projet.Modele.ClasseModele;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillaume.Rigaux
 */
public class rechEnseignant extends javax.swing.JPanel {

    /**
     * Creates new form rechEnseignant
     */
    public List<Enseignant> enseignants;

    private ClasseModele cm;

    public void setModele(ClasseModele cm) {

        this.cm = cm;
    }

    public rechEnseignant() {
        initComponents();
        this.setBackground(Color.ORANGE);
    }

    public void initPanel() {

        enseignants = new ArrayList<>(cm.tousEns());

        listEns.removeAllItems();

        enseignants.forEach((e) -> {
            listEns.addItem(e);
        });

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
        jLabel2 = new javax.swing.JLabel();
        Modifier = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        choice1 = new java.awt.Choice();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listEns = new javax.swing.JComboBox<>();
        nvNom = new javax.swing.JLabel();
        nomEns = new javax.swing.JTextField();
        nvPren = new javax.swing.JLabel();
        prenomEns = new javax.swing.JTextField();
        nvMat = new javax.swing.JLabel();
        matEns = new javax.swing.JTextField();
        nvMail = new javax.swing.JLabel();
        mailEns = new javax.swing.JTextField();
        modif = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        Modifier.setText("Modifier");

        jLabel6.setText("jLabel6");

        setLayout(new java.awt.GridLayout(6, 3));

        jLabel3.setText("Sélectionner l'enseignant parmis la liste");
        add(jLabel3);

        listEns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEnsMouseClicked(evt);
            }
        });
        listEns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listEnsActionPerformed(evt);
            }
        });
        add(listEns);

        nvNom.setText("Entrez le nouveau nom : ");
        add(nvNom);

        nomEns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomEnsActionPerformed(evt);
            }
        });
        add(nomEns);

        nvPren.setText("Entrez le nouveau prénom : ");
        add(nvPren);
        add(prenomEns);

        nvMat.setText("Entrez le matricule :");
        add(nvMat);
        add(matEns);

        nvMail.setText("Entrez l'adresse e-mail");
        add(nvMail);
        add(mailEns);

        modif.setText("Modifier");
        modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifActionPerformed(evt);
            }
        });
        add(modif);

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        add(Supprimer);
    }// </editor-fold>//GEN-END:initComponents

    private void listEnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listEnsActionPerformed

    private void listEnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEnsMouseClicked
        initPanel();
    }//GEN-LAST:event_listEnsMouseClicked

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupprimerActionPerformed


    private void modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifActionPerformed

        Object ens = listEns.getSelectedItem();
        Enseignant eRech = cm.getEnseignant((Enseignant) ens);
        Enseignant tmpE = cm.getEnseignant(eRech);
       

        boolean erreur = false;
        boolean erreurmail = false;
        
 
        String nom = nomEns.getText();
        if (nom.trim().equals("")) {
            erreur = true;
            nomEns.setBackground(Color.red);
        }
        String prenom = prenomEns.getText();
        if (prenom.trim().equals("")) {
            erreur = true;
            prenomEns.setBackground(Color.red);
        }
        String mail = mailEns.getText();
        if (mail.trim().equals("")) {
            erreur = true;
            mailEns.setBackground(Color.red);
        } else if (!mail.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,3}$")) {
            erreurmail = true;
            mailEns.setBackground(Color.red);
        }
        String mat = matEns.getText().toUpperCase();
        if (mat.trim().equals("")) {
            erreur = true;
            matEns.setBackground(Color.red);
        }

        if (!erreur && !erreurmail) {

            Enseignant newEns = new Enseignant(mat, nom, prenom, mail);
            //JOptionPane.showMessageDialog(this, newEns, "Résultat", JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(this, e, "Résultat", JOptionPane.INFORMATION_MESSAGE);
            String msg = cm.modifyE(newEns,tmpE);
            JOptionPane.showMessageDialog(this, msg, "Résultat", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (erreur) {
                JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            if (erreurmail) {
                JOptionPane.showMessageDialog(this, "L'adresse mail doit être au format text@domaine.com", "Erreur du mail", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_modifActionPerformed

    private void nomEnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomEnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomEnsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Supprimer;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<Enseignant> listEns;
    private javax.swing.JTextField mailEns;
    private javax.swing.JTextField matEns;
    private javax.swing.JButton modif;
    private javax.swing.JTextField nomEns;
    private javax.swing.JLabel nvMail;
    private javax.swing.JLabel nvMat;
    private javax.swing.JLabel nvNom;
    private javax.swing.JLabel nvPren;
    private javax.swing.JTextField prenomEns;
    // End of variables declaration//GEN-END:variables
}
