package in.dev.gmsk.service;

import java.util.UUID;

public interface UniqueIdentifierGeneratorService {
    String generateUid();

    UUID fromHostAndCurrentTime();
}
