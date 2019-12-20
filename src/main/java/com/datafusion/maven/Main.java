package com.datafusion.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // 1 程序不打包
        // 单个类文件且没有依赖
        // 编译 javac Main.java            java源文件
        // 产生 Main.class                  字节码文件
        // 运行 java Main

        //单个类文件且有依赖
        //(1)Linux:
        //编译
        // javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar Main.java
        // javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar CalculatorTest.java
        // 运行主类 javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar com.datafusion.maven.Main
        // 运行测试 java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest


        //(2)Windows:
        //编译
        // javac -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar CalculatorTest.java
        //运行主类 javac -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar com.datafusion.maven.Main
        //运行测试java -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest



        //2 程序打jar包

        // java -jar 执行命令时，会用到目录META-INF\MANIFEST.MF文件，在该文件中，有一个叫Main-Class的参数，他说明了 java -jar 命令执行的类。

        // (1)不需要依赖即 所有依赖在一个jar包
        // 打包时指定了主类，可以直接用java -jar xxx.jar
        // 打包时没有指定主类，可以用java -cp xxx.jar 主类名称（绝对路径）  所有依赖在一个jar包

        //(2)需要依赖其他jar，以来在其他目录
        // java -classpath $CLASSPATH:abc.jar xxx.jar 主类名称（绝对路径）。其中 -classpath 指定需要引入的类。

        MDC.put("REQUEST_ID", UUID.randomUUID().toString());
        LOG.warn("test");
    }

}
