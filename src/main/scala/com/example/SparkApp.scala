package com.example

import org.apache.spark.sql.SparkSession

object SparkApp extends App {
  implicit val spark: SparkSession = SparkSession
    .builder
    .master("local")
    .appName("example-app")
    .getOrCreate()
  import spark.implicits._

  //your code starts here


}
