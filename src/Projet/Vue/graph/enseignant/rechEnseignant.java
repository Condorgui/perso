/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet.Vue.graph.enseignant;

import Projet.Metier.Enseignant;
import Projet.Modele.ClasseModele;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

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
            listEns.addItem(e.getNom() + " "+  e.getPrenom() + " au matricule "+e.getMatricule()+ ", l'adresse mail : " + e.getMail() + " titulaire : " + e.getTitulaire() + " remplacant : " + e.getRemplacant());
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
        jLabel3 = new javax.swing.JLabel();
        listEns = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        Modifier.setText("Modifier");

        setLayout(new java.awt.GridLayout(4, 1));

        jLabel3.setText("Sélectionner l'enseignant parmis la liste");
        add(jLabel3);

        listEns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(listEns);

        jButton1.setText("Modifier");
        add(jButton1);

        Supprimer.setText("Supprimer");
        add(Supprimer);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Supprimer;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> listEns;
    // End of variables declaration//GEN-END:variables
}