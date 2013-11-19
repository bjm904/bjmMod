@echo off
echo Program by Bryce Meyer v1.0
call recompile.bat
call reobfuscate.bat
robocopy src\minecraft\assets reobf\assets /MIR
set "OLDDIR=%CD%"
cd /d "%PROGRAMFILES%\WinRAR"
winrar.exe a -afzip -ep1 %appdata%\.minecraft\mods\bjmMod.zip %OLDDIR%\src\minecraft reobf\minecraft\*
pause