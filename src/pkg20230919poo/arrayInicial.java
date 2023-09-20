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
public class arrayInicial {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        String displayValuesList = "Posição\tValor\n";

        for(int i=0;i< array.length;i++){
            array[i]= Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posicao"+i));
        }

        for(int i=0;i< array.length;i++){
            displayValuesList += i+"\t"+array[i]+"\n";
        }

        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(displayValuesList);

        JOptionPane.showMessageDialog(null, saidaArea, "Lista de valores no array",
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);    
    }
}
