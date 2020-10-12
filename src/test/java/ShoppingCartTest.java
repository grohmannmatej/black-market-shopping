import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import cz.uhk.fim.pro2.shopping.model.*;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setup(){
        this.cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Test pro overeni poctu v nakupnim kosiku")
    public void test_getChildCount() {
        Assertions.assertEquals(0,cart.getChildCount());
    }
}
