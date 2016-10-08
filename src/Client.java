
public class Client {
	
public static void main(String[] args){
//	创建目标
	CreateWeatherSubject weather=new CreateWeatherSubject();
//	创建观察者
	CreateWeatherObserver observerGirl=new CreateWeatherObserver();
	observerGirl.setObserverName("媳妇");
	observerGirl.setRemindThing("我们的第一次约会");
	
	CreateWeatherObserver observerMum=new CreateWeatherObserver();
	observerMum.setObserverName("mama");
	observerMum.setRemindThing("是个购物的好诶子，记得扫货");
//	注册观察者
	weather.attach(observerGirl);
	weather.attach(observerMum);
//	目标
	weather.setWeatherContent("明天天气晴朗，蓝天白云，气温28°");
}
}
