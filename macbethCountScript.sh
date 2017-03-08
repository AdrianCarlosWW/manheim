cat $1 | tr '[:punct:]' ' ' | tr 'A-Z' 'a-z' | tr -s ' ' | tr ' ' '\n' | sort |grep -o -w '\w\{5,\}' | uniq -c | sort -rn | head -2 | tail -1

