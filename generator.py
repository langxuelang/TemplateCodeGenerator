
#-*- coding:utf-8 –*-
#定义全局的常量
packagename = "com.bangstudy.xue";
author = "高腾"
packagename =  packagename.replace(".","/");
url = "/app/src/main/java/"+packagename
MODEL_URL = url+"/model";
PRESENTER_URL = url+"/presenter";




actionString = open("./template/TemplateAction.java").read();

actionString = actionString.replace("***","ExamReport")
actionString = actionString.replace("$author",author)
print actionString