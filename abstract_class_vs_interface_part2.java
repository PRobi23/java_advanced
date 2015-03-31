abstract class RedisConnection {
    public final int connect() {
        // ... lots of code to connect to Redis
    }
 
    public final boolean isConnected() {
        //... code to check Redis connection
    }
 
    public final int disconnect() {
        // ... lots of code to disconnect from Redis and perform cleanup
    }
}

class RedisCounts extends RedisConnection {
 
    /**
     * There is no need to define connect(), isConnected() and disconnect() as
     * these functions are defined by the super class.
     */
 
    /**
     * Other code specific to storing and retreiving counters
     */
}
 
/**
 * another sub class extending from RedisConnection
 *
 */
class RedisOptOut extends RedisConnection {
    /**
     * There is no need to define connect(), isConnected() and disconnect() as
     * these functions are defined by the super class.
     */
 
    /**
     * Other code specific to handling users who have opted out
     */
}