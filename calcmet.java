package calc2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calcmet extends JFrame {
    //variaveis para calcular
    char op;   
    double n1=0,n2=0,resultado=0;
    //paineis
    JPanel textos = new JPanel();
    JPanel botoes = new JPanel();//painel para os botoes
    //botoes
    JButton adicao=new JButton("+");
    JButton subtracao=new JButton("-");
    JButton divisao=new JButton("/");
    JButton multiplicacao=new JButton("X");
    JButton igual= new JButton("=");
    JTextField texto1 = new JTextField();
    //duas fontes 
    Font fonte = new Font("Courier New",Font.ITALIC | Font.BOLD,35);
    Font fonte2 = new Font("Courier New",Font.ITALIC | Font.BOLD,25);
    


        public calcmet(){

            texto1.setFont(fonte);
            texto1.setBounds(25, 25, 340, 50);
            botoes.setBounds(25, 100, 340, 75);
            botoes.setLayout(new GridLayout(2,2,5,5));
            //as funções
            adicao.setFont(fonte2);
            subtracao.setFont(fonte2);
            divisao.setFont(fonte2);       
            multiplicacao.setFont(fonte2); 
            igual.setFont(fonte2);
            igual.setBounds(120, 180, 150, 40);
            //adicaoo dos botoes na janela
            add(texto1);
            add(botoes);
            botoes.add(adicao);
            botoes.add(subtracao);    
            botoes.add(divisao);         
            botoes.add(multiplicacao);
            add(igual);
            //parametros da janela princpal
            setLayout(null);
            setTitle("Calculadora");
            setSize(400, 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
            //adição das funções dos botões
            adicao.addActionListener(this::soma);
            subtracao.addActionListener(this::subtracao);
            divisao.addActionListener(this::divide);
            multiplicacao.addActionListener(this::multiplica);
            igual.addActionListener(this::igual);
        }

        public void soma(ActionEvent e){
            n1 = Double.parseDouble(texto1.getText());
            op='+';
            texto1.setText("");       
        }

        public void subtracao(ActionEvent e){
            n1 = Double.parseDouble(texto1.getText());
            op='-';
            texto1.setText("");      
        }
        public void multiplica(ActionEvent e){
            n1 = Double.parseDouble(texto1.getText());
            op='x';
            texto1.setText("");         
        }
        public void divide(ActionEvent e){
            n1 = Double.parseDouble(texto1.getText());
            texto1.setText("");
            op='/';          
        }

        public void igual(ActionEvent e){

        n2= Double.parseDouble(texto1.getText());
        
        switch(op){

            case '+': 
                resultado=n1+n2;
                break;
            case'-':
                resultado=n1-n2;
                break;
            case 'x':
                resultado=n1*n2;
                break;
            case'/':
                resultado=n1/n2;
            break;
        }
            texto1.setText(String.valueOf(resultado));
            resultado=0;
        }


        public static void main(String[] args) {
            
            new calcmet();
        }

    
}
