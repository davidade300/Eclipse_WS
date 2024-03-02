package dateTime;

//import java.time.Instant;
import java.time.LocalDate;
//import java.time.LocalDateTime;

public class Calculos {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2024-02-28");
		//LocalDateTime d05 = LocalDateTime.parse("2024-02-28T09:58:30");
		//Instant d06 = Instant.parse("2024-02-28T01:58:30Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("PastweekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		
		
	}

}
