package test;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test extends Applet
        implements ActionListener{
    Label title, dx, dy, da, ddt, dcv;
    TextField txtX, txtY, txtA, txtDT, txtCV;
    Button btntt, btnve, btnthoat;
    int kq;
    
    public Test(){
        
        title= new Label("TINH TOAN CO BAN");
        dx = new Label("Toa do X:"); txtX=new TextField(5);
        dy = new Label("Toa do Y:"); txtY=new TextField(5);
        da = new Label("Canh A:"); txtA=new TextField(5);
        ddt= new Label("Dien tich"); txtDT=new TextField("0",5);
        dcv= new Label("Chu vi"); txtCV=new TextField("0",5);
        btntt=new Button("Tinh Toan"); btnve= new Button("Ve Hinh"); btnthoat= new Button("Thoat");
        
        btntt.addActionListener(this);
        btnve.addActionListener(this);
        btnthoat.addActionListener(this);
        add(title);
        add(dx); add(txtX);
        add(dy); add(txtY);
        add(da); add(txtA);
        add(ddt); add(txtDT);
        add(dcv); add(txtCV);
        add(btntt); add(btnve); add(btnthoat);
    }
    
    
    public void paint(Graphics g)
        {
               g.setColor(Color.red);
               g.drawRect(Integer.parseInt(txtX.getText()), Integer.parseInt(txtY.getText()), Integer.parseInt(txtA.getText()), Integer.parseInt(txtA.getText()));
               
        }
    public void tt(){
        kq=Integer.parseInt(txtA.getText())*Integer.parseInt(txtA.getText());
        txtDT.setText(String.valueOf(kq));
        kq=Integer.parseInt(txtA.getText())*4;
        txtCV.setText(String.valueOf(kq));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btnve){
            repaint();
        }
        if(e.getSource()==btntt){
            tt();
        }
	if(e.getSource()==btnthoat){
            System.exit(0);
	}
    }
    
    
}
