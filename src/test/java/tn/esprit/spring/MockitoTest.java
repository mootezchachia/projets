package tn.esprit.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.VoyageRepository;
import tn.esprit.spring.services.VoyageServiceImpl;


import static org.junit.Assert.assertNotNull;
import static tn.esprit.spring.entities.Ville.RADES;
import static tn.esprit.spring.entities.Ville.sfax;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoTest {

    @Mock
    VoyageRepository cp;
    @InjectMocks
    VoyageServiceImpl rs;
    @Test
    public void testAddCategorieProduit() {
        //given
        Voyage s = new Voyage(10L,RADES,sfax,10.0,11.0);

        //when
        Mockito.when(this.cp.save(Mockito.any())).thenReturn(s);
        rs.ajouterVoyage(s);


        //then
        assertNotNull(s.getTrain());


    }
    
}
