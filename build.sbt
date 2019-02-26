name := "microservices-course-notes"

version := "0.1"

scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  enablePlugins(ParadoxMaterialThemePlugin).
  settings(
    name := "notes-on-microservices-architecture-course",
    Compile / paradoxMaterialTheme := {
      ParadoxMaterialTheme()
        .withColor("blue-grey", "cyan")
        .withFont("Inconsolata", "Inconsolata")
        .withCopyright("Copyleft - Rafael Avila")
        .withLogoIcon("device_hub")
        .withLanguage(java.util.Locale.ENGLISH)
        .withRepository(uri("https://github.com/Rafailong/microservices-course-notes"))
        .withLogoUri(uri("https://raw.githubusercontent.com/jrouaix/Mutopic/master/icon.png"))
    }
  )