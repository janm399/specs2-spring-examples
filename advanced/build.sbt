/** Project */
name := "specs2-spring-examples-advanced"

version := "0.4"

organization := "org.specs2"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.0")

/** Shell */
shellPrompt := { state => System.getProperty("user.name") + "> " }

shellPrompt in ThisBuild := { state => Project.extract(state).currentRef.project + "> " }

/** Dependencies */
resolvers ++= Seq("snapshots-repo" at "http://scala-tools.org/repo-snapshots")

libraryDependencies ++= Seq(
  "c3p0" % "c3p0" % "0.9.1.2", 
 "commons-io" % "commons-io" % "2.0.1", 
 "commons-fileupload" % "commons-fileupload" % "1.2.2", 
 "commons-lang" % "commons-lang" % "2.4", 
 "org.hsqldb" % "hsqldb" % "2.2.4", 
 "javax.mail" % "mail" % "1.4", 
 "javax.servlet" % "servlet-api" % "2.5", 
 "javax.servlet" % "jstl" % "1.1.2", 
 "jdom" % "jdom" % "1.0", 
 "junit" % "junit" % "4.9", 
 "mysql" % "mysql-connector-java" % "5.1.17", 
 "net.sf.ehcache" % "ehcache-core" % "2.4.5", 
 "net.sf.ehcache" % "ehcache-web" % "2.0.3", 
 "org.aspectj" % "aspectjrt" % "1.6.11", 
 "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.0", 
 "org.directwebremoting" % "dwr" % "3.0.M1", 
 "org.easymock" % "easymock" % "3.0", 
 "org.hibernate" % "hibernate-entitymanager" % "3.6.7.Final", 
 "org.hibernate" % "hibernate-validator" % "4.2.0.Final", 
 "org.slf4j" % "slf4j-log4j12" % "1.5.6", 
 "org.slf4j" % "slf4j-api" % "1.5.6", 
 "org.springframework" % "spring-aop" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-beans" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-context" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-core" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-jdbc" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-orm" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-tx" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-context-support" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-test" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-web" % "3.1.0.RELEASE", 
 "org.springframework" % "spring-webmvc" % "3.1.0.RELEASE", 
 "org.springframework.security" % "spring-security-core" % "3.0.7.RELEASE", 
 "org.springframework.security" % "spring-security-config" % "3.0.7.RELEASE", 
 "org.springframework.security" % "spring-security-web" % "3.0.7.RELEASE", 
 "org.springframework.security" % "spring-security-taglibs" % "3.0.7.RELEASE", 
 "net.java.dev.rome" % "rome" % "1.0.0", 
 "struts-menu" % "struts-menu" % "2.4.3", 
 "taglibs" % "standard" % "1.1.2"
  )

publishMavenStyle := true
