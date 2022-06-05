## 1.写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 GitHub。
### &emsp;&emsp;[XML方式和java代码显示装配](https://github.com/hafizgoo/Geek5Work/blob/main/springstart/src/main/java/com/hafizgoo/springstart/bean/UserTest.java)
### &emsp;&emsp;[自动装配](https://github.com/hafizgoo/Geek5Work/blob/main/springstart/src/main/java/com/hafizgoo/springstart/bean/CDTest.java)
## 2.给前面课程提供的 Student/Klass/School 实现自动配置和 Starter。
###    &emsp;&emsp; [学校自动配置类](https://github.com/hafizgoo/Geek5Work/blob/main/schooolstart/src/main/java/com/hafizgoo/schooolstart/SchoolAutoConfiguration.java)
###    &emsp;&emsp; [学校属性类](https://github.com/hafizgoo/Geek5Work/blob/main/schooolstart/src/main/java/com/hafizgoo/schooolstart/SchoolProperties.java)
###    &emsp;&emsp; [测试类](https://github.com/hafizgoo/Geek5Work/blob/main/schooolstart/src/test/java/com/hafizgoo/schooolstart/MySchoolTest.java)
## 3.研究一下 JDBC 接口和数据库连接池，掌握它们的设计和用法：
### &emsp;&emsp;（1）使用 JDBC 原生接口，实现数据库的增删改查操作。
#### &emsp;&emsp;&emsp;  [JDBC 原生接口](https://github.com/hafizgoo/Geek5Work/blob/main/springstart/src/main/java/com/hafizgoo/springstart/jdbc/JdbcUserDao.java)
### &emsp;&emsp;（2）使用事务，PrepareStatement 方式，批处理方式，改进上述操作。
####  &emsp;&emsp;&emsp;   [PrepareStatement批处理](https://github.com/hafizgoo/Geek5Work/blob/main/springstart/src/main/java/com/hafizgoo/springstart/jdbc/JdbcBatchUserDao.java)
### &emsp;&emsp;（3）配置 Hikari 连接池，改进上述操作。提交代码到 GitHub。
####    &emsp;&emsp;&emsp;  [Hikari 连接池](https://github.com/hafizgoo/Geek5Work/blob/main/springstart/src/main/java/com/hafizgoo/springstart/jdbc/HikariConnection.java)
