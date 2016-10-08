import java.util.ArrayList;
import java.util.List;

//目标对象，他知道观察他的观察者，并提供添加和删除观察者的接口
public class WeatherSubject {
	//用于保存注册的观察者对象
	private List<WeatherObserver> observers =new ArrayList<WeatherObserver>();


	//把观察者添加到观察者集合中
	public void attach(WeatherObserver observer){

	observers.add(observer);
		
	}


	//删除观察者集合中指定的观察者.
	public void detach(WeatherObserver observer){

	observers.remove(observer);

	}


	//通知方法,需要通知观察者列表中的所有观察者.
	protected void notifyObservers(){

	for(WeatherObserver observer : observers){

	//把当前具体被观察者对象传入到update参数中,以便在update()方法中获取被观察者的状态信息.
	observer.update(this);

	} }


}
