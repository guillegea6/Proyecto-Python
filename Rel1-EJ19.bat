if "%2" == "" (
    echo Sintaxis: %0 {v/b} fichero
    goto:eof
) else (
    if exist %2\* (
     echo el parametro %2 es un directorio    
    goto:eof
    ) 
    if not exist %2 (
    echo El archivo %2 no existe 
    ) else (
        if "%1" == "B" (
            
        )
    )    

)
