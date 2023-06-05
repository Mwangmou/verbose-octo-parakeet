package yingpianxinxiGL;

import javax.swing.*;                 //影片信息管理二级界面(最终版)

import xitongGL.guanliyuanxitong;

import java.awt.Color;
import java.awt.event.*;

public class erjijiemian {
	public erjijiemian(){
   
      JFrame frame =new JFrame();
      ImageIcon ico=new ImageIcon("img/logo/1.png");
       frame.setBounds(200, 100, 1350, 900);
         frame.setTitle("影 片 信 息 管 理");
         frame.setIconImage(ico.getImage());
        JPanel panel = new JPanel();
        JButton button = new JButton("查询");
        JButton button1 = new JButton("添加");
        JButton button2 = new JButton("删除");
        JButton button3 = new JButton("修改");
        
        
        button.addMouseListener(new MouseAdapter() {
             @Override
  public void mouseClicked(MouseEvent e) {
                new cxcx();
   //System.out.println("按钮被单击了");
         }
         }  );
        
        button1.addMouseListener(new MouseAdapter() {
            @Override
  public void mouseClicked(MouseEvent e) {
            	new AddMovie();
  //System.out.println("按钮被单击了");
         }
         }  );
        
         
        button2.addMouseListener(new MouseAdapter() {
            @Override
  public void mouseClicked(MouseEvent e) {
            	new scsc();
  //System.out.println("按钮被单击了");
         }
         }  );
        
        
        button3.addMouseListener(new MouseAdapter() {
            @Override
  public void mouseClicked(MouseEvent e) {
              new Updatedatabase();
  //System.out.println("按钮被单击了");
         }
         }  );
        
        panel.setLayout(null);
        button.setBounds(70, 200, 200, 75);
        panel.add(button);
        button.setBackground(new Color(255,255,255));
      //设置前景色（字体颜色）
        button.setForeground(new Color(255, 0, 0));
        
        button1.setBounds(370, 200, 200, 75);
        panel.add(button1);
        button1.setBackground(new Color(255,255,255));
        button1.setForeground(new Color(255, 0, 0));
        
        button2.setBounds(670, 200, 200, 75);
        panel.add(button2);
        button2.setBackground(new Color(255,255,255));
        button2.setForeground(new Color(255, 0, 0));
        
        button3.setBounds(970, 200, 200, 75);
        panel.add(button3);
        button3.setBackground(new Color(255,255,255));
        button3.setForeground(new Color(255, 0, 0));
        
        panel.setBounds(100, 200, 100, 100);
        panel.setBackground(new Color(255,255,255));
        frame.getContentPane().add(panel);
        
        frame.setVisible(true);
    }
	
	public static void main(String[] args) {
		erjijiemian jfe=new erjijiemian();
	}

	


	}