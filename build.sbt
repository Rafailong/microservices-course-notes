name := "microservices-course-notes"

version := "0.1"

scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  enablePlugins(ParadoxMaterialThemePlugin).
  settings(
    name := "Hello Project",
    Compile / paradoxMaterialTheme := {
      ParadoxMaterialTheme()
        .withColor("red", "orange")
        .withLogoIcon("cloud")
        .withCopyright("Copyleft © Jonas Fonseca")
    }
  )