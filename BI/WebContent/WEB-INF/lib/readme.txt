为解决重新部署时，以下错误，特将相关jar包放在tomcat的lib包里面：
1.严重: The web application [/Chat] created a ThreadLocal with key of type [java.lang.ThreadLocal] (value [java.lang.ThreadLocal@1854b38]) and a value of type [org.directwebremoting.impl.DefaultWebContext] (value [DefaultWebContext[id=QONB, page=/Chat/chat/active.jsp]]) but failed to remove it when the web application was stopped. This is very likely to create a memory leak.
log4j-1.2.12.jar
dwr.jar
2.严重: The web application [/Chat] created a ThreadLocal with key of type [net.sf.json.AbstractJSON$1] (value [net.sf.json.AbstractJSON$1@4e8edc]) and a value of type [java.util.HashSet] (value [[]]) but failed to remove it when the web application was stopped. This is very likely to create a memory leak.
jsonplugin.jar
json.jar
json-lib-2.0.2-jdk15.jar
ezmorph-1.0.4.jar
commons-logging-1.0.4.jar
commons-lang-2.4.jar
commons-collections-3.2.jar
commons-beanutils-1.7.0
3.严重: The web application [/Chat] registered the JDBC driver [oracle.jdbc.driver.OracleDriver] but failed to unregister it when the web application was stopped. To prevent a memory leak, the JDBC Driver has been forcibly unregistered.
ojdbc.jar