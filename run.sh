#!/bin/bash
# Created by Vitalii Klymov

mvn -f pom.xml clean package
java -jar target/vyrii.jar