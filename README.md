# Using EvoSuite together with coverage analysis tools

## PIT

PIT works with generated tests if separate classloader is set to false. It does not work
otherwise.

## Jacoco

Jacoco with a JavaAgent for instrumentation at classloading-time works with generated tests 
if separate classloader is set to false. It does not work otherwise.

Jacoco with offline instrumentation works regardless of the classloader
setting. It is important, however, to explicitly set the location of the
jacoco.exec file. The commandline for Jacoco with offline instrumentation
is:

mvn clean test jacoco:restore-instrumented-classes jacoco:report

## Cobertura

Works regardless of classloader setting.


## Clover

Works regardless of classloader setting.
