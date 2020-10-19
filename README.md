# babysitter
The purpose of this file was to create a babysitter application that would calculate what the babysitter was owed at the end of the day. 

I created a main file that called the getter and setter in the AmountPaid.java file - this calculates the amount owed to the babysitter at the end of the day. Bedtime wasn’t established so I took the liberty to set it at 10:00PM.

For the hours after bedtime I subtracted the hours from bedtime from the hour worked after bedtime to establish the proper rate. 
I made a check for the first 5 hours – start time at 5AM to bedtime, which I established to be 10PM, to be the baseHoursWorked. Then from 10:00PM to 12:00AM was established to be the time from bedtime to midnight, at the rate of $8/hr. I then made a check for every hour after that up to 4:00AM. If there was an hour after that I made sure to ask for hours worked within the given timeframe of 11 Hours.

At the end, I made sure to log in the total payment base on the hours worked provided.
