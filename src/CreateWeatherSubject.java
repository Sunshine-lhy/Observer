//�����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶�����
public class CreateWeatherSubject extends WeatherSubject{
//��ȡ������������Ϣ
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//�������ˣ�˵�����������ˣ�֪ͨ���ж�����������
		this.notifyObservers();
	}

	
	
}
