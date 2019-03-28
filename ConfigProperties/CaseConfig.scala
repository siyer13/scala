package com.siyer.config

case class Database(database: DatabaseType)

case class DatabaseType(val sap: DatabaseConfig, val oracle: DatabaseConfig)

case class DatabaseConfig(url: String,
                          driver: String,
                          username: String,
                          password: String,
                          srcDir: String,
                          targetDir: String)
