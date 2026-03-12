# gold_study

Java でサンプルプログラムを作成・実行・デバッグするための Gradle 構成を用意しました。

## 前提

- JDK 21
- Gradle 8.x（または同梱 Wrapper）

## 構成

```
build.gradle
settings.gradle
src/main/java/com/goldstudy/App.java
src/main/java/com/goldstudy/InputReader.java
src/main/java/com/goldstudy/Greeter.java
.vscode/launch.json
```

## 実行手順（PowerShell, Gradle Wrapper 推奨）

```powershell
cd c:\repo\gold_study
.\gradlew.bat run
```

入力・出力例:

```text
名前を入力してください: Taro
こんにちは、Taroさん! Javaサンプルへようこそ。
```

## VS Code でデバッグ

1. Java Extension Pack を有効化
2. `Run and Debug` から `Debug Gold Study App` を選択
3. `App.java` などにブレークポイントを置いて実行
