Spring Cloud Distribute Application

Include The Following:

1、Spring Cloud Eureka (Global Spring Config Center Server)
2、Spring Cloud Distribute Config Manage (Global Spring Config Center)
3、Spring Cloud Ribbon (Client Load Balance, Default RoundRobin)
4、Spring Cloud Hystrix (Circuit Breaker)
5、Spring Cloud Zuul (Service Gateway)

Step one:
Run Eureka Application(cloud-eureka-server1) To Be Spring Cloud Register Center.

Step Two:
Run MicroService Service To Register cloud-service-provider1 and cloud-service-provider1 To Eureka Server As Service Provider(Or Call It Server).

Step Three:
Run MicroService Client To Register cloud-eureka-consumer1 or cloud-feign-consumer1 To Eureka Server As Client Producer(Or Call It Client)

If run the above three steps , the basic spring cloud application is avaiable.

Step Four:
Add Folder cloud-config-repo To save Spring Cloud Config.

Step Five:
Run Spring Cloud Config Center Server (cloud-config-server1) To Provider Global Spring Cloud Config to External Application .

Step Six:
Run Spring Cloud Config Center Client (cloud-config-client1) To Call(Test) Global Spring Cloud Config Whether is avaiable.

Step Seven
Run Spring Cloud Zuul() To Register cloud-api-gateway To Eureka Server And To Call MicroService Provider , Limit some Invalid Request

It is Finished.





