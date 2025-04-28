-- Loading the CSV files from HDFS input directory
noc_region = LOAD '/input/noc_region.csv' USING PigStorage(',') AS (id:int, noc:chararray, region_name:chararray);

person = LOAD '/input/person.csv' USING PigStorage(',') AS (id:int, full_name:chararray, gender:chararray, height:int, weight:int);

person_region = LOAD '/input/person_region.csv' USING PigStorage(',') AS (person_id:int, region_id:int);

competitor_event = LOAD '/input/competitor_event.csv' USING PigStorage(',') AS (event_id:int, competitor_id:int, medal_id:int);

medal = LOAD '/input/medal.csv' USING PigStorage(',') AS (id:int, medal_name:chararray);

-- Filtering only Gold and Silver medals
gold_medals = FILTER medal BY medal_name == 'Gold';
silver_medals = FILTER medal BY medal_name == 'Silver';

-- Joining competitors to their medal types
competitor_gold = JOIN competitor_event BY medal_id, gold_medals BY id;
competitor_silver = JOIN competitor_event BY medal_id, silver_medals BY id;

-- Joining competitors to their person details
competitor_goldperson = JOIN competitor_gold BY competitor_event::competitor_id, person BY id;
competitor_silverperson = JOIN competitor_silver BY competitor_event::competitor_id, person BY id;

-- Joining the competitors with the region details
gold_with_region = JOIN competitor_goldperson BY person::id, person_region BY person_id;
silver_with_region = JOIN competitor_silverperson BY person::id, person_region BY person_id;

-- Joining with the noc_region to get region names
gold_with_regionname = JOIN gold_with_region BY person_region::region_id, noc_region BY id;
silver_with_regionname = JOIN silver_with_region BY person_region::region_id, noc_region BY id;

-- Grouping by region name for number of Gold medals
grouped_gold = GROUP gold_with_regionname BY noc_region::region_name;
gold_medal_count = FOREACH grouped_gold GENERATE group AS region, COUNT(gold_with_regionname) AS gold_count;

-- Group by region name to count the number of Silver medals
grouped_silver = GROUP silver_with_regionname BY noc_region::region_name;
silver_medal_count = FOREACH grouped_silver GENERATE group AS region, COUNT(silver_with_regionname) AS silver_count;

-- Left join gold and silver counts together by region
gold_silver_counts = JOIN gold_medal_count BY region LEFT OUTER, silver_medal_count BY region;

-- Creating the final output
final_output = FOREACH gold_silver_counts GENERATE
    gold_medal_count::region AS region,
    gold_medal_count::gold_count AS gold,
    silver_medal_count::silver_count AS silver;

-- Sorting the final output by gold count -descending and region name -ascending
sorted_output = ORDER final_output BY gold DESC, region ASC;

-- Store the result in the HDFS output directory
STORE sorted_output INTO '/output/task2-1' USING PigStorage('\t');
