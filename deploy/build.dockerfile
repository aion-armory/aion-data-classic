FROM maven:3.9.11-eclipse-temurin-21 AS builder

ARG MAVEN_REPO_LOCAL=/root/.m2
ENV MAVEN_OPTS="-Dmaven.repo.local=${MAVEN_REPO_LOCAL}"

WORKDIR /build

COPY pom.xml .
RUN mvn -B dependency:go-offline
COPY src ./src

RUN mvn -B clean package
