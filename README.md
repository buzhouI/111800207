# 开发环境

- IDE：IntelliJ IDEA 
- 编程语言：Java 1.8.0-261
- 单元测试：JUnit-4.12

```xml
<dependency>
	<groupId>com.hankcs</groupId>
	<artifactId>hanlp</artifactId>
	<version>portable-1.7.8</version>
</dependency>
```

# 运行

- 在release文件夹下找到main.jar，按照以下方式运行

```
//java -jar main.jar [原文文件] [抄袭版论文的文件] [答案文件]，如下：
java -jar main.jar orig.txt orig_0.8_add.txt ans.txt
```