package practice_kotlin.opps

open class Phone {
    fun on() {
        println("Turning on the Phone")
    }

    fun off() {
        println("Turning off the Phone")
    }

    fun call() {
        println("Calling from your Phone")
    }

    fun message() {
        println("Sending Message")
    }
}

open class FeaturePhone : Phone(){
    fun playMusic() {
        println("Music Playing")
    }

    fun pauseMusic() {
        println("Music Paused.")
    }
}

class SmartPhone :FeaturePhone(){
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
    sm.on()
    sm.call()
    sm.message()
    sm.playMusic()
    sm.pauseMusic()
    sm.takePicture()
    sm.displayPicture()
    sm.sendPicture()
    sm.recordVideo()
    sm.stopVideo()
    sm.playVideo()
    sm.pauseVideo()
    sm.sendVideo()
    sm.off()
}
