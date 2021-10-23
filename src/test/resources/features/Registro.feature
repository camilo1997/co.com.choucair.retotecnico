@Registro
Feature: Como usuario desero ingresar mi informacion basica para
  registrarme en el sitio web utest

  @RegistroExitoso
  Scenario Outline: intento de registro de usuario exitoso
    Given que Jorge quiere registrarse como usuario
    When cuando ingresa su informacion basica
      |nombre|apellido|correo|mes|dia|anos|lenguaje|computador|version|lenguajeSO|movil|modelo|sistema|contrasena|confirmarcontrasena|
      |<nombre>|<apellido>|<correo>|<mes>|<dia>|<anos>|<lenguaje>|<computador>|<version>|<lenguajeSO>|<movil>|<modelo>|<sistema>|<contrasena>|<confirmarcontrasena>|
    Then debe ver la opcion <mensaje> para finalizar registro


    Examples:
      |nombre|apellido|correo|mes|dia|anos|lenguaje|computador|version|lenguajeSO|movil|modelo|sistema|contrasena|confirmarcontrasena|mensaje|
      |Carlos|Soto|carlos7ñs778@mailirftnator.com|October|15|1988|Spanish|Linux|Ubuntu|English|Apple|iPhone|iOS 14.4|A123789456a|A123789456a|Welcome to the world's largest community of freelance software testers!|