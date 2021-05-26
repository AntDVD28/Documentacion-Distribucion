; example2.nsi
;
; This script is based on example1.nsi, but it remember the directory, 
; has uninstall support and (optionally) installs start menu shortcuts.
;
; It will install example2.nsi into a directory that the user selects,

;--------------------------------

; The name of the installer
Name "U0602-Ayuda"

; The file to write
OutFile "U0602-Ayuda.exe"

; The default installation directory
InstallDir $PROGRAMFILES\U0602Ayuda

; Registry key to check for directory (so if you install again, it will 
; overwrite the old one automatically)
InstallDirRegKey HKLM "Software\U0602Ayuda" "Install_Dir"

; Request application privileges for Windows Vista
RequestExecutionLevel admin

;--------------------------------

; Pages

Page components
Page directory
Page instfiles

UninstPage uninstConfirm
UninstPage instfiles

;--------------------------------

Section "Install"

  SectionIn RO
  
  ; Ruta del directorio de instalación
  SetOutPath $INSTDIR
  ; Archivos que agregaremos al directorio de instalación
  File "U0602-Ayuda.nsi"
  File "GestionFit.exe"
  ; Volcado de carpetas con su contenido de forma recursiva 
  File /r helpDJR  
  File /r lib
  
  ; Agregamos claves de registro para instalación y desinstalación
  WriteRegStr HKLM SOFTWARE\U0602Ayuda "Install_Dir" "$INSTDIR"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\U0602Ayuda" "DisplayName" "U0602Ayuda"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\U0602Ayuda" "UninstallString" '"$INSTDIR\uninstall.exe"'
  WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\U0602Ayuda" "NoModify" 1
  WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\U0602Ayuda" "NoRepair" 1
  WriteUninstaller "uninstall.exe"

  ;Agregamos accesos directos
  CreateDirectory "$SMPROGRAMS\U0602Ayuda"
  CreateShortcut "$SMPROGRAMS\U0602Ayuda\Uninstall.lnk" "$INSTDIR\uninstall.exe" "" "$INSTDIR\uninstall.exe" 0
  CreateShortcut "$SMPROGRAMS\U0602Ayuda\U0602Ayuda.lnk" "$INSTDIR\GestionFit.exe" "" "$INSTDIR\GestionFit.exe" 0
  
SectionEnd


;--------------------------------

; Uninstaller
Section "Uninstall"
  
  ; Remove registry keys
  DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\U0602Ayuda"
  DeleteRegKey HKLM SOFTWARE\U0602Ayuda

  ; Remove files and uninstaller
  Delete "$INSTDIR\U0602-Ayuda.nsi"
  Delete "$INSTDIR\GestionFit.exe"
  Delete "$INSTDIR\uninstall.exe"
  Delete "$INSTDIR\lib\*.*"
  Delete "$INSTDIR\helpDJR\*.*"
  Delete "$INSTDIR\helpDJR\html\*.*"
  Delete "$INSTDIR\helpDJR\JavaHelpSearch\*.*"

  ; Remove shortcuts, if any
  Delete "$SMPROGRAMS\U0602Ayuda\*.*"

  ; Remove directories used
  RMDir "$SMPROGRAMS\U0602Ayuda"
  RMDir "$INSTDIR\lib"
  RMDir "$INSTDIR\helpDJR\html"
  RMDir "$INSTDIR\helpDJR\JavaHelpSearch"
  RMDir "$INSTDIR\helpDJR"
  RMDir "$INSTDIR"

SectionEnd
