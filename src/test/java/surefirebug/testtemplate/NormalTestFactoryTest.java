package surefirebug.testtemplate;

import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class NormalTestFactoryTest {
  @TestFactory
  Stream<DynamicTest> someTests() {
    return Stream.of(
      DynamicTest.dynamicTest("foo", () -> {}),
      DynamicTest.dynamicTest("bar", () -> {})
    );
  }

  @TestFactory
  Stream<DynamicTest> someOtherTests() {
    return Stream.of(
      DynamicTest.dynamicTest("foo", () -> {}),
      DynamicTest.dynamicTest("bar", () -> {})
    );
  }

  @Test
  void normalTest1() {
    System.out.println("XX");
  }

  @Test
  void normalTest2() {
    System.out.println("YY");
  }

}
