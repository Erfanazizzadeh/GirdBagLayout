import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gird extends JFrame {
    public Gird() {
        initComponents();
    }
    private void initComponents(){
        JButton btnbuy = new JButton();
        JLabel lblnull = new JLabel();
        JButton btnsell = new JButton();
        GroupLayout GL = new GroupLayout(getContentPane());


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gird");
        setResizable(false);
        setSize(new Dimension(400,300) );
//        setLayout(new GroupLayout(getContentPane()));




       btnbuy.setText("Buy");
       btnbuy.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               lblnull.setText(" goodbye");
           }
       });


        //horizonatl
        getContentPane().setLayout(GL);
        GL.setHorizontalGroup(GL.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GL.createSequentialGroup()
                .addGap(22,22,22)
                .addComponent(btnbuy)
                .addGap(50,50,50)
                .addComponent(lblnull,GroupLayout.PREFERRED_SIZE,60,GroupLayout.PREFERRED_SIZE)
                .addGap(36,36,36)
                .addComponent(btnsell)
                .addContainerGap(80,Short.MAX_VALUE)
        ));
        //vertical
        GL.setVerticalGroup(GL.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GL.createSequentialGroup()
                .addContainerGap()
                .addGroup(GL.createParallelGroup(GroupLayout.Alignment.LEADING))
                .addComponent(lblnull)
                .addComponent(btnbuy)
                .addComponent(btnsell)
                .addContainerGap(264,Short.MAX_VALUE)));


       lblnull.setText("salam");
       btnsell.setText("sell");
       btnsell.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               lblnull.setText("Done");
           }
       });




        add(btnbuy);
        add(lblnull);
        add(btnsell);

       // setVisible(true);

    }

    public static void main(String[] args) {
       run();

    }
    public static void run() {
        new Gird().setVisible(true);
    }




}
