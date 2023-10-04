# Replace Type Code With Subclasses

````
function createEmployee(name, type) {
    return new Employee(name, type)
} 

    |
    |
    v

function createEmployee(name, type) {
    switch (type) {
        case "enginerr": return new Engineer(name);
        case "salesman": return new Salesman(name);
        case "manager": return new Manager(name);
    }
}
````

## Motivation

软件系统经常需要表现“相似但又不同的东西”，比如员工可以按职位分类（工程师，经理，销售），订单可以按优先级分类（常规，加急）。  
表现分类关系的第一种工具是 `type code` - 根据具体的编程语言，可以实现为枚举，符号，字符串或者数字。 
类型码的取值经常来自给系统提供数据的外部服务。

大多数时候，有这样的类型码就够了。但也有些时候，我可以再多往前一步，引入 `subclasses` 。
继承有两个诱人之处：
- 首先，你可以用多态来处理条件逻辑。如果有**多个函数**都在根据类型码的值采取不同的行为，多态就显得特别用用。 
引入子类后，我就可以用 `以多态取代条件表达式` 来处理这些函数。
- 另外，有些字段或者函数只对特定的类型码才有意义，例如“销售目标”只对“销售”这类员工才有意义。
此时我可以创建子类，然后用 `字段下移` 把这样的字段放到合适的子类中去，以更准确的表达数据与类型之间的关系。

在使用以子类取代类型码时，我需要考虑一个问题：应该直接处理携带类型码的这个类，还是应该处理类型码本身呢？  
**以前面的例子来说，我是应该让“工程师”成为“员工”的子类？还是应该在“员工”类包含“员工类别”属性，再从“员工类别”继承出“工程师”和“经理”等子类型呢？**
需要考虑几点：
- 直接的子类继承比较简单，但职位类别就不能用在其他场合了。
- 另外，如果员工的类别是可以改变的，那么也不能使用直接继承的方案。
- 如果想在“员工类别”之下创建子类，可以运用 `以对象取代基本类型` 把类型码包装成“员工类别”类，然后对其使用 `以子类取代类型码`。


## Samples

````
// 直接继承
class Employee {}

class Enginerr extends Employee {}
class Salesman extends Employee {}
class Manager extends Employee {} 

            
// 直接继承: 组合 + 继承（在其成员上使用）
class Employee {
    private EmployeeType employeeType;
} 

class EmployeeType {}

class Enginerr extends EmployeeType {}
class Salesman extends EmployeeType {}
class Manager extends EmployeeType {}

````
