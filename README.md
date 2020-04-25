<!-- TOC -->

- [gobig-serve](#gobig-serve)
- [关于](#%E5%85%B3%E4%BA%8E)
- [技术栈](#%E6%8A%80%E6%9C%AF%E6%A0%88)
    - [数据库](#%E6%95%B0%E6%8D%AE%E5%BA%93)
    - [后端](#%E5%90%8E%E7%AB%AF)
    - [服务器](#%E6%9C%8D%E5%8A%A1%E5%99%A8)
- [结构、功能与实现](#%E7%BB%93%E6%9E%84%E5%8A%9F%E8%83%BD%E4%B8%8E%E5%AE%9E%E7%8E%B0)
    - [目录结构](#%E7%9B%AE%E5%BD%95%E7%BB%93%E6%9E%84)
    - [功能](#%E5%8A%9F%E8%83%BD)
- [文档完善中······](#%E6%96%87%E6%A1%A3%E5%AE%8C%E5%96%84%E4%B8%AD%C2%B7%C2%B7%C2%B7%C2%B7%C2%B7%C2%B7)

<!-- /TOC -->

# gobig-serve
 spring + springMVC + mybatis + maven + tomcat
 包括管理信息系统、用户评论、视频展示、相关搜索、用户登录、视频播放等功能的视频点播分享网站的后端实现

# 关于
1. 作者
本人是一个即将从大学毕业的学生，因为毕业论文的要求，开始制作gobig项目。不仅是对自己大学学习的总结，也是学习新的知识的实践。

2. gobig
- gobig是一个以视频点播、分享为主的网站。整体分为主站（[gobig-front-end](https://github.com/SHGgo/gobig-front-end)）、小程序（[gobig-mini](https://github.com/SHGgo/gobig-front-end)）、后台管理系统（[gobig-admin](https://github.com/SHGgo/gobig-front-end)）、后端开发（[gobig-serve](https://github.com/SHGgo/gobig-serve)）四个方面。
- 因为作者自己对[bilibili](https://www.bilibili.com/)的喜爱，所以主站和小程序的UI、页面逻辑和功能实现等很多方面借鉴了b站，这里非常感谢b站。
- ***gobig是作者第一次独立开发完整项目，期间有很多bug和功能没有及时完善，敬请见谅。***

3. gobig-serve
- gobig-serve是gobig项目的后端。因为gobig整体采用前后端分离的MVVM模式，所以gobig-serve的任务是向各个前端平台提供接口、处理数据、返回数据，不参与页面逻辑的控制。

# 技术栈

## 数据库
- Mysql
版本：8.0.13
一个关系型数据库管理系统
免费开源、易安装操作、适合中小型项目
- Navicat
一套数据库管理工具
易安装操作、功能丰富

## 后端
1. 语言：
- java 
版本：1.8
成熟、安全、稳定、生态丰富、学习资料丰富
2. 框架
- spring / springMVC / mybatis
开源框架，成熟的web后端解决方案
成熟稳定、学习资料丰富、功能强大、支持MVVM
3. 工具和中间件
- Maven
构建和管理Java相关项目的工具
选择理由：
1、相同的项目结构。当你使用其他maven类型项目时，可以迅速上手。
2、统一维护jar包。不用再上网搜寻项目所用的包依赖，配置好数据源，可以快速安装、修改包版本。
- intellij idea
java编程语言开发的集成环境
4. 其他
- jackson
基于Java平台的一套数据处理工具
处理前后端数据交换的json，支持spring
- jwt
跨域身份验证解决方案
- DruidDataSource
阿里巴巴开源平台上一个数据库连接池

## 服务器
- tomcat
版本：9.0
- nginx
- 宝塔linux

# 结构、功能与实现

## 目录结构
![目录结构](https://img-blog.csdnimg.cn/202004251728581.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxNzg1OTIy,size_16,color_FFFFFF,t_70)

## 功能
这里的controller，很好地体现了gobig-serve的六个功能分区：**后台信息系统、评论、首页、搜索、用户、视频**。
1. 后台信息系统
管理员登录、管理员退出、获取管理员相关信息
2. 首页
获取多个随机的视频、获取多个随机分类的视频、获取视频分类信息
3. 用户
用户注册、用户登录、确认登录状态、增删查改用户信息、获取用户视频收藏信息、上传用户头像
4. 视频
增删查改视频信息、获取用户视频、获取分类视频、获取排行榜视频信息、上传视频文件
6. 搜索
关键字查询视频信息、关键字查询用户信息

# 文档完善中······



