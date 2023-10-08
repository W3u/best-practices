# Replace Subclass with Delegate

````
class Order {
    get daysToShip() {
        return this._warehouse.daysToShip;
    }
}

class PriorityOrder extends Order {
    get daysToShip() {
        return this._priorityPlan.daysToShip;
    }
}

    |
    |
    v

class Order {
    get daysToShip() {
        return (this._priorityDelegate)
            ? this._priorityDelegate.daysToShip
            : this._warehouse.daysToShip;
    }
}

class PriorityOrderDelegate {
    get daysToShip() {
        return this._priorityPlan.daysToShip;
    }
}

````

## Motivation

如果一个对象的行为有明显的类别之分，继承是很自然的表达方式。我可以把共用的数据和行为放在超类中，
每个子类根据需要覆写部分特性。在面向对象语言中，继承很容易实现，因此也是程序员熟悉的机制。

**但继承也有其短板:** 
- 最明显的是，继承这张牌只能打一次。**导致行为不同的原因可能有很多种，但继承只能用于处理一个方向上的变化。**
比如说，我可能希望“人”的行为根据“年龄段”不同， 并且根据“收入水平”不同。
使用继承的话，子类可以是“年轻人”和“老人”，也可以是“富人”和“穷人”，但不能实现两个方向的继承。

- **更大的问题在于，继承给类之间引入了非常紧密的关系。** 
在超类上做任何修改，都很可能破坏子类，所以我必修非常小心，并且充分理解子类如何从超类派生。
如果两个类的逻辑分处不同的模块，又不同的团队负责，问题就会更麻烦。

这两个问题都能用 `delegation` 解决。**对于不同的变化原因，我可以委托给不同的类。**
委托是对象之间常规的关系。与继承关系相比，**使用委托关系时接口更清晰，耦合更少。**
因此，继承关系遇到问题是运用 `以委托取代子类`是常见的情况。

有一条流行的原则：**“对象组合优于类继承”** （组合 和 委托是同一回事）。
可以从继承开始，如果开始出现问题，再转而使用委托。

熟悉《设计模式》的读者可以这样来理解本重构手法，就是用[State](../../../design/patterns/state/state.md)模式或者[Strategy](../../../design/patterns/strategy/strategy.md)模式取代子类。
这两个模式在结构上是相同的，都是**由宿主对象把责任委托给另一个继承体系**。
`以委托取代子类`并非总会需要建立一个继承体系来接受委托请求，不过建立一个状态或者策略的继承体系经常是有用的。


## Sample #1


## Sample #2