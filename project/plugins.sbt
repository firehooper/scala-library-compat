if (System.getProperty("java.version").startsWith("1."))
  Seq()
else
  // override to version that works on Java 11,
  // see https://github.com/scala/sbt-scala-module/issues/35
  Seq(addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.3"))

val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("0.6.26")

addSbtPlugin("org.scala-js"           % "sbt-scalajs"              % scalaJSVersion)
addSbtPlugin("org.portable-scala"     % "sbt-scalajs-crossproject" % "0.6.0")
addSbtPlugin("org.scala-lang.modules" % "sbt-scala-module"         % "1.0.14")
addSbtPlugin("ch.epfl.scala"          % "sbt-scalafix"             % "0.9.4")
addSbtPlugin("com.eed3si9n"           % "sbt-buildinfo"            % "0.7.0")
addSbtPlugin("com.typesafe.sbt"       % "sbt-pgp"                  % "0.8.3")
