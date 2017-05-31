#!/bin/bash - 
#===============================================================================
#
#          FILE: antbuild.sh
# 
#         USAGE: ./antbuild.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2017年05月27日 16时02分53秒
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error
ant -f build.xml runtest

