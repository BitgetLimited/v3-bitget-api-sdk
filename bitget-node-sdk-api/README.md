# bitget-node-sdk-api

## 使用说明

本SDK开发环境为v10.15.3，TypeScript(tsc)版本为3.9.7  
依赖axios作为网络请求库，需要时可参阅 [官方文档](https://github.com/axios/axios)  


```bash
git clone https://github.com/BitgetLimited/v3-bitget-api-sdk.git
cd v3-bitget-api-sdk/bitget-node-sdk-api
npm install
npm build
```

- __test__目录存放相关测试用例，SDK调用方式可以参考  
- build目录存放CommonJS规范模块输出，需要其他规范可自行修改tsconfig.json进行编译  
- doc目录存放使用typedoc工具自动生成的类型声明文档(HTML版)

本SDK基于 [api文档](https://bitgetlimited.github.io/apidoc/zh/swap/#25e54147de) 实现