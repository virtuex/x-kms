# X-KMS密钥管理系统
> 前端页面移步：https://github.com/virtuex/x-kms-frontend
- 基于BouncyCastle
- 密钥保护：生成KMS的Master Key ，系统所有存储的密钥由Master Key保护
- 密钥不落地：所有的密钥均不允许导出，所有运算使用密钥对应的索引进行运算
## 模块设计
### 池化
- 随机数池
### 密钥管理
- 版本控制
#### 对称密钥
- RSA
- SM2
#### 非对称密钥
- AES
- DES

### Master Key

### 加解密
- 对称
  - AES
  - DES
  - SM4
- 非对称
  - RSA
  - SM2

### 摘要
- MD
- SHA
- SM3
- HMAC

###  签名验签
- RSA
- SM2

## 接口设计
> 接口设计参考[Apache Ranger](http://ranger.apache.org/)
- /v1/keys                                    POST
- /v1/key/{name}                              DELETE GET POST
- /v1/keys/metadata                           GET
- /v1/keys/names                              GET   
- /v1/keyversion/{versionName}                GET
- /v1/key/{name}/_currentversion              GET
- /v1/key/{name}/_eek                         GET
- /v1/key/{name}/_metadata                    GET
- /v1/key/{name}/_versions                    GET
- /v1/keyversion/{versionName}/_eek           POST

## 数据库设计