package surefirebug.testfactory;

import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class TestFactoryDemonstrationTest {
  @TestFactory
  Stream<DynamicTest> testFactory() {
    throw new IllegalStateException();
  }
}
