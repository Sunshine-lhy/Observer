//����Ĺ۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
public class CreateWeatherObserver implements WeatherObserver{
//�۲��ߵ�����
	private String observerName;
	
//�������������
	private String weatherContent;
		
//���۲���Ҫ���ѵ�����
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
	//��ȡĿ�����״̬Ҫͬ�����۲��ߵ�״̬��
	public void update(WeatherSubject subject) {
		// TODO Auto-generated method stub
		weatherContent=((CreateWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName+"��"+weatherContent+"��"+remindThing);
		
	}

}
