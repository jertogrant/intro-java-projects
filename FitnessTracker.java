public class FitnessTracker
{
	public static void main(String[] args)
	{
		String name = "Jeff";
		int age = 28;
		double height = 6.2;
		double weight = 245.2;
		int daysPerWeek = 7;
		int avgTime = 120;
		int weekTotalMin = avgTime * daysPerWeek;
		double weekTotalHour = weekTotalMin / 60.0;
		System.out.println("====== FITNESS REPORT ======");
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println();
		System.out.println("Workout Days: " +daysPerWeek);
		System.out.println("Minutes per Workout: " + avgTime);
		System.out.println();
		System.out.println("Total Mniutes This Week: " + weekTotalMin);
		System.out.println("Total Hours This Week: " + weekTotalHour);
		System.out.println();
		System.out.println("============================");
	}

}