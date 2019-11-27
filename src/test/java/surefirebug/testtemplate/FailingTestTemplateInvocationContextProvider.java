package surefirebug.testtemplate;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

public class FailingTestTemplateInvocationContextProvider
    implements TestTemplateInvocationContextProvider {

  @Override
  public boolean supportsTestTemplate(ExtensionContext context) {
    return true;
  }

  @Override
  public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(
      ExtensionContext context) {
    //throw new IllegalStateException(""); // throw a custom exception
    return Stream.of(); // this will be rejected by Junit itself with a PreconditionViolationException
  }
}