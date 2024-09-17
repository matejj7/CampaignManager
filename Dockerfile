# Pobranie obrazu bazowego
FROM openjdk:17-jdk-alpine

# Ustawienie katalogu roboczego
WORKDIR /CampaignManager

# Kopiowanie plików projektu do kontenera
COPY . .

# Budowanie aplikacji Maven (jeśli używasz Mavena)
RUN ./mvnw clean package -DskipTests

# Kopiowanie wygenerowanego pliku JAR do kontenera
COPY target/*.jar app.jar

# Ustawienie komendy startowej
ENTRYPOINT ["java", "-jar", "app.jar"]
