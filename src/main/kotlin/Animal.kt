//Superclass, I'm going to use this class to inherit its properties to subclasses.
//When designing a Super class we need to prefix it with open, so it can be used for inheritance.
 interface Roamable {
    fun roam()
 }

abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    val hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }


}

fun main(args: Array<String>) {

    // Assigning objects to a variables.
    val pseudoCoyote: Animal = Coyote()

    // To cast an object to a potential parent type
    // Use "as" when you need that the variable holds a reference to that specific object
    val cayote = pseudoCoyote as Coyote
    cayote.eat()

    val animal: Animal = Wolf()

    // Use "is" to check if the object holds an underlying reference of your desired object
    //  To check if an object is of a certain type
    val str = if (animal is Wolf) "Wolf" else "Not Wolf"

    println(str)

    // Review Code here and Smart Casing and Casting
    val roamables: Array<Roamable> = arrayOf(Hippo(), Wolf(), Vehicle())

    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    if (animal is Wolf) animal.eat()

    val vet = Vet()

    val hippo = Hippo()

    // Testing the "is" operator with conditionals
    // !is
    /**if (hippo is Animal && hippo.hunger >= 5) {
    println("feed the Hippo.")
    }
     */


    val coyote = Coyote()

    val wolf = Wolf()

    vet.giveShot(coyote)

    vet.giveShot(wolf)

    vet.giveShot(hippo)

    val animals: Array<Animal> = arrayOf(Hippo(), Wolf(), Coyote())

    var x = 0

    while (x in 0..2) {
        // if when's value is correct it skips the other value testers and goes to the x++
        when (animals[x]) {
            is Hippo -> {
                println(x) // x is 0
                x++
                println(x) // x is 1
                animals[x].eat() // wolf is in index 1
                println("Here")
            }
            is Wolf, is Coyote -> {
                println(x)
            animals[x].eat()
                println(x)
                println ("Thank You")
        }
        }
        println("hey")
        x++ // x = 2
    }

    for (item in animals) {
        item.roam()
        item.eat()

    }
}