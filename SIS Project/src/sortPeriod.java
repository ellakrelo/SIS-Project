import java.util.Comparator;

public class sortPeriod implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getFirstperiod().compareTo(s2.getFirstperiod()); 
		}
	}