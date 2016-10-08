//具体的目标对象，负责吧有关状态存入到相应的观察者对象中
public class CreateWeatherSubject extends WeatherSubject{
//获取天气的内容信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//内容有了，说明天气更新了，通知所有订阅天气的人
		this.notifyObservers();
	}

	
	
}
