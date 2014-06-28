ATG-Gradle-Plugin
=================

ATG-Gradle-Plugin

Step 1:
  在build.gradle中粘贴一下内容
 
buildscript {
    repositories {
        maven {
            url "https://raw.githubusercontent.com/josephn814/ATG-Gradle-Plugin/master/repo"
        }
    }
    dependencies {
        classpath "com.aaxis:atg-gradle-plugin:1.0-SNAPSHOT"
    }
}
apply plugin: 'atg'

Step 2：
  build.gradle配置信息
 
atg {
    //root = "C:\\atgcertenv20140212\\ATG10.0.2"  //ATG 安装目录
    //moduleName = "NGP.ModuleA" //当前模块的模块名，默认为当前GRADLE模块的模块名
    dependOnModules = ["DSS"] //引用已经在ATG目录下已经存在的MODULEs
    /*
    manifest {
        attributes abc: "abc"  //可以增加其他MANIFEST 属性到模块的MANIFEST.MF文件中
    }
    */
    
    j2eeApps {
        //dir = "j2ee-apps"   //J2EE 文件路径，里面存在的是WEB内容。默认为j2ee-apps
        modules = ["store.war"]  //WEB内容的目录，可以包含多个WEB-APP
    }
}
 
