# CashPH

Simple Java project simulating a CashPH app with basic user functions and JUnit 5 unit tests.

## How to run

- Ensure you have JDK and JUnit 5.
- Compile and test using your IDE or:
```bash
javac -d out -cp . src/main/java/cashph/*.java src/test/java/cashph/*.java
java -jar junit-platform-console-standalone-<version>.jar --class-path out --scan-class-path
