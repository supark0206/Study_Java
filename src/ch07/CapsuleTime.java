package ch07;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public int getHour() {
		return hour;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 60) return;
		this.second = second;
	}

	public void setMinute(int minute) {
		if(minute < 0 || minute > 60) return;
		this.minute = minute;
	}

	public void setHour(int hour) {
		if(isNotValidHour(hour)) 
			return;
		this.hour = hour;
	}

	// alt + shift + m 으로 조건식을 메소드로 뽑아냄
	// 시간 확인하는 코드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	
}
public class CapsuleTime {

	public static void main(String[] args) {
		Time t = new Time();
	    t.setHour(21);
	    t.setMinute(40);
	    t.setSecond(39);
	    System.out.println(t.getHour()+"/"+t.getMinute()+"/"+t.getSecond());
	    
	}

}
