/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lofar;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author juan
 */



public class Lofar extends JComponent {

    int sizeCanalX = 0;
    int sizeCanalY;

    int xi, yi, c;
    int inc = 255 / 11;
    String infor;
    int ml[];
    //Graphics g;
    int gn = 0;
    despliegue d = new despliegue();
    //String hw="ESPERANDO... un hola";

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setUndecorated(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lofar lf = new Lofar();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.add(lf);
        window.pack();
        
        LofarGetPropertyValues propiedades = new LofarGetPropertyValues();
		propiedades.getPropValues();
		
        //despliegue d = new despliegue();
        //d.run();
        comInterfaz c = new comInterfaz();
        //despliegue d = new despliegue();
        //c.run(window, d);
        c.run(window);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(481, 481);
    }

    @Override
    protected void paintComponent(Graphics g) {
        gn++;
        System.out.println("paint component ciclo numero: " + gn);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getSize().width, getSize().height);

        sizeCanalX = getSize().width / 101;
        sizeCanalY = ((getSize().height)-100) / 101;
        //despliegue d = new despliegue();
        d.run(g, sizeCanalX, sizeCanalY);

    }
    
    /*public void sethw(String hw){
        this.hw = hw;
    }
    
    public String gethw(){
        return hw;
    }*/
}
