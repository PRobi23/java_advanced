/**
 * The Interface
 *
 */
public class HelloWorld{

     public static void main(String []args){
        RedisCounters r = new RedisCounters();
        
        System.out.println("****** Connect : " + r.connect());
     }
}
     
interface RedisConnection
{
    int connect();
    boolean isConnected();
    int disconnect();
    int getDatabaseNumber();
}
 

abstract class AbstractRedisConnection implements RedisConnection
{
    @Override
    public final int connect()
    {
       return 1;
    }
 
    @Override
    public final boolean isConnected()
    {
        return true;
    }
 
    @Override
    public final int disconnect()
    {
        return 0;
    }
    
    @Override
    public final int getDatabaseNumber(){
        return 42;
    }
 }
 
class RedisCounters implements RedisConnection {

    // inner class extending Abstract Interface
    private class RedisConnectionForwarder extends AbstractRedisConnection {
        public void RedisConnectionForwarder() {
        }
    }
    RedisConnectionForwarder r = new RedisConnectionForwarder();
 
    @Override
    public int connect() {
        // Simply forward the request to the Forwarding class.
        return r.connect();
 
    }
 
    @Override
    public boolean isConnected() {
        // Simply forward the request to the Forwarding class.
        return r.isConnected();
    }
 
    @Override
    public int disconnect() {
        // Simply forward the request to the Forwarding class.
        return r.disconnect();
    }
    
    @Override
    public int getDatabaseNumber(){
        return r.getDatabaseNumber();
    }
}

