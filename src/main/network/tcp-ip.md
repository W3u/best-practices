# TCP/IP

TCP/IP (Transmission Control Protocol/Internet Protocol) 模型是网络通信的协议模型，它由四层组成：应用层、传输层、网络层和数据链路层。
- 应用层（Application Layer）：
  - 类似于OSI模型的应用层，TCP/IP应用层负责处理特定的应用程序协议，如HTTP、FTP、SMTP、DNS等，这些协议直接与用户交互或提供网络服务。
- 传输层（Transport Layer）：
  - 这一层的主要任务是提供端到端的可靠数据传输。TCP（传输控制协议）和UDP（用户数据报协议）是这一层的两个主要协议。TCP提供面向连接、可靠的服务，而UDP则是无连接、不可靠的。
- 网络层（Network Layer）：
  - 相当于OSI模型的网络层，网络层处理数据包的路由选择和网络互连。IP（Internet Protocol）是这一层的核心协议，负责数据包的寻址和在网络中的传输。
- 链路层（Link Layer）：
  - 包含了OSI模型的数据链路层和物理层的部分功能，负责在相邻节点间传输数据帧，包括错误检测、帧的封装和解封装、介质访问控制等。常见的协议有Ethernet、PPP、WLAN（无线局域网）等


## TCP
TCP（Transmission Control Protocol）的三次握手（Three-Way Handshake）是建立可靠连接的过程，确保双方都有能力接收和发送数据。以下是三次握手的详细步骤：

- 第一次握手（SYN）：
  - 客户端（Client）想要与服务器（Server）建立连接，首先发送一个TCP报文，其中的SYN（Synchronize Sequence Numbers）标志位被置1。同时，客户端会随机选择一个初始序列号ISN（Initial Sequence Number）发送给服务器，并进入SYN_SENT状态。
  
- 第二次握手（SYN+ACK）：
  - 服务器接收到客户端的SYN报文后，如果同意连接，会回应一个TCP报文，同样设置SYN标志位，并且确认客户端的序列号（即回应的ACK标志位被置1，确认号是客户端ISN加1）。服务器也会选择自己的ISN发送给客户端，并进入SYN_RECEIVED状态。
  
- 第三次握手（ACK）：
  - 客户端收到服务器的SYN+ACK报文后，会发送一个仅带有ACK标志位的TCP报文，确认号是服务器的ISN加1，表明客户端已经收到了服务器的SYN报文。客户端进入ESTABLISHED状态。当服务器接收到这个确认报文后，也进入ESTABLISHED状态，此时双方建立了完全的TCP连接。
  
三次握手的目的是**确保双方都具备发送和接收能力**，防止“已死”的主机或网络节点占用资源。同时，通过序列号和确认号的交换，双方可以确定彼此的初始序列号，为后续的数据传输奠定基础。