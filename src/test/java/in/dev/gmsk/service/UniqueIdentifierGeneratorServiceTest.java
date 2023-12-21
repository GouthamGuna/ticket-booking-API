package in.dev.gmsk.service;

import in.dev.gmsk.service.serviceImpl.UniqueIdentifierGeneratorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UniqueIdentifierGeneratorServiceTest {
    @Autowired
    private UniqueIdentifierGeneratorServiceImpl service;

    @Test
    void generateUid() {

        String generateUid = service.generateUid();
        assertTrue( true );

        System.out.println( "generateUid = " + generateUid );
    }

    @Test
    void fromHostAndCurrentTime() {

        UUID uuid = service.fromHostAndCurrentTime();
        assertTrue( true );

        System.out.println( "uuid = " + uuid );
    }
}