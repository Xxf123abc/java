package com.xxl.test;

import java.util.Timer;
import java.util.TimerTask;

public class MyTest {
	
	private static int count = 3;
	public static void main(String[] args) {
		
		try {
			boolean a = parse("a");
			System.out.println(a);
			if(!a){
				repeat();
			}
		} catch (Exception e) {
			repeat();
		}
	}

	public static boolean parse(String str) throws NumberFormatException {
		boolean flag = false;
		try {
			int a = Integer.parseInt(str);
			flag = true;
		} catch (NumberFormatException e) {
			return flag;
		}
		
		return flag;
	}
	
	public static void repeat(){
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(count>0){
					count--; 
					boolean a = parse("a");
					if(!a){
						System.out.println("你好");
						timer.cancel();
					}
					if(a){
						
					}
				}else{
					System.out.println("我结束了");
					timer.cancel();
				}
				
			}
		},0,3*1000);
	}
}
