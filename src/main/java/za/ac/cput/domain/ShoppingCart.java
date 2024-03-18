package za.ac.cput.domain;
//221715126
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private final String cartID;
    private final String items;


private ShoppingCart(Builder builder){
    this.cartID = builder.cartID;
    this.items = builder.items;
}

    public String getCartID() {

    return cartID;
    }
    public String getItems(){
        return items;
}
@Override
    public boolean equals(Object o) {
    if (this == o) return true; if (o == null || getClass() != o.getClass()) return false;
    ShoppingCart shoppingCart = (ShoppingCart) o;
    return Objects.equals(cartID, shoppingCart.cartID) && Objects.equals(items, shoppingCart.items);
}
@Override
public int hashCode(){return Objects.hash(cartID,items);
}

public String toString(){
    return "ShoppingCart{"+"CartID ="+ cartID+"\n"+
            "Items ="+ items;
}

    public static class Builder{
        private  String cartID;
        private  String items;

    public Builder setCartID (String cartID){
        this.cartID = cartID;
        return this;
    }

    public Builder setItems (String items){
        this.items = items;
        return this;
    }
    public Builder copy(ShoppingCart shoppingcart){
        this.cartID = shoppingcart.cartID;
        this.items = shoppingcart.items;
        return  this;
    }

    public ShoppingCart build(){return  new ShoppingCart(this);}
}

}
