package practice_kotlin.opps

class Phone {
    fun on() {
        println("Turning on your Phone")
    }

    fun off() {
        println("Turning off your Phone")
    }

    fun call() {
        println("Calling your Phone")
    }

    fun message() {
        println("Sending Message")
    }
}

class FeaturePhone {
    fun playMusic() {
        println("Music Playing")
    }

    fun pauseMusic() {
        println("Music Paused.")
    }
}

class SmartPhone {
    fun takePicture() {
        println("Taking Picture")
    }

    fun displayPicture() {
        println("Displaying Picture")
    }

    fun sendPicture() {
        println("Sending Picture")
    }

    fun recordVideo() {
        println("Video Recording Started.")
    }

    fun stopVideo() {
        println("Video Recording Stopped.")
    }

    fun playVideo() {
        println("Video Playing")
    }

    fun pauseVideo() {
        println("Video Paused.")
    }

    fun sendVideo() {
        println("Sending Video")
    }
}

fun main() {
    val sm = SmartPhone()
}
