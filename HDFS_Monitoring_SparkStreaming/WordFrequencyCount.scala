package streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object WordFrequencyCount {

  def main(args: Array[String]): Unit = {
    // Creating a Spark configuration and streaming context with a 3-second batch interval
    val conf = new SparkConf().setAppName("HDFSWordCountStreaming").setMaster("local[*]")
    val ssc = new StreamingContext(conf, Seconds(3))


    ssc.checkpoint(".")

    // Defining input  and output directory as argument
    val inputDirectory = args(0)
    val outputDirectory = args(1)


    val lines = ssc.textFileStream(inputDirectory)

    // Task A: Processing lines to retain words with only alphabetic characters and removing short words (< 3 characters)
    val filteredWords = lines.flatMap(line => line.split(" "))
      .filter(word => word.matches("[a-zA-Z]+") && word.length >= 3)


    val wordCounts = filteredWords.map(word => (word, 1)).reduceByKey(_ + _)


    var taskACounter = 1


    wordCounts.foreachRDD { rdd =>
      if (!rdd.isEmpty()) {
        val outputPath = s"$outputDirectory/taskA-${"%03d".format(taskACounter)}"
        rdd.saveAsTextFile(outputPath)
        taskACounter += 1
      }
    }

    // Task B: Counting co-occurrence frequency of words in the same line
    val coOccurrence = lines.flatMap { line =>
      val words = line.split(" ").filter(word => word.matches("[a-zA-Z]+") && word.length >= 3)
      for {
        word1 <- words
        word2 <- words if word1 != word2
      } yield (s"$word1 $word2", 1)
    }.reduceByKey(_ + _)


    var taskBCounter = 1


    coOccurrence.foreachRDD { rdd =>
      if (!rdd.isEmpty()) {
        val outputPath = s"$outputDirectory/taskB-${"%03d".format(taskBCounter)}"
        rdd.saveAsTextFile(outputPath)
        taskBCounter += 1
      }
    }

    // Task C: Defining the update function for co-occurrence counts
    val updateFunc = (newValues: Seq[Int], runningCount: Option[Int]) => {
      val newCount = runningCount.getOrElse(0) + newValues.sum
      Some(newCount)
    }

    // Applying updateStateByKey with the updateStateByKey function
    val cumulativeCoOccurrence = coOccurrence.updateStateByKey(updateFunc)


    var taskCCounter = 1


    cumulativeCoOccurrence.foreachRDD { rdd =>
      if (!rdd.isEmpty()) {
        val outputPath = s"$outputDirectory/taskC-${"%03d".format(taskCCounter)}"
        rdd.saveAsTextFile(outputPath)
        taskCCounter += 1
      }
    }


    ssc.start()
    ssc.awaitTermination()
  }
}