/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20230919poo;

import javax.swing.JOptionPane;

/**
 *
 * @author lab04aluno
 */
public class solucaoWhile {
    public static void main(String[] args) {
        
        String serieFinal ="";
        String quadradoSerie = "";
        int numero;
        int numeroAtual = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro:"));
        
        while(++numeroAtual < numero){
            if((numeroAtual % 2)!=0)
                continue;
            serieFinal += Integer.toString(numeroAtual)+": ";
            quadradoSerie = Double.toString(calculaQuadrado(numeroAtual))+" ";
            serieFinal += quadradoSerie+", ";
        }
            JOptionPane.showMessageDialog(null, serieFinal+"\n");
    }
    static double calculaQuadrado(double x){
        return Math.pow(x, 2);
    }
}
