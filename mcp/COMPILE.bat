call recompile.bat
call reobfuscate.bat
robocopy src\minecraft\assets reobf\assets /MIR
robocopy reobf %appdata%\.minecraft\mods\bjmMod /MIR
%SystemRoot%\explorer.exe "%appdata%\.minecraft\mods\bjmMod"