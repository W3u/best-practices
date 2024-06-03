

在强调“面向接口编程”的同时，有一点需要注意：虽然对象可以通过声明接口来避免对特定接
口实现类的过度耦合，但总归需要一种方式将声明依赖接口的对象与接口实现类关联起来。否则，只
依赖一个不做任何事情的接口是没有任何用处的。

```java
public class Foo
{
    private BarInterface barInstance;
    
    public Foo()
    {
        // 我们应该避免这样做
        // instance = new BarInterfaceImpl(); 5
    } 
    // ...
}
```

如果该类是由我们设计并开发的，那么还好说，我们可以通过依赖注入，让容器帮助我们解除接
口与实现类之间的耦合性。但是，有时，我们需要**依赖第三方库**，需要实例化并使用第三方库中的相
关类，这时，接口与实现类的耦合性需要其他方式来避免。

通常的做法是通过使用**工厂方法（ Factory Method）模式**，提供一个工厂类来实例化具体的接口
实现类，这样，**主体对象只需要依赖工厂类，具体使用的实现类有变更的话，只是变更工厂类，而主
体对象不需要做任何变动**。

```java
public class Foo
{
    private BarInterface barInterface;
    
    public Foo()
    {
        // barInterface = BarInterfaceFactory.getInstance();
    }
}

```