package monopoly;

import fr.tanghe.dev.monopoly.De;
import fr.tanghe.dev.monopoly.Gobelet;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class GobeletTest {

    @Test
    void estUnDouble() {
        De mockedDe1 = mock(De.class);
        when(mockedDe1.getValeur()).thenReturn(1);

        De mockedDe2 = mock(De.class);
        when(mockedDe2.getValeur()).thenReturn(2);

        Gobelet combinaisonDouble = new Gobelet(mockedDe1, mockedDe1);
        Assertions.assertThat(combinaisonDouble.estUnDouble()).isEqualTo(true);

        Gobelet combinaisonNotDouble = new Gobelet(mockedDe1, mockedDe2);
        Assertions.assertThat(combinaisonNotDouble.estUnDouble()).isEqualTo(false);
    }

    @Test
    void lancer() {
        De mockedDe1 = mock(De.class);
        when(mockedDe1.getValeur()).thenReturn(1);

        De mockedDe2 = mock(De.class);
        when(mockedDe2.getValeur()).thenReturn(2);

        De mockedDe3 = mock(De.class);
        when(mockedDe3.getValeur()).thenReturn(3);

        Gobelet combinaison2 = new Gobelet(mockedDe1, mockedDe1);
        Assertions.assertThat(combinaison2.lancer()).isEqualTo(2);

        Gobelet combinaison4 = new Gobelet(mockedDe1, mockedDe3);
        Assertions.assertThat(combinaison4.lancer()).isEqualTo(4);

        Gobelet combinaison5 = new Gobelet(mockedDe3, mockedDe2);
        Assertions.assertThat(combinaison5.lancer()).isEqualTo(5);
    }
}