import java.util.ArrayList;
import java.util.List;

//Ŀ�������֪���۲����Ĺ۲��ߣ����ṩ��Ӻ�ɾ���۲��ߵĽӿ�
public class WeatherSubject {
	//���ڱ���ע��Ĺ۲��߶���
	private List<WeatherObserver> observers =new ArrayList<WeatherObserver>();


	//�ѹ۲�����ӵ��۲��߼�����
	public void attach(WeatherObserver observer){

	observers.add(observer);
		
	}


	//ɾ���۲��߼�����ָ���Ĺ۲���.
	public void detach(WeatherObserver observer){

	observers.remove(observer);

	}


	//֪ͨ����,��Ҫ֪ͨ�۲����б��е����й۲���.
	protected void notifyObservers(){

	for(WeatherObserver observer : observers){

	//�ѵ�ǰ���屻�۲��߶����뵽update������,�Ա���update()�����л�ȡ���۲��ߵ�״̬��Ϣ.
	observer.update(this);

	} }


}
