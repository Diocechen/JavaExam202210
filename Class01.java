package Java111Q1;

class threeDobj{
	void Cal_area(int radious){
		System.out.println("radious = "+radious);
		System.out.println("ball volume = "+Math.round(4*(Math.PI*radious*radious*radious/3)));
	}
	void Cal_area(int length, int width, int height){
		System.out.println("length = "+length+",width = "+width+",height = "+height);
		System.out.println("cube surface area = "+(length*width + length*height + width*height)*2);
	}
}

public class Class01 {

	public static void main(String[] args) {
		threeDobj obj1 = new threeDobj();
		threeDobj obj2 = new threeDobj();
		obj1.Cal_area(10);
		obj2.Cal_area(4,5,6);
	}

}
