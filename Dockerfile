# Używamy obrazu openjdk do Javy 17
FROM openjdk:17-jdk-alpine

# Ustawienie katalogu roboczego
WORKDIR /CampaignManager

# Kopiowanie plików do kontenera
COPY target/*.jar app.jar

# Komenda startowa
ENTRYPOINT ["java", "-jar", "app.jar"]
