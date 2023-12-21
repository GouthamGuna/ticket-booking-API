package in.dev.gmsk.service.serviceImpl;

import in.dev.gmsk.service.UniqueIdentifierGeneratorService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

//@Transactional
@Service
public class UniqueIdentifierGeneratorServiceImpl implements UniqueIdentifierGeneratorService {

    private static String HOST_IP;

    static {
        try {
            HOST_IP = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            HOST_IP = "127.0.0.1"; //localhost
        }
    }

    /**
     * UuidGenerator
     * <p></p>
     * The UUID is not a string, but a 128-bit value. The UUID is a hexadecimal value like
     */
    @Override
    public String generateUid() {
        return UUID.randomUUID().toString();
    }

    @Override
    public UUID fromHostAndCurrentTime() {

        String currentTimeStamp = Long.toString( System.nanoTime() );
        byte[] genBytes = (HOST_IP + currentTimeStamp).getBytes();
        return UUID.nameUUIDFromBytes( genBytes );
    }
}
