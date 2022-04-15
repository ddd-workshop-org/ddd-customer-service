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
