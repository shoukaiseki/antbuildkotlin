@ECHO OFF
set "KOTLINCLASSPATH=classes;bin"
@REM for 过程中会自动添加 setlocal ,所以设置 变量时使用 call 传递
for %%F in (lib\*.jar) do (
	call :addcp %%i
)


for %%F in (kotlinlib\*.jar) do (
	call :addcp %%F
)

goto extlibe

:addcp
set KOTLINCLASSPATH=%KOTLINCLASSPATH%;%1
goto :eof

:extlibe
echo KOTLINCLASSPATH=%KOTLINCLASSPATH%

@echo ------------------
java -classpath "%KOTLINCLASSPATH%" com.HelloKt
pause
