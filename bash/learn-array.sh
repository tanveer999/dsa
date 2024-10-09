#!/bin/bash

declare -a sport=(
    [0]=football
    [1]=cricket
    [2]=rugby
)

## @ to print all array elements
echo "Array elements:"
echo "${sport[@]}"

## iterating array
echo "Iterating array:"
for i in ${sport[@]}
do
    echo -e "$i"
done

echo "Array size: ${#sport[@]}"

echo "Deleting array element:"
unset sport[1]
echo "Array is ${sport[@]}"