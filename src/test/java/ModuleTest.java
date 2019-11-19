import org.junit.jupiter.api.Test;
import org.joda.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {

    @Test
    void testGetNameAndGetId() {
        Module module = new Module("SE", "CT417", null, null);
        String name = module.getName();
        String id = module.getId();

        LocalDate currentDate = LocalDate.now();

        assertEquals(name, "SE");
        assertEquals(id, "CT417");
    }

}
