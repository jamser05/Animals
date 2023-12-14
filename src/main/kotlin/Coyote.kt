class Coyote: Canine() {
    override val image = "Coyote.png"
    override val food = "Meat"
    override val habitat = "Deserts"

    override fun makeNoise() {
        println("Huff")
    }

    override fun eat() {
        println("The Coyote is eating $food")
    }

    override fun attack() {
        println("The coyote is attacking!")
    }


}