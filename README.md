# Plugin-Template

## Working with ?
This plugin are made to work on a spigot 1.15.2 server, but if you want to use this template for another minecraft version you can simply modify the minecraft version in the ``pom.xml`` file

## Work with bungeecord server ?
Without change no !

But if you follow this step your plugin become a bungeecord plugin
Ine the ``pom.xml`` file replace this lines
```xml
  <repositories>
    <repository>
      <id>spigotmc-repo</id>
      <url>https://hub.spigotmc.org/nexus/content/groups/public/</url>
    </repository>
    <repository>
      <id>codemc-repo</id>
      <url>https://repo.codemc.org/repository/maven-public</url>
    </repository>
  </repositories>

  <dependencies>
    <!--Spigot API-->
    <dependency>
      <groupId>org.spigotmc</groupId>
      <artifactId>spigot-api</artifactId>
      <version>1.15.2-R0.1-SNAPSHOT</version>
    </dependency>
    <!--Bukkit API-->
    <dependency>
      <groupId>org.bukkit</groupId>
      <artifactId>bukkit</artifactId>
      <version>1.15.2-R0.1-SNAPSHOT</version>
    </dependency>
  </dependencies>
```
by
```xml
  <repositories>
    <repository>
      <id>bungeecord-repo</id>
      <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>net.md-5</groupId>
      <artifactId>bungeecord-api</artifactId>
      <version>1.17-R0.1-SNAPSHOT</version>
      <type>jar</type>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>net.md-5</groupId>
      <artifactId>bungeecord-api</artifactId>
      <version>1.17-R0.1-SNAPSHOT</version>
      <type>javadoc</type>
      <scope>provided</scope>
    </dependency>
  </dependencies>
```
