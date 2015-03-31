interface RedisConnection { 
    int connect(); 
    boolean isConnected();
    int disconnect();
    int getDatabaseNumber();
}

class RedisCounters implements RedisConnection {
 
    @Override
    public int connect() {
        //... lots of code to connect to Redis
    }
 
    @Override
    public boolean isConnected() {
        //... code to check Redis connection
    }
 
    @Override
    public int disconnect() {
        //... lots of code to disconnect & perform cleanup
    }
 }
 
 class RedisOptOut implements RedisConnection {
 
    @Override
    public int connect() {
 
        //... lots of code to connect to Redis
    }
 
    @Override
    public boolean isConnected() {
        //... code to check Redis connection
    }
 
    @Override
    public int disconnect() {
       //... lots of code to disconnect & perform cleanup
    }
 
        /**
      * Other code specific to handling users who have opted out
      */
 
    // method specific to this class
    public boolean isOptedOut(String userid) {….}
}