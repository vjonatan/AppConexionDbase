# AppConexionDbase
Aplicacion que permite realizar un CRUD sobre un archivo DBF (dBase) utilizando Swing.

Esta aplicación permite ingresar, modificar y eliminar datos de una base de datos utilizando un archivo DBF (dBase). 

Para lograr esto, hay que realizar 2 cosas primero:
 1 - Instalar JDK de 32 bits ya que no funciona el ODBC para 64 bits.
 2 - Configurar el proyecto con el JDK de 32 bits.
 3 - Crear un origen de datos ODBCAD32 para 32 bits:  %SystemRoot%\SysWOW64\odbcad32.exe (colocando esto en el Ejecutar de Windows CTRL+R)
