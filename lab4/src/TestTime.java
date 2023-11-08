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
		t1 = t1.addTime(t2);

		System.out.println(t1.hours+":"+ t1.minutes);
	}
}

	class Time{
	int hours;
	int minutes;

	public Time addTime(Time otherTime){
		Time t3= new Time();
		if(minutes + otherTime.minutes>59){
			t3.hours+=1;
			t3.minutes=minutes+otherTime.minutes -60;
		}else{
			t3.minutes=minutes+otherTime.minutes;

		}

		if(hours +otherTime.hours>23){
			t3.hours=hours+otherTime.hours-24;
		}else{
			t3.hours=hours+ otherTime.hours;
		}
	return t3;
	}
}
