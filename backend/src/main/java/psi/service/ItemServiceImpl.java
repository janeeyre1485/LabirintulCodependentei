package psi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psi.model.Item;
import psi.persistence.ItemRepository;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void save(Item item) {
		itemRepository.save(item);
		
	}

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

}
