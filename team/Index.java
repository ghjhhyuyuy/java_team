package team;

public class Index {
	public static void main(String[] args) {
		Sure1 sure1 = new Sure1();
		Sure2 sure2 = new Sure2();
		int[] a = sure2.getScoreFromText("F:\\desktop\\datas.txt");
		float average = sure1.Average(a);
		float max = sure1.Max(a);
		float min = sure1.Min(a);
		System.out.println("");
		System.out.println("ƽ���ɼ�Ϊ"+average);
		System.out.println("��߳ɼ�Ϊ"+max);
		System.out.println("��ͳɼ�Ϊ"+min);
	}
}
