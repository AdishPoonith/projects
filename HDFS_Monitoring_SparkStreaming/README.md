---Big Data Assignment 3 (HDFS Monitoring via Spark Streaming)---

** Creating Drectories **

hadoop fs -mkdir /input      {arg(0)}
hadoop fs -mkdir /output     {arg(1)}




** Making sure we have two hadoop terminal open **

-Terminal 1 for HDFS Monitoring
-Terminal 2 for putting the file and viewing the output 



** Running the spark-streaming command ** --Terminal 1

spark-submit --class streaming.WordFrequencyCount --master yarn --deploy-mode client Spark_Streaming.jar hdfs:///input hdfs:///output 



** Placing the text file to the input directory ** --Terminal 2

hadoop fs -put Text.txt /input


**Note**
The Spark_Streaming jar file is safe copied from the jumphost to the hadoop home directory and is place there.

scp -i ~/s3970304-cosc2637.pem ~/Spark_Streaming.jar hadoop@s3970304.emr.cosc2637.route53.aws.rmit.edu.au:~/


