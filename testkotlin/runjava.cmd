@ECHO OFF
set "KOTLINCLASSPATH=classes;bin"
@REM for �����л��Զ���� setlocal ,�������� ����ʱʹ�� call ����
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
