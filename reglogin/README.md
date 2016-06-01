Simple JavaEE project.

#How to generate source code based on mybatis.
Modify generater.xml in ./mybatis-generator, then use command:
    java -jar mybatis-generator-core-1.3.2.jar -configfile generator.xml -overwrite
it generate code such as DAO Mapper
