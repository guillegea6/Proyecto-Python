set destination=%1
shift

for %%d in (%*) do (
  xcopy /s /i "%%d" "%destination%"
  if %errorlevel%==0 (
    rem rd /s /q "%%d"
  ) else (
    echo Fallo al copiar "%%d" a "%destination%"
  )
)