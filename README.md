#run main class using following command on terminal
gradle run

Request

{
"addressRequest": {
"city": "pune"
}
}

curl --location --request POST 'http://localhost:8080/customers' \
--header 'Content-Type: application/json' \
--data-raw '{   
"addressRequest" :{
"city": "pune"
}

}'


curl --location --request POST 'http://localhost:8080/customers/89806f42-65c2-42fc-a88e-689361d94bd9/accounts' \
--header 'Content-Type: application/json' \
--data-raw '{
"accountRequest" : {

    }
}'


curl --location --request PUT 'http://localhost:8080/customers/53b0c526-4318-44b5-8b38-b1dc0d9d1814/address' \
--header 'Content-Type: application/json' \
--data-raw '{
"city": "mumbai"
}'
