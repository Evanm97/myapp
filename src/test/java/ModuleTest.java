import org.junit.Test;
import org.joda.time.*;

import static junit.framework.TestCase.assertEquals;

public class ModuleTest {

    @Test
    public void testGetNameAndGetId() {
        Module module = new Module("SE", "CT417", null, null);
        String name = module.getName();
        String id = module.getId();

        LocalDate currentDate = LocalDate.now();

        assertEquals(name, "SE");
        assertEquals(id, "CT417");
    }

}
