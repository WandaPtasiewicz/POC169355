public class TestTime {
	public static void main(String[] args)
	{
		Time t1=new Time();
		Time t2=new Time();
		t1.hours=23;
		t1.minutes=23;
		System.out.println(t1.hours+":"+ t1.minutes);
		t2.hours=3;
		t2.minutes=5;
		t1.addTime(t2);
		System.out.println(t1.hours+":"+ t1.minutes);
	}
}

	class Time{
	int hours;
	int minutes;

	public void addTime(Time otherTime){
		if(minutes + otherTime.minutes>59){
			hours+=1;
			minutes+=otherTime.minutes -60;
		}else{
			minutes+=otherTime.minutes;

		}

		if(hours +otherTime.hours>23){
			hours+=otherTime.hours-24;
		}else{
			hours+= otherTime.hours;
		}

	}
}
