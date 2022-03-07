import java.time.Duration;
import akka.stream.ThrottleMode;
import akka.stream.javadsl.Source;

public class Test {
    void foo(Source source) {
        source.throttle(2, Duration.ofSeconds(1), 1, ThrottleMode.shaping());
    }
}
