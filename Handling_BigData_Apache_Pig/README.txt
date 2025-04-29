Task1

hadoop fs -mkdir /input
hadoop fs -put competitor_event.csv /input/
hadoop fs -put medal.csv /input/
hadoop fs -put noc_region.csv /input/
hadoop fs -put person_region.csv /input/
hadoop fs -put person.csv /input/

** Execution ** 

pig -x mapreduce task1.pig


Task2-1

hadoop fs -rm -r /output --> removing the current ouput

** Execution **

pig -x mapreduce task2-1.pig


Task2-2

hadoop fs -rm -r /output --> removing the current ouput

** Execution **

pig -x mapreduce task2-2.pig

 
