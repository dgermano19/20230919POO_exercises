/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20230919poo;

import javax.swing.*;

/**
 *
 * @author lab04aluno
 */
public class arrayExibirMedia {
    public static void main(String[] args) {
        String disciplines[] = {"PORT","MAT","CIE","HIST","GEO"};
        int grades[] = {6,2,10,5,7};
        double media=0;
        
        String displayList = "Disciplina\tNota\n\n";
        
        for(int i=0;i< disciplines.length;i++){
            displayList += disciplines[i]+"\t"+grades[i]+"\n";
            media += grades[i];
        }
        
        displayList += "\nMedia:\t"+(media/grades.length);
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(displayList);
        
        JOptionPane.showMessageDialog(null, saidaArea, "BOLETIM DANILO GERMANO - COLEGIO META UNICA",
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
}
