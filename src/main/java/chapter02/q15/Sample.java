package chapter02.q15;

import chapter02.q15.Person.Gender;
import java.util.function.Predicate;

public class Sample {
  public static void main(String[] args) {
    Predicate<Person> isMale = p -> p.getGender().equals(Gender.MALE);
    Predicate<Person> isFemale = p -> p.getGender().equals(Gender.FEMALE);
    Predicate<Person> isAdult = p -> p.getAge() >= 20;

    Predicate<Person> criteria =
        isMale.or(isFemale.and(isAdult)); // 男性、または女性でかつ成人であることを条件とするPredicateを作成

    Person sample = new Person(Gender.MALE, 19);
    if (criteria.test(sample)) { // sampleは男性であるため、trueが返される
      System.out.println("true");
      return;
    }
    System.out.println("NG");
  }
}
