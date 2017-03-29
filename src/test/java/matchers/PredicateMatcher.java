package matchers;

import java.util.function.Predicate;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class PredicateMatcher<T> extends TypeSafeMatcher<T> {
  private final Predicate<T> predicate;
  
  public PredicateMatcher(Predicate<T> predicate) {
    this.predicate = predicate;
    }

  public static <T> Matcher<T> where(Predicate<T> predicate) {
    return new PredicateMatcher<>(predicate);
    }
  
  @Override
  public void describeTo(Description d) {
    d.appendText(" did not match predicate");
    }

  @Override
  protected boolean matchesSafely(T t) {
    return predicate.test(t);
    }

  }
