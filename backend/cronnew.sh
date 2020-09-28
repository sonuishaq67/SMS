#!/bin/sh
x=$(grep Exception /home/ubuntu/College/target/nohup.out | wc -l)
y=$(cat ~/n)
	if [ $x -gt $y ]
	then 
		echo "Subject: I guess an error occured @ `date`\nTo: mail@gmail.com" > /home/ubuntu/mailfile
		cat /home/ubuntu/College/target/nohup.out >> /home/ubuntu/mailfile
		echo "`expr $x`" > n
		cat /home/ubuntu/mailfile | /usr/sbin/ssmtp mail@gmail.com
	else 
		exit 0
	fi
