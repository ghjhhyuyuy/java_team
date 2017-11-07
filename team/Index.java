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
		System.out.println("平均成绩为"+average);
		System.out.println("最高成绩为"+max);
		System.out.println("最低成绩为"+min);
	}
}
