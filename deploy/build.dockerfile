FROM maven:3.9.11-eclipse-temurin-21 AS builder

ARG MAVEN_REPO_LOCAL=/root/.m2
ENV MAVEN_OPTS="-Dmaven.repo.local=${MAVEN_REPO_LOCAL}"

WORKDIR /build

COPY pom.xml .
RUN --mount=type=cache,target=/root/.m2 mvn -B dependency:go-offline
COPY src ./src

RUN --mount=type=cache,target=/root/.m2 mvn -B clean package