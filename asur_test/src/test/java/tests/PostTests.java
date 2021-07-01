package tests;

import com.dto.PetDto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PostTests extends BaseClass {

    @Test
    public void createPetAndCheckExistence() {
        PetDto newPet = createDummyPet();

        String petResourceLocation = createResource("", newPet);
        PetDto retrievedPet = getResource(String.valueOf(newPet.getId()), PetDto.class);
        assertEqualPet(newPet, retrievedPet);
        newPet.setName("kevin");
        assertEquals(putResource(newPet, spec).getStatusCode(), 200);
        assertEquals("Check that pet is deleted", deleteRequest(newPet.getId()).getStatusCode(), 200);
        assertEquals(getPet(spec, newPet.getId()).statusCode(), 404);
    }
}
