
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.Color;

public class complexos extends JFrame implements ActionListener, ItemListener{
    JButton botao1, botao2, botao3, botao4, botao5,botao6, botao7, botao8, botao9, botao0, bEnter, bMais, bMenos, bMulti, bDiv, bC, bPonto, bSinal, bSpace;
    JRadioButtonMenuItem rpn, complexos;
    JMenuBar menuBar; JMenu menu;
    ButtonGroup group;
    JTextField visor;

    ComplexNumber complex1;
    ComplexNumber complex2;
    ComplexNumber complex3;
    
    String primeiro = "";
    int cont = 0, i =1;
    boolean sinal = true;
    float[] real = new float[4];
    float[] imaginario = new float[4];

    
      
    public complexos(){
        super("Calculadora de Números Complexos");
        this.setSize(395,550);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        visor = new JTextField();
        visor.setBounds(60,10,275,40);
        this.add(visor);  

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        menu = new JMenu ("Menu");
        menuBar.add(menu);

        group = new ButtonGroup();
        rpn = new JRadioButtonMenuItem("Calculadora RPN");
        menu.add(rpn);
        group.add(rpn);
        rpn.addItemListener(this);

        complexos = new JRadioButtonMenuItem("Complexos");
        complexos.setSelected(true);
        complexos.setSelected(true);
        menu.add(complexos);
        group.add(complexos);
        complexos.addItemListener(this);

        String textoExp = "Digite números complexos assim: \n5.47 Espaço 1.78 ENTER \n (5.47 -> real 1.78->imaginario)";
		JTextPane painelComp = new JTextPane();
		painelComp.setText(textoExp);
		painelComp.setEnabled(false);
        painelComp.setDisabledTextColor(Color.DARK_GRAY);
        painelComp.setBounds(60,415,275,50);
		
        this.add(painelComp);

        botao1 = new JButton("1");
        botao1.setBounds(60,130,65,65);
        botao1.addActionListener(this);
        this.add(botao1);

        botao2 = new JButton("2");
        botao2.setBounds(130,130,65,65);
        botao2.addActionListener(this);
        this.add(botao2);
        
        botao3 = new JButton("3");
        botao3.setBounds(200,130,65,65);
        botao3.addActionListener(this);
        this.add(botao3);
 
        botao4 = new JButton("4");
        botao4.setBounds(60,200,65,65);
        botao4.addActionListener(this);
        this.add(botao4);

        botao5 = new JButton("5");
        botao5.setBounds(130,200,65,65);
        botao5.addActionListener(this);
        this.add(botao5);

        botao6 = new JButton("6");
        botao6.setBounds(200,200,65,65);
        botao6.addActionListener(this);
        this.add(botao6);

        botao7 = new JButton("7");
        botao7.setBounds(60,270,65,65);
        botao7.addActionListener(this);
        this.add(botao7);

        botao8 = new JButton("8");
        botao8.setBounds(130,270,65,65);
        botao8.addActionListener(this);
        this.add(botao8);

        botao9 = new JButton("9");
        botao9.setBounds(200,270,65,65);
        botao9.addActionListener(this);
        this.add(botao9);

        botao0 = new JButton("0");
        botao0.setBounds(130,340,65,65);
        botao0.addActionListener(this);
        this.add(botao0);

        bPonto = new JButton(".");
        bPonto.setBounds(200,340,65,65);
        bPonto.addActionListener(this);
        this.add(bPonto);

        bSpace = new JButton("Espaço");
        bSpace.setBounds(270,270,65,65);
        bSpace.addActionListener(this);
        this.add(bSpace);

        bEnter = new JButton("Enter");
        bEnter.setBounds(270,340,65,65);
        bEnter.addActionListener(this);
        this.add(bEnter);

        bMenos = new JButton("-");
        bMenos.setBounds(270,200,65,65);
        bMenos.addActionListener(this);
        this.add(bMenos);

        bMais = new JButton("+");
        bMais.setBounds(270,130,65,65);
        bMais.addActionListener(this);
        this.add(bMais);

        bMulti = new JButton("*");
        bMulti.setBounds(200,60,65,65);
        bMulti.addActionListener(this);
        this.add(bMulti);

        bDiv = new JButton("/");
        bDiv.setBounds(270,60,65,65);
        bDiv.addActionListener(this);
        this.add(bDiv);

        bC = new JButton("C");
        bC.setBounds(60,60,135,65);
        bC.addActionListener(this);
        this.add(bC);

        bSinal = new JButton("+/-");
        bSinal.setBounds(60,340,65,65);
        bSinal.addActionListener(this);
        this.add(bSinal);


        this.setVisible(true);

    }
    @Override
    public void itemStateChanged(ItemEvent e){
        JRadioButtonMenuItem EventSource = (JRadioButtonMenuItem) e.getSource();
        if (EventSource.isSelected()==true){ 
            this.setVisible(false);
            new Calculadora2();
        }   
    }   
    @Override    
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource()==botao1){
            String n = "1";
            primeiro = primeiro + n;
            visor.setText(primeiro);
        } else if (e.getSource()==botao2) {
            String n = "2";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao3) {
            String n = "3";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao4) {
            String n = "4";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao5) {
            String n = "5";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao6) {
            String n = "6";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao7) {
            String n = "7";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao8) {
            String n = "8";
            primeiro = primeiro + n;
            visor.setText(primeiro);

        } else if (e.getSource()==botao9) {
            String n = "9";
            primeiro = primeiro + n;
            visor.setText(primeiro);
            
        } else if (e.getSource()==botao0) {
            String n = "0";
            primeiro = primeiro + n;
            visor.setText(primeiro);
        
        } else if (e.getSource()==bSinal) {
            String n = "-";
            primeiro = primeiro + n;
            visor.setText(primeiro);

        } else if (e.getSource()==bSpace) {
            String n = visor.getText();
            float num =  Float.parseFloat(n);
            primeiro = "";
            real[cont] = num;
            visor.setText(" ");
            
        } else if (e.getSource()==bPonto) {
            String n = ".";
            primeiro = primeiro + n;
            visor.setText(primeiro);     
            

        } else if (e.getSource()==bMenos) {
            complex3 = complex1.subtract(complex2);
			visor.setText(complex3.toString());
            complex1 = new ComplexNumber(0,0);
            complex2 = new ComplexNumber(0,0);

        } else if (e.getSource()==bMais) {
            complex3 = complex1.add(complex2);
			visor.setText(complex3.toString());
            complex1 = new ComplexNumber(0,0);
            complex2 = new ComplexNumber(0,0);

        } else if (e.getSource()==bMulti) {
            complex3 = complex1.multiply(complex2);
			visor.setText(complex3.toString());
            complex1 = new ComplexNumber(0,0);
            complex2 = new ComplexNumber(0,0);

        } else if (e.getSource()==bDiv) {
            complex3 = complex1.divide(complex2);
			visor.setText(complex3.toString());
            complex1 = new ComplexNumber(0,0);
            complex2 = new ComplexNumber(0,0);

        } else if (e.getSource()==bC) {
            visor.setText("");
            primeiro = "";
            cont = 0;
            complex1 = new ComplexNumber(0,0);
            complex2 = new ComplexNumber(0,0);
            complex3 = new ComplexNumber(0,0);

        } else if (e.getSource()==bEnter) {
            String n = visor.getText();
            float num =  Float.parseFloat(n);
            imaginario[cont] = num;
            primeiro = "";
            visor.setText("");
            if (cont == 0){
                System.out.println(real[0]);
                System.out.println(imaginario[0]);
                complex1 = new ComplexNumber(real[cont], imaginario[cont]);
                visor.setText(""); cont++;
            } else{
                System.out.println(real[1]);
                System.out.println(imaginario[1]);
                complex2 = new ComplexNumber(real[cont], imaginario[cont]);
                visor.setText("");
            }
        }
    }
}



//complex number swing calculator?









