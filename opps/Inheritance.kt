package practice_kotlin.opps

open class Phone {
    open fun on() {
        println("Turning on the Phone")
    }

    open fun off() {
        println("Turning off the Phone")
    }

    open fun call() {
        println("Calling from your Phone")
    }

    fun message() {
        println("Sending Message")
    }
}

open class FeaturePhone : Phone() {
    override fun on() {
        println("Turning on the Feature Phone")
    }

    override fun off() {
        println("Turning off the Feature Phone")
    }

    override fun call() {
        println("Call from your Feature Phone")
    }

    fun playMusic() {
        println("Music Playing")
    }

    fun pauseMusic() {
        println("Music Paused.")
    }
}

class SmartPhone : FeaturePhone() {
    override fun on() {
        println("Turning on the Smart Phone")
    }

    override fun off() {
        println("Turning off the Smart Phone")
    }

    override fun call() {
        println("Call from your Smart Phone")
    }

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
    println("------------------------")

    val fp = FeaturePhone()
    fp.on()
    fp.call()
    fp.off()
    println("------------------------")

    val p = Phone()
    p.on()
    p.call()
    p.off()
    println("------------------------")
}
