fun main() {
    var harrier = Car("Toyota", " Compact crossover SUV ", "White", 5)

}

//create a class called car
class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        if (people == capacity) {
            println("Carrying $people passengers")
        } else {
            var x = capacity + 2
            println("Over capacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    fun calculatePakingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return parkingFees
    }
}

class Bus(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        if (people == 5) {
            println("Carrying $people passengers")
        } else {
            var x = 2
            println("Over capacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    fun calculatePakingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return parkingFees
    }

    fun maxTripFare(fare: Double): Double {
        var maxFare = fare * capacity
        return maxFare
    }
}

