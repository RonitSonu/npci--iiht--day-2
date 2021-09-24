import java.util.*;

 class Item
{
	public String name = "";
	public int quantity;
	public int price;
}

public class ShoppingCart
{
	private ArrayList<Item> item = new ArrayList<Item>();
	private int total_price;
	public ShoppingCart()
	{
		System.out.print("Creating a new shopping cart \n");
		
		total_price = 0;
	}

	public  void addItem(String name, int quantity, int price)
	{
		for (int i = 0; i < item.size(); i++)
		{
			if (item.get(i).name==name)
			{
				item.get(i).quantity += quantity;
				return;
			}
		}

		Item temp = new Item();
		temp.name = name;
		temp.quantity = quantity;
		temp.price = price;
		item.add(temp);
	}

	public  void removeItem(String name, int quantity)
	{
		for (int i = 0; i < item.size(); i++)
		{
			if (item.get(i).name==name)
			{
				if (item.get(i).quantity >= quantity)
				{
					item.get(i).quantity -= quantity;
					return;
				}
				System.out.println("No items  ");
				
	return;
			}
		}
		System.out.println(" item is not there");
		
	}

	public  int getTotal()
	{
		total_price = 0;
		for (int i = 0; i < item.size(); i++)
		{
			total_price += item.get(i).quantity * item.get(i).price;
		}
		return total_price;
	}





	public static void main(String[] args)
	{
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem("pulao", 2, 15);
		cart.addItem("pasta", 1, 5);
		System.out.print("Total cost: ");
		System.out.println(cart.getTotal());
		
		cart.addItem("Football", 2, 15);
		
		cart.removeItem("pasta", 2);
		System.out.print(cart.getTotal());
		System.out.print("\n");
		cart.addItem("biryani", 15, 2);
		cart.removeItem("Bat", 1);
		System.out.print("Total cost: ");
		System.out.print(cart.getTotal());
		System.out.print("\n");
	}
}