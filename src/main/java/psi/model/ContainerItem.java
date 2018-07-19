package psi.model;

import java.util.List;

public class ContainerItem implements Item{
	private List<Item> items;

	
	public ContainerItem(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}