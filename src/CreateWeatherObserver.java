//具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
public class CreateWeatherObserver implements WeatherObserver{
//观察者的名字
	private String observerName;
	
//天气的内容情况
	private String weatherContent;
		
//被观察者要提醒的内容
	private String remindThing;
	
	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

	@Override
	//获取目标类的状态要同步到观察者的状态中
	public void update(WeatherSubject subject) {
		// TODO Auto-generated method stub
		weatherContent=((CreateWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName+"："+weatherContent+"，"+remindThing);
		
	}

}
