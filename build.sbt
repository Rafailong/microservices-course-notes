name := "microservices-course-notes"

version := "0.1"

scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  enablePlugins(GhpagesPlugin).
  enablePlugins(ParadoxSitePlugin).
  enablePlugins(ParadoxMaterialThemePlugin).
  settings(
    name := "notes-on-microservices-architecture-course",
    Paradox / paradoxMaterialTheme := {
      ParadoxMaterialTheme()
        .withColor("blue-grey", "cyan")
        .withCopyright("Copyleft - Rafael Avila")
        .withLanguage(java.util.Locale.ENGLISH)
        .withRepository(uri("https://github.com/Rafailong/microservices-course-notes"))
    },
    scmInfo := Some(ScmInfo(url("https://github.com/Rafailong/microservices-course-notes"), "git@github.com:Rafailong/microservices-course-notes.git")),
    git.remoteRepo := scmInfo.value.get.connection
  )