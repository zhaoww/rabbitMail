# rabbitMail
rabbitmq 用户注册简单实例。仅个人学习参考 场景：[四种场景](https://blog.csdn.net/cws1214/article/details/52922267)

大体流程：用户注册后，先录入数据库，然后录入消息队列，邮件、短信异步读取队列 发送。

以下步骤省略：
1. 录入数据库
1. 邮件、短信的实现 springboot整合邮件可查看本人[weatherPush](https://github.com/zhaoww/weatherPush)项目
