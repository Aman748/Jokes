/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jokes;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Aman
 */
public class Jokes {

    public static void main(String[] args) throws AWTException, InterruptedException {
        //new Jokes().Joke_Mouse(100);
        new Jokes().Joke_Resignation();
    }
    
    
    //鼠标满屏随机飞舞
    public void Joke_Mouse(int times) throws AWTException, InterruptedException{
        java.awt.Robot m1 = new java.awt.Robot();
        for(int i = 0 ; i <=times ; i++){  
            m1.mouseMove((int)(Math.random()*1000),(int)(Math.random()*1000));
            Thread.sleep(50);
        }
    }
    
    
    //恶搞辞职信
    public void Joke_Resignation()
    {
        JDialog MainWindow = new JDialog();//窗口标题
        MainWindow.setSize(550, 650);//窗口大小
        MainWindow.setResizable(false);//窗口大小不可变
        MainWindow.setLocationRelativeTo(null);//窗口置于屏幕中央
        MainWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);//DO_NOTHING_ON_CLOSE 窗口不可关闭
        
        JPanel container = new JPanel();//创建容器
        container.setSize(500,500);//设置容器尺寸
        MainWindow.setContentPane(container);//指定到窗口
        container.setBackground(Color.WHITE);//容器背景颜色
        container.setLayout(null);//清空布局管理器
        
        JLabel jl1 = new JLabel("辞职信");//创建标签
//        jl1.setHorizontalAlignment(SwingConstants.CENTER);//使标签上的文字居中
        jl1.setFont(new java.awt.Font("SentyTEA-4800", 1, 30));//设置标签字体,类型,大小
        
        JLabel jl2 = new JLabel("尊敬的各位领导:");
//        jl2.setHorizontalAlignment(SwingConstants.CENTER);
        jl2.setFont(new java.awt.Font("HYMiaoHunTiW", 1, 20));
        
        JLabel jl3 = new JLabel();
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("img/bgl.png"));//创建图片对象//因为要打包jar 所以使用相对路径
        jl3.setIcon(img1);//设定标签图标为图片对象
        
        JLabel jl4 = new JLabel("告辞!");
        jl4.setFont(new java.awt.Font("HYk0gj", 0, 60));
        jl4.setForeground(Color.red);//设置字体颜色
        
        JLabel jl5 = new JLabel("辞职人:王博");
        jl5.setFont(new java.awt.Font("HYMiaoHunTiW", 1, 20));
        
        JButton jb1 = new JButton();//创建按钮
        jb1.setText("同意");//设置按钮文字
        jb1.setForeground(Color.blue);//设置按钮颜色
        jb1.setFont(new java.awt.Font("HYQingYunW", 1, 20));//设置文字字体,类型,大小
        
        JButton jb2 = new JButton("不同意");
        jb2.setForeground(Color.red);
        jb2.setFont(new java.awt.Font("HYQingYunW", 1, 20));

        //创建按钮鼠标监听器
        jb2.addMouseListener(new java.awt.event.MouseAdapter() {
            //鼠标进入按钮范围按钮重新设置随机坐标
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jb2.setBounds((int)(Math.random()*480), (int)(Math.random()*480), 100, 40);
            }
        });
        
        container.add(jb1).setBounds(130,560,100,40);//添加组件到容器,并设置左上角相对于容器左上角的x,y坐标,以及组件宽度和高度
        container.add(jb2).setBounds(330,560,100,40);//优先添加,置于顶部,免于被其他组件遮住
        container.add(jl1).setBounds(230, 30, 150, 30);;
        container.add(jl2).setBounds(20, 90, 150, 30);
        container.add(jl3).setBounds(180, 100 , 300, 300);
        container.add(jl4).setBounds(210,380,250,100);
        container.add(jl5).setBounds(400,450,100,100);
        
        
        MainWindow.setVisible(true);//窗口可视
        
        //添加窗口监听器
        MainWindow.addWindowListener(new WindowAdapter() {
            //监听窗口关闭事件
            @Override
            public void windowClosing(WindowEvent e) {
                JDialog Dialog1 = new JDialog();//创建对话框窗口
                Dialog1.setSize(500,400);
                Dialog1.setResizable(false);
                Dialog1.setLocationRelativeTo(null);
                Dialog1.setLayout(null);
                
                JLabel jl6 = new JLabel("你以为这样就不用管了?");
                jl6.setFont(new java.awt.Font("HYMiaoHunTiW", 0, 30));
                jl6.setForeground(Color.red);
                
                JLabel jl7 = new JLabel();
                ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("img/mm.png"));
                jl7.setIcon(img2);
                
                Dialog1.add(jl6).setBounds(130, 5, 300, 70);
                Dialog1.add(jl7).setBounds(130, 70, 300, 300);
                
                Dialog1.setVisible(true);
            }
        });
        
        //创建按钮点击监听器
        jb1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog Dialog2 = new JDialog();
                Dialog2.setSize(500,480);
                Dialog2.setResizable(false);
                Dialog2.setLocationRelativeTo(null);
                Dialog2.setLayout(null);
                
                JLabel jl8 = new JLabel("老板大人");
                jl8.setFont(new java.awt.Font("HYk0gj", 0, 30));
                
                JLabel jl9 = new JLabel("这一退可能就是一辈子了");
                jl9.setFont(new java.awt.Font("HYk0gj", 0, 30));
                
                JLabel jl10 = new JLabel("还有一点舍不得");
                jl10.setFont(new java.awt.Font("HYk0gj", 0, 30));
                
                JLabel jl11 = new JLabel("告辞!");
                jl11.setFont(new java.awt.Font("HYk0gj", 0, 60));
                jl11.setForeground(Color.red);
                
                JLabel jl12 = new JLabel("(辞职同意书已发送至王博邮箱)");
                jl12.setFont(new java.awt.Font("HYk0gj", 0, 15));
                
                JButton jb3 = new JButton("退出");
                jb2.setForeground(Color.red);
                jb2.setFont(new java.awt.Font("HYQingYunW", 1, 20));
                
                Dialog2.add(jl8).setBounds(190,10,500,80);
                Dialog2.add(jl9).setBounds(85,90,500,80);
                Dialog2.add(jl10).setBounds(145,170,500,80);
                Dialog2.add(jl11).setBounds(180,250,500,80);
                Dialog2.add(jl12).setBounds(145,340,500,30);
                Dialog2.add(jb3).setBounds(380,400,100,40);
                
                Dialog2.setVisible(true);
                
                Dialog2.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                jb3.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
        });
    }    
}
