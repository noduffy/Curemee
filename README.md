# Curemee アプリ開発プロジェクト
CuremeeとはCuration(情報を収集して整理する)+Meの造語であり、自分だけのニュースをまとめて管理できるサイトです。
このドキュメントは、Curemee アプリケーションの開発環境を構築・管理するためのガイドです。

## データベース環境の操作 (Docker)

このプロジェクトでは、Docker を使用して MySQL データベースを管理します。

### 1. データベースの起動
プロジェクトのルートディレクトリで以下のコマンドを実行し、MySQL コンテナをバックグラウンドで起動します。
```sh
docker compose up -d
```

### 2. データベースの停止
作業を終える際は、以下のコマンドでコンテナを停止します。
```sh
docker compose down
```

### 3. データベースへの接続
起動中の MySQL コンテナに接続するには、以下のコマンドを使用します。
`curemee_db` はデータベース名です。
```sh
docker compose exec db mysql -u root -proot_password curemee_db
```

### 4. データベースの完全なリセット
データベースのスキーマを変更したり、クリーンな状態からやり直したい場合は、以下のコマンドでボリュームを含めて完全にリセットします。
```sh
docker compose down
docker volume rm curemee_db_data
docker compose up -d
```
