#!/bin/bash - 
#===============================================================================
#
#          FILE: runjava.sh
# 
#         USAGE: ./runjava.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2017年05月31日 10时02分52秒
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error


JIKESPATH=""
OSXHACK="lib"
if [ -d "${OSXHACK}" ] ; then
	for i in "${OSXHACK}"/*.jar
	do
		JIKESPATH="$JIKESPATH:$i"
	done
fi
OSXHACK="kotlinlib"
if [ -d "${OSXHACK}" ] ; then
	for i in "${OSXHACK}"/*.jar
	do
		JIKESPATH="$JIKESPATH:$i"
	done
fi
JIKESPATH="$JIKESPATH:classes:bin"
echo classpath=$JIKESPATH
echo -----------------------------------

java -classpath \"$JIKESPATH\" com.HelloKt
