
public class Client {
	
public static void main(String[] args){
//	����Ŀ��
	CreateWeatherSubject weather=new CreateWeatherSubject();
//	�����۲���
	CreateWeatherObserver observerGirl=new CreateWeatherObserver();
	observerGirl.setObserverName("ϱ��");
	observerGirl.setRemindThing("���ǵĵ�һ��Լ��");
	
	CreateWeatherObserver observerMum=new CreateWeatherObserver();
	observerMum.setObserverName("mama");
	observerMum.setRemindThing("�Ǹ�����ĺ����ӣ��ǵ�ɨ��");
//	ע��۲���
	weather.attach(observerGirl);
	weather.attach(observerMum);
//	Ŀ��
	weather.setWeatherContent("�����������ʣ�������ƣ�����28��");
}
}
