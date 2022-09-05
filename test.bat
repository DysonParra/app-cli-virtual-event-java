@echo off
SET javaPath=C:\Symlinks\java_8_x86

SET testerPackage=com.project.dev.wirelessjoystick.desktop
CALL SET "testerPath=%%testerPackage:.=\%%"
SET testerName=Tester

::echo %javaPath%

@echo on
"%javaPath%\bin\java" %testerPackage%.%testerName%