# bitget-java-sdk-api
A Java sdk for bitget exchange API

- Supported APIs:
  - /api/spot/v1/*
  - /api/mix/v1/*
  - Supports custom expansion of any URL

# Installation
- git clone https://github.com/BitgetLimited/v3-bitget-api-sdk.git
- mvn clean
- mvn install
- add sdk dependency to your project
```xml
 <dependency>
    <groupId>com.bitget.openapi</groupId>
    <artifactId>bitget-java-sdk-api</artifactId>
    <version>${you install version}</version>
 </dependency>
```

# SDK Run Example

Before running the examples, set up your apiKey、 secretKey and passphrase. <br/>
This configuration file is only used for examples. <br/>
## Add Config
```java
@Configuration
@EnableAsync
public class SdkConfig {

  private final String apiKey = "your apiKey";
  private final String secretKey = "your secretKey";
  private final String passphrase = "your passphrase";
  private final String baseUrl = "https://api.bitget.com";

  @Bean
  public BitgetRestClient bitgetRestClient() throws Exception {
    ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey) // 如果是RSA类型则设置为RSA私钥
            .passphrase(passphrase)
            .baseUrl(baseUrl)
            //.signType(SignTypeEnum.RSA) // 如果你的apikey是RSA类型则主动设置签名类型为RSA
            .locale(SupportedLocaleEnum.ZH_CN.getName()).build();
    return BitgetRestClient.builder().configuration(parameter).build();
  }
}
```

## Add dependencies 
```java
@Resource
private BitgetRestClient bitgetRestClient;
```

## Demo 1: place order
```java
Map<String, String> paramMap = Maps.newHashMap();
paramMap.put("symbol", "BTCUSDT_UMCBL");
paramMap.put("marginCoin", "USDT");
paramMap.put("side", "open_long");
paramMap.put("orderType", "limit");
paramMap.put("price", "27012.1");
paramMap.put("size", "0.01");
paramMap.put("timInForceValue", "normal");
ResponseResult result = bitgetRestClient.bitget().v1().mixOrder().placeOrder(paramMap);
System.out.println(JSON.toJSONString(result));
```

## Demo 2: send post request directly If the interface is not defined in the sdk
```java
Map<String, String> paramMap = Maps.newHashMap();
Map<String, String> paramMap = Maps.newHashMap();
paramMap.put("symbol", "BTCUSDT_UMCBL");
paramMap.put("marginCoin", "USDT");
paramMap.put("side", "open_long");
paramMap.put("orderType", "limit");
paramMap.put("price", "27012.1");
paramMap.put("size", "0.01");
paramMap.put("timInForceValue", "normal");
ResponseResult result = bitgetRestClient.bitget().v1().request().post("/api/mix/v1/order/placeOrder", paramMap);
System.out.println(JSON.toJSONString(result));
```

## Demo 3: send get request directly If the interface is not defined in the sdk
```java
Map<String, String> paramMap = Maps.newHashMap();
paramMap.put("symbol", "BTCUSDT_UMCBL");
paramMap.put("startTime", "1695632659703");
paramMap.put("endTime", "1695635659703");
ResponseResult result = bitgetRestClient.bitget().v1().request().get("/api/mix/v1/order/history", paramMap);
System.out.println(JSON.toJSONString(result));
```

## Other things to note 

## Base URL
It's recommended to pass in the `baseUrl` parameter.<br/>
If not provided, the default baseUrl is `https://api.bitget.com`<br/>


## Optional parameters

All parameters are read from a `HashMap<String,String>` object where `String` is the name of the parameter and `String` is the value of the parameter. 
The parameters should follow their exact naming as in the API documentation.<br>
```java
Map<String,String> paramMap = Maps.newHashMap();
paramMap.put("symbol","BTCUSDT_UMCBL");
paramMap.put("marginCoin","USDT");
paramMap.put("side","open_long");
paramMap.put("orderType","limit");
paramMap.put("price","27012.1");
paramMap.put("size","0.01");
paramMap.put("timInForceValue","normal");
```



# Websocket Run Example

## Demo 1: 
```java
public class BitgetWsClientTest {
  public static final String PUSH_URL = "wss://ws.bitget.com/spot/v1/stream"; // or wss://ws.bitget.com/mix/v1/stream
  public static final String API_KEY = "";
  public static final String SECRET_KEY = "";
  public static final String PASS_PHRASE = "";

  public static void main(String[] args) {
    BitgetWsClient client = BitgetWsHandle.builder()
            .pushUrl(PUSH_URL)
            .apiKey(API_KEY)
            .secretKey(SECRET_KEY) // 如果是RSA类型则设置RSA私钥
            .passPhrase(PASS_PHRASE)
            //.signType(SignTypeEnum.RSA) // 如果你的apikey是RSA类型则主动设置签名类型为RSA
            .isLogin(true)
            //默认监听处理，如订阅时指定监听，默认不再接收该channel订阅信息
            .listener(response -> {
              JSONObject json = JSONObject.parseObject(response);
              System.out.println("def:" + json);
              //失败消息的逻辑处理,如:订阅失败
            }).errorListener(response -> {
              JSONObject json = JSONObject.parseObject(response);
              System.out.println("error:" + json);
            }).build();

    List<SubscribeReq> list = new ArrayList<SubscribeReq>() {{
      add(SubscribeReq.builder().instType("SP").channel("candle1W").instId("BTCUSDT").build());
    }};
    client.subscribe(list);
  }
}
```