import org.apache.spark
import org.apache.spark.{SparkConf, SparkContext}

object firstdemo {
  def main(args:Array[String]) : Unit = {
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    var conf = new SparkConf().setMaster("local[*]").setAppName("Spark in Scala")
    var sc = new SparkContext(conf)
    var rdd = sc.parallelize(Array(5, 10, 30))
    println(rdd.reduce(_+_))


  }
}
