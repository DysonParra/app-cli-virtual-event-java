@echo off
SET javaPath=C:\Symlinks\java_8_x86

SET testerPackage=com.project.dev.wirelessjoystick.desktop
CALL SET "testerPath=%%testerPackage:.=\%%"
SET testerName=Tester

SET nativePackage=com.project.dev.wirelessjoystick.desktop.nativecode
CALL SET "nativePath=%%nativePackage:.=\%%"
SET nativeName=VirtualEvent

::echo %javaPath%
::echo %testerPackage%
::echo %testerPath%
::echo %testerName%
::echo %nativePackage%
::echo %nativePath%
::echo %nativeName%

@echo on
"%javaPath%\bin\javac" %nativePath%\%nativeName%.java

::"%javaPath%\bin\javah" -o %nativePath%\%nativeName%.h -jni %nativePackage%.%nativeName%
::gcc -shared -Wl,--kill-at -I "%javaPath%\include" -I "%javaPath%\include\win32" -o  %nativePath%\%nativeName%.dll  %nativePath%\%nativeName%.c
"%javaPath%\bin\javah" -o assets\%nativePath%\%nativeName%.h -jni %nativePackage%.%nativeName%
gcc -shared -Wl,--kill-at -I "%javaPath%\include" -I "%javaPath%\include\win32" -o  assets\%nativePath%\%nativeName%.dll  assets\%nativePath%\%nativeName%.c

"%javaPath%\bin\javac" %testerPath%\%testerName%.java
"%javaPath%\bin\java" %testerPackage%.%testerName%