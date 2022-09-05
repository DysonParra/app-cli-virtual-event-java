@echo off
SET javaPath=%JAVA_HOME%

SET testerPackage=com.project.dev.wirelessjoystick.desktop
CALL SET "testerPath=%%testerPackage:.=\%%"
SET testerName=Tester

::echo %javaPath%

@echo on
"%javaPath%\bin\java" %testerPackage%.%testerName%