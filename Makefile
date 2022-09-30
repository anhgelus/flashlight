runClient:
	make build
	make moveJar

moveJar:
	mv build/libs/*.jar /home/anhgelus/.local/share/PolyMC/instances/Flashlight\ mods/.minecraft/mods/flashlight.jar

buildJar:
	./gradlew jar