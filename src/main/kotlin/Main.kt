var heroName: String = ""

fun main() {


    // changeNarratorMood()
    heroName = promptHeroName()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")



    visitTavern()
}

fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?", ::makeYellow)
    /*val heroName = readLine()
    require(heroName != null && heroName.isNotEmpty()) {
        "The hero must have a name."
    }*/

    val name = "Madrigal"
    println(name)
    return name
}

fun createTitle(name: String): String {
    return when {
        name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowels"
        name.all { it.isDigit() } -> "The Identifiable"
        name.none { it.isLetter() } -> "The Witness Protection Member"
        else -> "The Renowned Hero"
    }
}

private fun makeYellow(message: String): String {
    return "\u001b[33;1m$message\u001b[0m"
}