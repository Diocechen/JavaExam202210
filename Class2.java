package Java111Q1;

class Data{
	private String name;
	private Test score = new Test(0, 0);
	private float avg;
	Data(String n,int e,int m){
		name = n;
		score.English = e;
		score.Math = m;
		avg = score.doubleavg();
	}
	class Test{
		int Math;
		int English;
		Test(int m,int eng){
			Math = m;
			English = eng;
		}
		float doubleavg() {
			avg = (((float)Math + (float)English))/2;
			return avg;
		}
	}
	void show() {
		System.out.println("name:"+name+" english:"+score.English+" math:"+score.Math+" avg:"+avg);
	}
}

public class Class2 {

	public static void main(String[] args) {
		Data students[] = new Data[2];
		students[0] = new Data("Annie",85,92);
		students[1] = new Data("Brain",77,56);
		students[0].show();
		students[1].show();
	}

}
