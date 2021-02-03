package com.haust.config;

import org.springframework.context.annotation.Configuration;
/**
 * AOP 
 * 		注意：对象一般不要自己创建。由Spring管理
 * 		注意： joinpoint必须放在第一位参数位置
 * 		指在程序运行期间动态的将某段代码切入到指定方法指定位置进行运行的编程方式。
 * 
 * 1. 需要导入aop模块 spring-aspectsj
 * 2. 编写业务逻辑类
 * 3. 需求想要在逻辑运行前后进行日志输入
 * 4. 定义一个日志切面类，动态的感知div的运行位置
 * 		通知方法：
 * 			* 任意方法 .. 任意参数
 * 			前置通知 @Before(权限修饰符 返回值类型 方法全类名 方法名(参数类型...)) 方法(JoinPoint joinPoint)参数可有可无
 * 			后置通知	无论方法正常结束还是异常结束 @After(权限修饰符 返回值类型 方法全类名 方法名(参数类型...))
 * 			异常通知	@AfterThrowing(权限修饰符 返回值类型 方法全类名 方法名(参数类型...),throwing = "参数")
 * 			返回通知	@AfterReturing(权限修饰符 返回值类型 方法全类名 方法名(参数类型...),returning = "参数") 可以获取返回值
 * 			环绕通知	@Around joinPoint.procced
 * 			
 * 			//抽取公公切点
 * 			//方便其他切面引用
 * 			@PointCut("execution(权限修饰符 返回值类型 方法全类名 方法名(参数类型...))")
 * 
 * 5. 将切面类和业务逻辑类都在加载在Configtion中，即ioc容器中
 * 6. 必须告诉Spring那个类是切面类 ，@Aspect告诉Spring该Bean是一个切面类
 * 7. 引用aop:aspectj-autoproxy @EnableAspectJAutoProxyble加载配置类里面
 * 
 * 
 * @author PC
 *
 */
@Configuration
public class SpringAnnotationAopConfig {

}
