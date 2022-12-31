# webServiceModule
simple webServiceModule for Backend Server

use Spring Boot Framework and POJO

// POJO service

stringUtill & LoggingService
src\main\java\com\webModule\webService\data\service

desc :

stringUtill : If String or Number Data comes convert into String or Integer or Float ex : "10" >> 10 "-0.5" >> -0.5 "Animal" >> "Animal" (able to automatically convert positive number and negative number)

LoggingService : if you want to execute just only dataService, you can use substitute log4j without web server

ex : com.webModule.webService.data.service.DataParsingUtill >> Input Data >>> [String] [9999-01-01] com.webModule.webService.data.valuesManger.ObjectObserverUtill >> String Value Changed : 9999-01-01

NullCheck & observerService
src\main\java\com\webModule\webService\data\valuesManger

desc : NullCheck Service : return False if object is null, if object is not null return true. observerService : if input value type changed, print log changed value and type of changed value.

// Spring Boot Web Service

Interceptor Service
src\main\java\com\webModule\webService\interceptor (Interceptor)

src\main\java\com\webModule\webService\config (WebMVCConfig)

This Project do not need to add @RequestParam and @RequestBody in Controller class because preHandle intercept request and convert request params into JAVA ArrayList HashMap. Controller only use VO, and send that to Service Class.

automatically input Data into VO Class
src\main\java\com\webModule\webService\service If you set data into VO class, you shoud do typing each field and use getter setter method. this project will auto insert data if request body has key name. using JAVA Reflection Method dynamicaly input data and return VO.

requestBody : { "loginIP":"127.0.0.1", "loginId":"myID", "Name":"myName", "NickName":"myNickName", "password":"myPw1234", "emaiAddress" : "myEmail@gmail.com", "mobilePhone" : "82-10-1234-5678", "nationality" : "KOREA", "engishTextName" : "myEnglshName", "koreanTextName" : "나의 한국 이름", "gender" : "Male", "dept" : "laboratory", "birthDay" : "9999-01-01", "employmentDate" : "2222-01-01", "age" : "100", "careear" : "20", "wight" : "55.5", "wight" : "166.6" }

auto input result : HumanResourceVo [ loginIP=127.0.0.1, loginId=myID, Name=myName, NickName=myNickName, password=myPw1234, emaiAddress=myEmail@gmail.com, mobilePhone=82-10-1234-5678, secondEmaiAddress=null, nationality=KOREA, engishTextName=myEnglshName, koreanTextName=나의 한국 이름, japaneseTextName=null, chineseTextName=null, homeAddress=null, gender=Male, companyName=null, companyAddress=null, dept=laboratory, jobPosition=null, employmentStatus=null, previousCompanies=null, birthDay=9999-01-01, birthDate=null, employmentDate=null, departureDate=null, birthYear=null, age=100, careear=20, wight=166.6, height=null ]
