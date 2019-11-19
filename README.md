Execute as 

```java -Djava.security.auth.login.config=login.conf -Djavax.security.auth.useSubjectCredsOnly=false -Dsun.security.krb5.debug=true -cp /Users/rguruvannagari/Downloads/MYPROJECTS/hive_test/HiveServer2JDBCSample/target/HiveJdbcClient-jar-with-dependencies.jar com.raghav.HiveJdbcClient 'jdbc:hive2://c416-node3.squadron.support.hortonworks.com:10000/default;principal=hive/_HOST@HWX.COM'```
