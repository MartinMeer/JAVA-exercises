run-dist:
	./build/install/java-exercises/bin/java-exercises
mkInstallDist:
	./gradlew clean
	./gradlew installDist
lint:
	./gradlew checkstyleMain
dependency:
	./gradlew dependencyUpdates
doc:
	./gradlew javadoc