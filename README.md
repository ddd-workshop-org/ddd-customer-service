#run main class using following command on terminal
gradle run

Request

{
"addressRequest": {
"city": "pune"
}
}

curl --location --request GET 'http://localhost:8080/customers' \
--header 'Content-Type: application/json' \
--data-raw '{
"addressRequest": {
"city": "pune"
}
}'
