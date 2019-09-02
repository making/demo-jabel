#!/bin/bash

docker run --rm \
           -v ~/.m2:/root/.m2 \
           -v "$PWD":/usr/src \
           -w /usr/src \
           maven:3-jdk-13 \
           mvn clean package -DskipTests=true