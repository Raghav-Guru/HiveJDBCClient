- Build from source: 

```
# git clone https://github.com/Raghav-Guru/HiveJDBCClient.git
# cd HiveJDBCClient/
# mvn clean install -Dmaven.site.skip=true -Dmaven.site.deploy.skip=true
```

- Execute as 

```
# java -Djava.security.auth.login.config=login.conf -Djavax.security.auth.useSubjectCredsOnly=false -Dsun.security.krb5.debug=true -cp `pwd`/target/HiveJdbcClient-jar-with-dependencies.jar com.raghav.HiveJdbcClient 'jdbc:hive2://c416-node3.squadron.support.hortonworks.com:10000/default;principal=hive/_HOST@HWX.COM'
```
(Note: Replace hive connection string and kerberos realm name)
