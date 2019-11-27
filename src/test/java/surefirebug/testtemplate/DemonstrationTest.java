package surefirebug.testtemplate;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FailingTestTemplateInvocationContextProvider.class)
class DemonstrationTest {
  @TestTemplate
  void testOne() {
    System.out.println("testOne");
  }
}
