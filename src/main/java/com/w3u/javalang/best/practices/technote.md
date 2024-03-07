# TechNotes

- There is no object-oriented problem that cannot be resolved by adding a layer of indirection, except, of course, too many layers of indirection.


## 定义 Restful API
- API 签名
  - 名字 和 参数 要有意义
  - 确定 request method(Get/Post/Put...)
  - 确定如何提供参数(Params/PathVariable/RequestBody...)，Nullable？Optional？
- logging input参数 和 output。
- 确定http code返回码，不要混用code

Note that-  
可以使用AOP来去除重复代码，比如通过AOP来记录输入和返回值。
或者统一处理http code，从而无需在每个方法里重复定义如何返回http code。
 
## 集成 Restful API

- log API的使用，API 名，参数，返回等
- 针对不同的http code定义不同的handling。
