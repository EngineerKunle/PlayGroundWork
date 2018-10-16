package playgroundkotlincov

class EmployeeMain {
    fun main(args: Array<String>) {
        val b: EmployeeOut<Any> = EmployeeOut<Int>()
    }
}

class EmployeeOut<out T> {

}


fun main(args: Array<String>) {
    val gohan = Gohan()
    val goten = Goten()

    var training: Training<Goku> = Training<Gohan>(gohan)

    gohan.specialMove()
    goten.specialMove()


    training.trainChild()

    println("Currently Goku is training " + training.whoIsTrainig())
}

open class Goku {
    open fun specialMove() {
        println("kamehameha Goku")
    }
}

class Gohan: Goku() {

    override fun specialMove() {
        super.specialMove()
        println("kamehameha Gohan")
    }
}

class Goten: Goku() {
    override fun specialMove() {
        super.specialMove()
        println("kamehameha Goten")
    }
}

class Training<out T: Goku> (private var t: T) {

    fun trainChild() {
        println("training my child " + t)
    }

    fun whoIsTrainig(): T {
        return t
    }

}

class NotTraining<in T: Goku> {

    fun notTraining(child: T) {
        println("Not training "                                                                      )
    }
}