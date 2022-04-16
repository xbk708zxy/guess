package Guess.number.com.main;

import java.awt.EventQueue;

import Guess.number.com.view.MyFrame;

public class MyMain {
	
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public static int start(int i){
		return (int)(Math.random()*i);
	}
	
	public static int difficult(String s){
		if(s.equals("0-10")){
			return 11;
		}else if(s.equals("0-100")){
			return 101;
		}else if(s.equals("0-1000")){
			return 1001;
		}
		return 101;
	}
	
	public static int cishu(int a){
		if(a==1){
			return 1;
		}else if(a==3){
			return 3;
		}else if(a==5){
			return 5;
		}else if(a==10){
			return 10;
		}
		return 5;
	}
	
	public static void GameStart(){
		int gs0= (int)(Math.random()*101);
		
		
	
	}
	


	
}
