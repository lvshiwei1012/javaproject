### 转义字符
	System.out.println("韩顺平教育\r北京");
	
	\r：回车不是换行，计算机会先输出"韩顺平教育"，然后\r表示回车，没有换行，因此光标会回到"韩顺平教育"之前，然后用"北"替换"韩"，用"京"替换"顺"，最终输出为"北京平教育"；
	\r\n：是换行
	回车和换行的区别：https://blog.csdn.net/qq_33726635/article/details/113043916
	
### 注释
	
	单行注释：
		//
	多行注释：
		/**/
	文档注释：
		注释内容可以被JDK提供的工具javadoc解析，生成一套以网页文件形式体现的说明文档，一般写在类里面；
		
		javadoc -d ./ -author -version hello.java；
		
		javadoc标签：
		/**
		 * @author lvshiwei
		 * @version 1.0
		 * @param number 计数用的
		 * @param name 名字
		 */
![img.png](picture%2Fimg.png)		
		
### 代码规范
	1.类、方法的注释用javadoc的形式来写；
	2.非javadoc注释给代码维护者来看的；
	3.运算符两边加空格，比如 1 + 2 = 3；
	4.源文件使用utf8编码；
	5.行宽度不超过80字符；
	
### 键盘输入
	扫描器对象：Scanner
	要使用这个类：
		1.要导入Scanner类的所在包，java.util.*
		2.创建Scanner类对象
		3.调用类的方法
[MyScanner.java](code%2FMyScanner.java)