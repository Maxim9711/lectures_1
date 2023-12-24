//  /usr/lib/jvm/jdk-20/bin/java program.java

// Компиляция
// Указать путь к исходникам, если потребуется, через -sourcepath ./
// javac -d bin program.java 

// Запуск скомпилированного
// Обращаться к пакету чере точку, не через слеш
// java -classpath ./bin program

package main;

import testLib.lib;

public class program {
    public static void main(String[] args) {
        lib.sayHi();
    }
}
