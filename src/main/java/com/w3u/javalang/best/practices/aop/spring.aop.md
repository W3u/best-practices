
## spring aop 自动代理 是如何实现的

Spring AOP 的自动代理功能主要通过实现org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator或其子类来完成。下面是一个简化的流程说明：
* 配置扫描和自动代理： 
  * 在Spring配置中，通常会启用AOP并配置自动代理，如使用<aop:aspectj-autoproxy />标签或Java配置类的@EnableAspectJAutoProxy注解，这将激活一个特定的自动代理创建器。
* Bean后处理器：
  * AbstractAutoProxyCreator是Spring的一个Bean后处理器（BeanPostProcessor），它会在容器初始化每个Bean实例时进行拦截处理。
* 决定是否需要生成代理：
  * 当Bean后处理器处理某个Bean时，它会调用shouldSkip()方法判断该Bean是否需要被AOP代理增强。这个判断基于用户定义的规则，例如是否有切面应用于该Bean。
  应用通知与生成代理信息：
  如果判定需要生成代理，则根据已注册的Advisor和Aspect来确定针对该Bean的方法调用应该应用哪些通知（Advice）。
* 创建代理对象：
  * 使用内部逻辑检查目标类是否实现了接口，进而选择合适的代理机制：如果目标类实现了至少一个接口，则使用JDK动态代理；否则，使用CGLIB库创建子类代理。
* 构建代理工厂：
  * 通过ProxyFactory或其他相关的类来创建代理工厂，将目标对象、通知列表以及其他代理配置（如代理类型）封装在内。
* 生成并返回代理对象：
  * 最后，由代理工厂根据配置生成实际的代理对象，并将其返回给Spring容器，替代原本的目标Bean引用。
* 方法调用与拦截执行：
  * 当客户端代码通过代理对象调用方法时，代理对象会根据预先设定的通知逻辑，在方法调用前后执行相应的增强操作。

总结来说，Spring AOP 自动代理的实现依赖于Spring容器的生命周期管理机制以及动态代理技术，它在运行时分析并动态地为符合条件的Bean生成代理对象，从而实现面向切面编程的功能。