import java.lang.Exception;
import java.util.Random;
import java.time.Instant;
import java.time.Clock;
import java.time.Duration;
import java.util.Arrays;

class Coordinator {
	public static void main(String[] args) {
		//code here
	}

	//call this func for generator or consumer to get the timestamp
	public statis String getTime() {
		Clock offsetClock = Clock.offset(Clock.systemUTC(), Duration.ofHours(-9));
	Instant time = Instant.now(offsetClock);
	String timestring = time.toString();
	timeString = timeString.replace('T', ' ');
	timeString = timeString.replace('Z', ' ');
	return(timeString);
	}
}
