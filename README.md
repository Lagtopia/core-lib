# CoreLib – A Modular Library for Streamlined Development

**CoreLib** is a modular utility library designed to simplify and standardize the development process across projects.

Its primary goal is to centralize commonly reused code into a single, managed package. This allows developers to quickly import and leverage utility functions in any new project with minimal setup.

---

## Features
- Utility methods for common Spigot plugin development tasks
- Deployed and maintained via GitHub Packages
- Structured for scalability and future extension

---

##  Installation

This project is automatically deployed and published to GitHub Packages, making it easy to integrate with your Maven-based project.

### 1. Add GitHub Packages to your `pom.xml`
```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/Lagtopia/core-lib</url>
  </repository>
</repositories>
```

### 2. Add CoreLib as a depdency to your `pom.xml`
```xml
<dependencies>
  <dependency>
    <groupId>me.csdad.lagtopia</groupId>
    <artifactId>corelib</artifactId>
    <version>1.0.2</version>
  </dependency>
</dependencies>
```

You can view available versions alongside changelogs on our [packages](https://github.com/Lagtopia/core-lib/packages/) page.

### Optional - Shade CoreLib into your Final JAR
This option will prevent missing dependency issues, but will increase the scope of your build.
```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-shade-plugin</artifactId>
      <version>3.5.0</version>
      <executions>
        <execution>
          <phase>package</phase>
          <goals>
            <goal>shade</goal>
          </goals>
          <configuration>
            <createDependencyReducedPom>false</createDependencyReducedPom>
            <minimizeJar>true</minimizeJar>
            <relocations>
              <relocation>
                <pattern>me.csdad.lagtopia.corelib</pattern>
                <shadedPattern>your.package.shaded.corelib</shadedPattern>
              </relocation>
            </relocations>
          </configuration>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

### Example Usage - Using Color to quickly translate string literals
```java
import me.csdad.lagtopia.corelib.Chat.Color;

public class Example {
    
    public void sendMessage(Player p) {
        p.sendMessage(Color.translate("&cRed Message"));
    }
}
```
