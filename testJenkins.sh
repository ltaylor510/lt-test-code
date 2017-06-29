#! /bin/sh

export outfile=/Users/ltaylor/jenkins-test2.out

echo "this is my first Jenkins Job" > $outfile
echo "lets append" >> $outfile

if [ -f "$outfile" ]
then
echo "file does exist"
exit 0
else
echo "no can do!"
exit 1
fi
