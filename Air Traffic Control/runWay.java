import java.util.*;
class runWay extends Thread{
	String name;
	int time;
	boolean status;//true - free and false - busy
	runWay(String name,int time,boolean status){
		this.name=name;
		this.time=time;
		this.status=status;
	}
}