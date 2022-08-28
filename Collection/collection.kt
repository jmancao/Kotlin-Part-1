fun main() {
  // Write your code below 🏊‍♀️
  var waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")

  println(waterSports)
}

fun main() {
  // Write your code below 🏃‍♀️

  var unitedStatesMarathons = listOf("Boston Marathon", "Bank of America Chicago Marathon", "TCS NYC Marathon", "Marine Corps Marathon")

  println(unitedStatesMarathons[1])
}

fun main() {
  // Write your code below 🎭

  var openBroadwayShows = mutableListOf("The Lion King", "Chicago", "The Cher Show", "Les Miserables")

  openBroadwayShows[2] = "Wicked"
  println(openBroadwayShows)
}

fun main() {
  // Write your code below 🍎

  var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")  

  println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
}

fun main() {

  val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

  // Write your code below 🪐
  
  planets.remove("Pluto")
  planets.add("Earth")
  println(planets.random())
}

fun main() {
  // Write your code below 💾

  var obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex")

  println(obsoleteTech)
}

fun main() {
  // Write your code below 

  var islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")

   println(islandsOfHawaii.elementAt(2))
   println(islandsOfHawaii.elementAtOrNull(6))
}

fun main() {
  // Write your code below 👩‍🚀

  var apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")

  println(apolloLandingSites)
}

fun main() {

  var uniqueParticipants = mutableSetOf<String>() 
  var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

  // Write your code below 🎤

  uniqueParticipants.addAll(participants)
  println("The talent show has ${uniqueParticipants.size} unique participants.")
  uniqueParticipants.clear()
  println(uniqueParticipants)
}

fun main() {
  // Write your code below 📝

  var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)

  var sum = testGrades.sum()

  var numStudents = testGrades.size

  var average = sum / numStudents

  if (average < 65) {
    println("Failed")
  } else {
    println("Passed")
  }
}