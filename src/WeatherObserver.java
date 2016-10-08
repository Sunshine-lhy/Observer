//这是一个观察者接口，定义一个更新的接口给那些目标发生改变的时候被通知的对象
public interface WeatherObserver {
public void update(WeatherSubject subject);
}
