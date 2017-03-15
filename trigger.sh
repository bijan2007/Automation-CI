# fetch trigger-travis script and make executable
curl -LO "https://raw.github.com/bijan2007/Automation-CI/blob/master/trigger-travis.sh"
chmod +x trigger-travis.sh

# trigger build if above conditions hold
if [[ ($TRAVIS_PULL_REQUEST == false) &&
( (! $TRAVIS_JOB_NUMBER == *.*) || ($TRAVIS_JOB_NUMBER == *.1) ) ]] ; then
chmod +x trigger-travis.sh
./trigger-travis.sh
fi
