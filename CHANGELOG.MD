# CHANGELOG

## 2.0.0

todo

更新日志：

- todo

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 2.0.0-RC3

从该版本开始，运行混淆会自动创建一个 `jar-obf-lib` 目录

用户如果遇到报错，可以将混淆 `jar` 需要的依赖 `jar` 放入该目录解决报错问题

更新日志：

- [重要] 解决某些情况下需要正确依赖才能运行的 `BUG` @4ra1n
- [BUG] 修复了某些空指针问题 @TheXeler
- [优化] 字符串加密功能对 `Java 6` 的支持 @4ra1n
- [优化] 自定义类加载器逻辑优化 @4ra1n
- [优化] 开启 `debug` 日志时输出更多混淆过程 @4ra1n
- [其他] 完善的 `CI` 测试确保功能稳定 @4ra1n
- [其他] 升级依赖到最新 @4ra1n
- [其他] 代码添加 `LICENSE` 信息 @4ra1n

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)
- TheXeler (https://github.com/TheXeler)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 2.0.0-RC2

更新日志：

- [重要] 开启配置 `useSpringBoot` 初步支持 `SpringBoot` 混淆
- [重要] 开启配置 `useWebWar` 初步支持 `war` 包混淆
- [优化] 优化 `jar` 压缩代码兼容 `SpringBoot` 等禁用压缩环境

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 2.0.0-RC1

jar-obfuscator v2 初版 RC1 发布（非正式 仅供测试）

主要更新内容：简化配置和文档，删除某些不必要的功能，尽可能简化，更多功能日后更新

目前 `README.md` 和所有代码已经变更，如果有 `v1` 版本需求可以在 `release` 下载历史代码

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.2.0

支持了 `GUI` 界面，但没有过多测试，之后逐步完善

解决了目标代码写法存在 `class.getResource("/dir/")` 时得到 `null` 的问题，这是最终打包 `JAR` 部分的代码问题

更新日志：

- [重要] 支持 `GUI` 界面（beta）  
- [功能] 字符串替换时处理反射字符串类名
- [功能] 添加对泛型 `signature` 的处理
- [优化] 优化 `builtin` 黑名单解析和注释
- [BUG] 修复 `NATIVE` 的 `malloc` 错误
- [BUG] 修复没有添加目录到 `JAR ENTRY` 的问题
- [BUG] 花指令混淆部分遇到类加载报错解决
- [BUG] 修复 `MANIFEST.MF` 没有完全修改的问题

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)
- pcdlrzxx (https://github.com/pcdlrzxx)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.1.1

更新日志：

- [功能] 花指令数添加简单的控制流
- [功能] 花指令从单 `int` 类型拓展到更多
- [功能] 花指令支持添加无意义的垃圾方法
- [优化] 不应该对接口和枚举等类型进行花指令
- [优化] 优化命令行输出的信息
- [其他] 在 `CI` 增加 `Gitleaks` 检查
- [其他] 提供 `Dockerfile` 和构建脚本

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.1.0

修复了一些已知问题，随机数支持直接调用 `CPU` 的 `RDRAND` 指令生成

注意，配置文件可能不兼容，请重新生成

更新日志：

- [功能] 支持配置随机数来源为 `CPU` 的 `RDRAND` 指令
- [功能] 类黑名单新增正则配置 `classBlackRegexList`
- [功能] 对于错误和默认的 `AES KEY` 配置自动生成随机的
- [BUG] 不应该对 `JNI` 类进行混淆
- [BUG] 处理错误配置文件可能导致的异常

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.8-beta

修复了某些配置的 `BUG` 并参考 `Y4tacker` 议题提供隐藏功能

注意，配置文件可能不兼容，请重新生成

更新日志：

- [功能] 通过添加 `SYNTHETIC` 使反编译时可以隐藏方法
- [功能] 通过添加 `SYNTHETIC` 使反编译时可以隐藏字段
- [功能] 解决报错并支持高版本 `JAVA` 的字节码加密功能
- [BUG] 修复了开启包名混淆但不开启类名混淆无法生效的问题
- [BUG] 不允许开启 `enablePackageName` 时使用字节码加密

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)
- pcdlrzxx (https://github.com/pcdlrzxx)
- Y4tacker (https://github.com/Y4tacker)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.7-beta

更新日志：

- [功能] 记录贡献者列表并在启动时打印感谢信息
- [功能] 增加一个新参数仅检查是否有新版本
- [BUG] 修复花指令混淆功能某些情况抛出的异常
- [优化] 错误的配置会在启动时输出原因并停止
- [优化] 调整 `JNI` 日志级别减少无用信息
- [优化] 检查字节码加密的 `Java 8` 环境

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)
- pcdlrzxx (https://github.com/pcdlrzxx)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.6-beta

内置 `父类/接口->方法` 的映射黑名单，阻止某些 `@Override` 方法的混淆

注意，配置文件可能不兼容，请重新生成

更新日志：

- [功能] 内置黑名单阻止某些类的继承/实现方法混淆
- [功能] 启动时请求 `OSS` 检测是否有新版本可用
- [功能] 字符串解密类的类名方法名可以配置
- [功能] 优化命令行输出并允许彩色输出

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.5-beta

不建议开启 `enableMethodName` 配置，建议其他选项混合搭配测试

更新日志：

- [BUG] 修复方法名混淆可能遇到的关键 `BUG`
- [BUG] 方法 `OWNER` 和 `DESC` 替换不完善 
- [优化] 优化启动提示和日志提示信息
- [优化] 进一步优化依赖缩小 `JAR` 包体积
- [优化] 优化 `README` 文档提供更多配置教程

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.4-beta

修复关键 `BUG` 并完善配置文件注释和文档。之前的版本不开启类名混淆时，无法单独使用其他混淆方法。混淆配置有很多选项，其中部分配置会分析依赖和引用并修改，可能出现预期外的行为。另外有多种不修改引用的混淆方式，例如字符串加密和异或加密整数，可以单独搭配使用这些不修改引用的混淆方式

注意，配置文件可能不兼容，请重新生成

更新日志：

- [BUG] 字符串加密编码不一致导致乱码问题
- [BUG] 修复不开启类名混淆某些混淆无法运行问题
- [BUG] 修复解压 `JAR` 时无法访问文件的问题
- [优化] 优化 `README` 和配置文件中的注释
- [优化] 提示 `MAC` 中不支持使用字节码加密

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.3-beta

修复了一些 `BUG` 补全配置文件和文档

注意，配置文件可能不兼容，请重新生成

更新日志：

- [功能] 增加混淆类黑名单（具体内容参考配置注释）
- [功能] 增加混淆项目根包名配置（具体内容参考配置注释）
- [BUG] 修复混淆时引用处理的错误
- [BUG] 修复 `module-info` 导致的报错
- [BUG] 解压 `JAR` 文件可能存在报错终止
- [BUG] 字符串加密处理的过程设置正确的 `flag`
- [优化] 优化各种黑名单和配置选项的逻辑
- [文档] 完善 `README` 中的实战配置文档

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.2-beta

注意，配置文件可能不兼容，请重新生成

更新日志：

- [功能] 混淆指令使用简单的随机生成
- [功能] 字符串加密的 `AES KEY` 可以配置 
- [功能] 允许配置临时目录是否自动删除
- [优化] 花指令级别更细致的级别划分
- [优化] 处理可能的 `MethodTooLargeException`
- [优化] 删除无意义代码逻辑提高效率
- [NATIVE] 解密字节码时不应该打印过多敏感信息

感谢以下用户的贡献:

- 4ra1n (https://github.com/4ra1n)

可供下载的文件由 `Github Actions` 构建，使用 `java -jar` 启动

## 0.0.1-beta

初始版本（非稳定版本，测试有 BUG 欢迎反馈）