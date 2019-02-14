import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.applet.*;
class ThreadButtonGame1 implements ActionListener,MouseMotionListener{
	
	int counter=0;
	
	
	
	JFrame win=new JFrame();
	
			
		
				
	JLabel l1=new JLabel("***\n***");
	JLabel l2=new JLabel("***\n***");
	JLabel l3=new JLabel("***\n***");
	JLabel l4=new JLabel("***\n***");
	ImageIcon icon1=new ImageIcon("e:\\helicopter1.gif");
	JLabel spaceBar=new JLabel(icon1);
	
	JButton b1=new JButton("Start");
	JTextField text1=new JTextField();
	
	JLabel label=new JLabel("Score");
	
	
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	Thread3 t3=new Thread3();
	Thread4 t4=new Thread4();
	ThreadButtonGame1(){
	
	win.setBounds(0,0,1400,850);
	win.show();
	win.setLayout(null);
	
	label.setBounds(250,5,50,30);
	
	text1.setBounds(250,30,50,30);
	
	spaceBar.setBackground(Color.red);
	win.setBackground(Color.black);
	l1.setBounds(1100,70,80,40);
	l2.setBounds(1100,200,80,40);
	l3.setBounds(1100,320,80,40);
	l4.setBounds(1100,440,80,40);
	b1.setBounds(20,500,80,40);
	spaceBar.setBounds(0,10,300,250);
	
	l1.setBackground(Color.gray);
	l2.setBackground(Color.green);
	l3.setBackground(Color.magenta);
	l4.setBackground(Color.orange);
	
	win.add(l2);
	win.add(l1);
	win.add(b1);
	
	win.add(l3);
	win.add(l4);
	win.add(spaceBar);
	win.add(text1);
	
	win.add(label);
	
	
	b1.addActionListener(this);
	
	win.addMouseMotionListener(this);
	
	
			
	}
	
	public void mouseDragged(MouseEvent e){}
	
	

	public void mouseMoved(MouseEvent e){

	  int x=e.getX();
	  int y=e.getY();

	  spaceBar.setLocation(20,y);
	  

	} 
	
	
	public void actionPerformed(ActionEvent e){
	
		if(b1==e.getSource()){
		
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		
			try{
			URL url=new URL("file:\\e:\\helicopter.wav");
			AudioClip clip=Applet.newAudioClip(url);
			clip.loop();
			
		}catch(Exception ex){ex.printStackTrace();}
			
		}
		
	}
	class Thread1 extends Thread{
	
		public void run(){
		
			while(true){
			
				
			
				l1.setLocation(l1.getX()-1,l1.getY());
				try{
				Thread.sleep(4);
				}
				catch(InterruptedException e){
				e.printStackTrace();
				}
				
				if(l1.getLocation().x==1){
						counter++;
					text1.setText("      "+counter+"     ");	
				l1.setLocation(1100,70);
					
				}//if
							
				
				if(l1.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()>l1.getY()&&spaceBar.getY()<l1.getY()+spaceBar.getHeight()
				||l1.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()<l1.getY()&&spaceBar.getY()>l1.getY()-spaceBar.getHeight()){
			
			
					l1.setLocation(1100,70);
			
			    } 
					
		
			
			}//while end
		
		}//run method end
	}//thread class end
	
	class Thread2 extends Thread{
	
		public void run(){
		
			while(true){
			
				l2.setLocation(l2.getX()-1,l2.getY());
				try{
				Thread.sleep(2);
				}
				catch(InterruptedException e){
				e.printStackTrace();
				}
				
				if(l2.getLocation().x==1){
						counter++;
					text1.setText("      "+counter+"     ");	
				l2.setLocation(1100,200);
					
				}//if
							
				
				if(l2.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()>l2.getY()&&spaceBar.getY()<l2.getY()+spaceBar.getHeight()
				||l2.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()<l2.getY()&&spaceBar.getY()>l2.getY()-spaceBar.getHeight()){
			
			
					l2.setLocation(1100,200);
			
			    } 
			
			    
				
			
			}//while end
		
		}//run method end
	}//thread class end
	
	class Thread3 extends Thread{
	
		public void run(){
		
			while(true){
			
				l3.setLocation(l3.getX()-1,l3.getY());
				try{
				Thread.sleep(3);
				}
				catch(InterruptedException e){
				e.printStackTrace();
				}
				
				if(l3.getLocation().x==1){
						counter++;
					text1.setText("      "+counter+"     ");	
				l3.setLocation(1100,320);
					
				}//if
							
				
				if(l3.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()>l3.getY()&&spaceBar.getY()<l3.getY()+spaceBar.getHeight()
				||l3.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()<l3.getY()&&spaceBar.getY()>l3.getY()-spaceBar.getHeight()){
			
			
					l3.setLocation(1100,320);
			
			    } 
			
			}//while end
		
		}//run method end
	}//thread class end
	
	class Thread4 extends Thread{
	
		public void run(){
		
			while(true){
			
				l4.setLocation(l4.getX()-1,l4.getY());
				try{
				Thread.sleep(1);
				}
				catch(InterruptedException e){
				e.printStackTrace();
				}
				
				if(l4.getLocation().x==1){
						counter++;
					text1.setText("      "+counter+"     ");	
				l4.setLocation(1100,440);
					
				}//if
							
				
				if(l4.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()>l4.getY()&&spaceBar.getY()<l4.getY()+spaceBar.getHeight()
				||l4.getX()<=spaceBar.getX()+spaceBar.getWidth()&&spaceBar.getY()<l4.getY()&&spaceBar.getY()>l4.getY()-spaceBar.getHeight()){
			
			
					l4.setLocation(1100,440);
			
			    } 
			
			    
			
			}//while end
		
		}//run method end
	}//thread class end
	public static void main(String args[]){
	
		ThreadButtonGame1 ob=new ThreadButtonGame1();
	
	}
}
	