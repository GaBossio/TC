# 🚀 Compilador TC25 - Proyecto de Técnicas de Compilación

## ⚙️ Configuración Inicial del Proyecto

### 🏗️ Creación del Proyecto Maven

Para desarrollar nuestro compilador, comenzamos creando la estructura básica del proyecto con **Maven**, que facilitará la gestión de dependencias y el ciclo de vida de construcción.

Ejecutamos el siguiente comando:

```bash
mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate \
    -DarchetypeArtifactId="maven-archetype-quickstart" \
    -DarchetypeGroupId="org.apache.maven.archetypes" \
    -DarchetypeVersion="1.4" \
    -DgroupId="com.compilador" \
    -DartifactId="demo"
```

🔧 **Configuraciones durante la ejecución:**  
- 📦 **groupId**: `com.compilador`  
- 📂 **artifactId**: `demo`  
- 🔢 **version**: `1.0`  
- 📁 **package**: `com.compilador`  

📌 **Esto genera la siguiente estructura de directorios:**

```
📁 demo/
├── 📜 pom.xml
├── 📂 src/
│   ├── 📂 main/
│   │   └── 📂 java/
│   │       └── 📂 com/
│   │           └── 📂 compilador/
│   │               └── 📄 App.java
│   └── 📂 test/
│       └── 📂 java/
│           └── 📂 com/
│               └── 📂 compilador/
│                   └── 📄 AppTest.java
```

---

## 🛠️ Configuración de ANTLR para el Análisis Léxico

### 1️⃣ Modificación del `pom.xml`

📝 **Añadimos las dependencias y plugins necesarios para trabajar con ANTLR:**

```xml
<properties>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <maven.compiler.source>1.8</maven.compiler.source>
  <maven.compiler.target>1.8</maven.compiler.target>
  <antlr.version>4.9.3</antlr.version>
</properties>

<dependencies>
  <dependency>
    <groupId>org.antlr</groupId>
    <artifactId>antlr4-runtime</artifactId>
    <version>${antlr.version}</version>
  </dependency>
</dependencies>

<build>
  <plugins>
    <plugin>
      <groupId>org.antlr</groupId>
      <artifactId>antlr4-maven-plugin</artifactId>
      <version>${antlr.version}</version>
      <executions>
        <execution>
          <goals>
            <goal>antlr4</goal>
          </goals>
        </execution>
      </executions>
      <configuration>
        <sourceDirectory>${basedir}/src/main/antlr4</sourceDirectory>
        <outputDirectory>${basedir}/src/main/java</outputDirectory>
        <visitor>true</visitor>
        <listener>true</listener>
      </configuration>
    </plugin>
    
    <plugin>
      <artifactId>maven-assembly-plugin</artifactId>
      <configuration>
        <archive>
          <manifest>
            <mainClass>com.compilador.App</mainClass>
          </manifest>
        </archive>
        <descriptorRefs>
          <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
      </configuration>
      <executions>
        <execution>
          <id>make-assembly</id>
          <phase>package</phase>
          <goals>
            <goal>single</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

---

### 2️⃣ Creación de la Estructura de Directorios para ANTLR

📂 **Ejecutamos el siguiente comando para crear el directorio donde residirán nuestros archivos de gramática:**

```bash
mkdir -p src/main/antlr4/com/compilador
```

---

### 3️⃣ Creación del Archivo de Gramática ANTLR

📜 **Creamos el archivo `src/main/antlr4/com/compilador/MiniLenguaje.g4` con las reglas léxicas y sintácticas básicas:**

```antlr
grammar MiniLenguaje;

// 🖥️ Reglas del parser
program : token* EOF ;
token   : ID | INTEGER | STRING | KEYWORD | OPERATOR | SEPARATOR ;

// 🏷️ Reglas léxicas

// Identificadores
ID          : [a-zA-Z][a-zA-Z0-9_]* ;

// 🔢 Literales
INTEGER     : [0-9]+ ;
STRING      : '"' (~["\r\n] | '\"')* '"' ;
BOOLEAN     : 'true' | 'false' ;

// 🏷️ Palabras clave
KEYWORD     : 'var' | 'if' | 'else' | 'print' | 'while' | 'function' | 'return' ;

// ➕ Operadores
OPERATOR    : '+' | '-' | '*' | '/' | '%' | '=' | '==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||' | '!' ;

// 📌 Separadores
SEPARATOR   : ';' | '(' | ')' | '{' | '}' | ',' | '.' ;

// 🚫 Ignorar espacios en blanco y comentarios
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
```

🎯 **Con esto, tenemos la configuración básica para comenzar el desarrollo del compilador TC25 utilizando Maven y ANTLR. ¡Hora de codificar! 🚀🔥**
