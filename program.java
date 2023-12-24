//  /usr/lib/jvm/jdk-20/bin/java program.java

// Компиляция
// javac -d bin program.java 

// Запуск скомпилированного
// Обрпщпться к пакету чере точку, не через слеш
// java -classpath ./bin program


import testLib.lib;

public class program {
    public static void main(String[] args) {
        lib.sayHi();
    }
}
