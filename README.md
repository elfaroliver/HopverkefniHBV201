# Flöskumóttakan
JavaFX forrit byggt með Maven.
---

### Uppsetning
- *src/main/java/vidmot/:* Allur kóðinn fyrir viðmót.
- *src/main/java/vinnsla/:* Allur kóði fyrir bakvinnslu.
- *src/main/java/resources/vidmot/:* Öll viðmóts- og útlitsskjöl (t.d. FXML og CSS).
- *pom.xml:* Maven skrá.
---

### Hvernig á að keyra forrit:
#### 1. Sækja kóðann
```bash
git clone https://github.com/elfaroliver/HopverkefniHBV201.git

eða sækja kóða sem .zip skrá og afþjappa skrá.
(Download ZIP)
```

#### 2. Síðan er hægt að keyra forrit frá skipannalínu með því að fara inn í möppuna
```bash
cd ../HopverkefniHBV201
```

#### 3. Eftir það er hægt að keyra forrit með Maven eftirfarandi skipun:
```bash
mvn clean javafx:compile
mvn javafx:run
```
