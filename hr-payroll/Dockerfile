FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-payroll-2.3.4.RELEASE.jar hr-payroll.jar
ENTRYPOINT ["java","-jar","/hr-payroll.jar"]