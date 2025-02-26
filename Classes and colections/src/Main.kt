fun main() {
    val events = mutableListOf<Event>()

    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, duration = 0))
    events.add(Event(title = "Eat breakfast", daypart = Daypart.MORNING, duration = 15))
    events.add(Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, duration = 30))
    events.add(Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, duration = 60))
    events.add(Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, duration = 10))
    events.add(Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, duration = 45))

    val shortEvents = events.filter { it.duration < 60 }

    println("Short events:")
    shortEvents.forEach {
        println(it.title)
    }

    val eventsDaypart = events.groupBy { it.daypart }

    println("Day part:")
    eventsDaypart.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }


}

class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int
) {
    val Event.durationOfEvent: String
        get() = if (this.duration < 60) {
            "short"
        } else {
            "long"
        }
}


enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}
