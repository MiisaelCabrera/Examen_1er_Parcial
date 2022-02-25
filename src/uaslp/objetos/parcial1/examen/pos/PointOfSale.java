package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    private ArrayList<CartItem> items;

    public void addToCart(int quantity, Product product) {
        CartItem item = new CartItem();
        item.setProduct(product,quantity);
        items.add(quantity,item);
    }

    public float getTotal(){
        float total=0;
        CartItem item=new CartItem();
        for(int i=1;i<=items.size();i++){
            item=items.get(i);
            total+=item.getAmount();
        }
        return total;
    }

    public ArrayList<CartItem> getProducts() {
        return items;
    }
    public int getCountByName(String name){
        return 0;

    }
}
