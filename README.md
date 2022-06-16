# SpringBoot_Schedule

Cron Expression       |             Meaning
--------------------- | --------------------------------------------------
 0 0 * * * *          | Top of every hour of every day
*/10 * * * * *        | Every ten seconds
0 0 8-10 * * *        | 8, 9 and 10 o’clock of every day
0 0 6,19 * * *        | 6:00 AM and 7:00 PM every day
0 0/30 8-10 * * *     | 8:00, 8:30, 9:00, 9:30, 10:00 and 10:30 every day
0 0 9-17 * * MON-FRI  | On the hour nine-to-five weekdays
0 0 0 25 12 ?         | Every Christmas Day at midnight
