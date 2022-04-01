fun main() {
    var harrier = Car("Toyota", " Compact crossover SUV ", "White", 5)
    var scania = Bus("Isuzu", "volvo", "Blue and black", 60)

    //class car
    harrier.carry(5)
    harrier.identity()
    var fees = harrier.calculatePakingFees(5)
    println(fees)

    //class bus
    scania.carry(65)
    scania.identity()
    var totalFees=harrier.calculatePakingFees(10)
    println(totalFees)
    var maxTrip = scania.maxTripFare(1000.00)
    println(maxTrip)

}

//create a class called car
open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        if (people == capacity) {
            println("Carrying $people passengers")
        } else {
            var x = 2
            println("Over capacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculatePakingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return parkingFees
    }
}

class Bus(make: String, model: String, color: String, capacity: Int):Car(make, model, color, capacity) {

    override fun calculatePakingFees(hours: Int): Int {
        return super.calculatePakingFees(hours)
        return capacity
    }

    fun maxTripFare(fare: Double): Double {
        var maxFare = fare * capacity
        return maxFare
    }


}

