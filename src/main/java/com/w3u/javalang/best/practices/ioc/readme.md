
## 为什么需要IoC

## 如何通知IoC为你注入依赖(向IoC注册依赖关系)
1. 构造函数注入
2. Setter注入
3. 字段注入

## IoC的价值
1. 降低耦合度

## IoC的职责
1. 分析依赖关系
   - 根据配置文件，编码，注解，分析出依赖关系    
2. 创建对象（由依赖层次决定）和 依赖绑定

## IoC使用前后对比
- 使用前，需要自己去“拉”pull 所依赖的业务对象
- 使用后，由IoC容器“推”push 所依赖的业务对象
- 由pull到push的转变，即为反转控制

## Spring Ioc - BeanFactory
- 


## Bean Scope
- singleton: service这种逻辑处理类，无状态，通过参数与外部交互
- prototype: 需要保存状态，将状态保存为内部成员
- request: request请求，一个请求对应一个bean
- session
- global session



- IoC 容器启动阶段
  - 加载 Configuration Metadata
  - 解析&分析 Configuration Metadata
  - 创建 BeanDefinition
  - 其他 post processing

Spring提供了一种叫做BeanFactoryPostProcessor的容器扩展机制。该机制允许我们在容器实
例化相应对象之前，对注册到容器的**BeanDefinition**所保存的信息做相应的**修改**。

因为一个容器可能拥有多个BeanFactoryPostProcessor，这个时候可能需要实现类同时实现Spring的org.springframework.core.
Ordered接口，以保证各个BeanFactoryPostProcessor可以按照预先设定的顺序执行（如果顺序紧
要的话）。

- Bean 实例化阶段
  - 实例化对象
  - 装配依赖
  - 生命周期回调
  - 对象其他处理
  - 注册回调接口

BeanPostProcessor 可处理标记接口实现类，或者为当前对象提供代理实现。



