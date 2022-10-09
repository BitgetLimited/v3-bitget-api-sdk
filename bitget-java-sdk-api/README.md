# bitget-java-sdk-api
A Java sdk for bitget exchange API

# api sdk 使用说明
1. 在maven项目的pom.xml加入如下依赖
```xml

 <dependency>
    <groupId>com.bitget.openapi</groupId>
    <artifactId>bitget-java-sdk-api</artifactId>
    <version>1.0.1-SNAPSHOT</version>
 </dependency>
 
```

由于当前发布的是snapshot版,因此需要您在maven settings.xml或pom.xml中设置如下repository

```xml
   <repository> 
       <id>oss-sonatype</id>
       <url>https://oss.sonatype.org/content/groups/staging/</url>
       <releases>
           <enabled>true</enabled>
           <updatePolicy>always</updatePolicy>
       </releases>
       <snapshots>
           <enabled>true</enabled>
           <updatePolicy>always</updatePolicy>
       </snapshots>
   </repository>
                
```

2. 创建 BitgetRestClient

```java

    /**
     * 用户 apiKey，需用户填写，在 https://www.bitget.com 中创建apikey
     */
    String apiKey = "";
    /**
     * 用户 secretKey，需用户填写，在 https://www.bitget.com/user  api 中获取
     */
    String secretKey = "";
    /**
     * 口令，需用户填写，在 https://www.bitget.com/user  api 中获取（创建时由用户设定）
     */
    String passphrase = "";
    /**
     * open api 根路径
     */
    String baseUrl = "http://127.0.0.1:8081/api/swap/v3/";

    ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey)
            .passphrase(passphrase)
            .baseUrl(baseUrl)
            .build();

    bitgetRestClient bitgetClient = bitgetRestClient.builder()
                .configuration(parameter)
                .build();

```
3. 接口调用
- 创建 bitgetClient 后便可以调用服务接口，以获取币对信息为例
```java

ServerTime serverTime = this.bitgetClient.contract().market().getTime()

```

- 其他接口调用参照测试用例，另外由于bitget-java-sdk-api使用了lombok,请在编译器中安装lombok插件
