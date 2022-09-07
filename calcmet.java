package calc2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calcmet extends JFrame {


    JButton adicao=new JButton("+");
    JButton subtracao=new JButton("-");
    JButton divisao=new JButton("/");
    JButton multiplicacao=new JButton("X");

    JTextField texto1 = new JTextField("    primeiro numero  ");
    JTextField texto2 = new JTextField("    segundo numero   ");
    JTextField texto3 = new JTextField("       Resultado     ");
 
    Font fonte = new Font("Courier New",Font.ITALIC | Font.BOLD,20);
    Font fonte2 = new Font("Courier New",Font.ITALIC | Font.BOLD,50);
    


        public calcmet(){

            texto1.setFont(fonte);
            texto1.setHorizontalAlignment(JTextField.CENTER);
            texto2.setFont(fonte);
            texto2.setHorizontalAlignment(JTextField.CENTER);
            texto3.setFont(fonte);
            texto3.setHorizontalAlignment(JTextField.CENTER);
          
            //as funções
            adicao.setFont(fonte2);
            subtracao.setFont(fonte2);
            divisao.setFont(fonte2);       
            multiplicacao.setFont(fonte2); 

            //adicaoo dos botoes na janela
            add(texto1);
            add(texto2);
            add(texto3);
            add(adicao);
            add(subtracao);    
            add(divisao);         
            add(multiplicacao);

            setLayout(new FlowLayout());
            //setLayout(new GridLayout(5,6));
            setTitle("Calculadora");
            setSize(300, 220);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
            
            adicao.addActionListener(this::soma);
            subtracao.addActionListener(this::subtracao);
            divisao.addActionListener(this::divide);
            multiplicacao.addActionListener(this::multiplica);
        }

    
        public void soma(ActionEvent e){

            int n1 = Integer.parseInt(texto1.getText());
            int n2=Integer.parseInt(texto2.getText());
            int soma=n1+n2;
            texto3.setText(soma+"");

        }

        public void subtracao(ActionEvent e){

            int n1 = Integer.parseInt(texto1.getText());
            int n2=Integer.parseInt(texto2.getText());
            int sub=n1-n2;
            texto3.setText(sub+"");

        }
        public void multiplica(ActionEvent e){

            int n1 = Integer.parseInt(texto1.getText());
            int n2= Integer.parseInt(texto2.getText());
            int mult=n1*n2;
            texto3.setText(mult+"");

        }
        public void divide(ActionEvent e){

            int n1 = Integer.parseInt(texto1.getText());
            int n2= Integer.parseInt(texto2.getText());
            int div=n1/n2;
            texto3.setText(div+"");

        }

        public static void main(String[] args) {
            
            new calcmet();
        }

    
}
