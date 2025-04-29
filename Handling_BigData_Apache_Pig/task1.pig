-- Loading the CSV files from HDFS input directory
noc_region = LOAD '/input/noc_region.csv' USING PigStorage(',') AS 
(id:int, noc:chararray, region_name:chararray);
person = LOAD '/input/person.csv' USING PigStorage(',') AS (id:int, 
full_name:chararray, gender:chararray, height:int, weight:int);
person_region = LOAD '/input/person_region.csv' USING PigStorage(',') AS 
(person_id:int, region_id:int);
competitor_event = LOAD '/input/competitor_event.csv' USING 
PigStorage(',') AS (event_id:int, competitor_id:int, medal_id:int);
medal = LOAD '/input/medal.csv' USING PigStorage(',') AS (id:int, 
medal_name:chararray);

-- Filtering only gold medals
gold_medals = FILTER medal BY medal_name == 'Gold';

-- Joining for  competitors who won gold medals
competitor_gold = JOIN competitor_event BY medal_id, gold_medals BY id;

-- Joining for getting  regions associated with these competitors
competitor_region = JOIN competitor_gold BY
competitor_event::competitor_id, person BY id;

-- Joining to get the region details
person_region_joined = JOIN competitor_region BY person::id,
person_region BY person_id;

-- Getting the actual region names from noc_region
region_gold_medals = JOIN person_region_joined BY 
person_region::region_id, noc_region BY id;

-- Group  data by region name
grouped_region = GROUP region_gold_medals BY noc_region::region_name;

--  number of gold medals per region
gold_medal_count = FOREACH grouped_region GENERATE group AS region,
COUNT(region_gold_medals) AS gold_count;

-- Order  by gold medal count in descending order
sorted_gold_medal_count = ORDER gold_medal_count BY gold_count DESC;

-- Storing the sorted_gold_medal_count in the HDFS output directory
STORE sorted_gold_medal_count INTO '/output/task1' USING PigStorage('\t');

