mvn clean install
$processPID=  $($(netstat -aon | findstr "8080")[0] -split '\s+')[-1]
echo $processPID
mvn spring-boot:run