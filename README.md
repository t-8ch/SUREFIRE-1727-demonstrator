Maven surefire will report

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
```

Junit console runner reports:

```
java -jar ~/Downloads/junit-platform-console-standalone-1.5.2.jar -cp target/test-classes --scan-classpath

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  ├─ TestFactoryDemonstrationTest ✔
│  │  └─ testFactory() ✘ java.lang.IllegalStateException
│  └─ DemonstrationTest ✔
│     └─ testOne() ✘ No supporting TestTemplateInvocationContextProvider provided an invocation context
└─ JUnit Vintage ✔

Failures (2):
  JUnit Jupiter:TestFactoryDemonstrationTest:testFactory()
    MethodSource [className = 'surefirebug.testfactory.TestFactoryDemonstrationTest', methodName = 'testFactory', methodParameterTypes = '']
    => java.lang.IllegalStateException
       surefirebug.testfactory.TestFactoryDemonstrationTest.testFactory(TestFactoryDemonstrationTest.java:11)
       sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
       sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
       sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
       java.lang.reflect.Method.invoke(Method.java:498)
       org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:675)
       org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
       org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:125)
       org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:132)
       org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:124)
       [...]
  JUnit Jupiter:DemonstrationTest:testOne()
    MethodSource [className = 'surefirebug.testtemplate.DemonstrationTest', methodName = 'testOne', methodParameterTypes = '']
    => org.junit.platform.commons.PreconditionViolationException: No supporting TestTemplateInvocationContextProvider provided an invocation context
       org.junit.platform.commons.util.Preconditions.condition(Preconditions.java:296)
       org.junit.jupiter.engine.descriptor.TestTemplateTestDescriptor.validateWasAtLeastInvokedOnce(TestTemplateTestDescriptor.java:142)
       org.junit.jupiter.engine.descriptor.TestTemplateTestDescriptor.execute(TestTemplateTestDescriptor.java:108)
       org.junit.jupiter.engine.descriptor.TestTemplateTestDescriptor.execute(TestTemplateTestDescriptor.java:41)
       org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)
       org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
       org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
       org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
       org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
       org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
       [...]

Test run finished after 53 ms
[         6 containers found      ]
[         0 containers skipped    ]
[         6 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         2 containers failed     ]
[         0 tests found           ]
[         0 tests skipped         ]
[         0 tests started         ]
[         0 tests aborted         ]
[         0 tests successful      ]
[         0 tests failed          ]

```