body='{
"request": {
"branch":"master"
}}'

curl -s -X POST \
-H "Content-Type: application/json" \
-H "Accept: application/json" \
-H "Travis-API-Version: 3" \
-H "Authorization: token 7WfxujCgewarx0J9FOjyPg" \
-d "$body" \
https://api.travis-ci.org/repo/binary-com%2Fbinary-static-ci/requests
