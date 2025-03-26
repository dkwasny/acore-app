package net.kwas.acore.item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ItemController {

    private final ItemDatabase db;

    public ItemController(ItemDatabase db) {
        this.db = db;
    }

    @GetMapping("/api/item")
    public Collection<SqlItem> getItems() {
        return db.getItems();
    }

    @GetMapping("/api/item/{id}")
    public SqlItem getItem(@PathVariable long id) {
        return db.getItem(id);
    }

    @GetMapping("/api/item/summary")
    public Collection<ItemSummary> getItemSummaries() {
        return db.getItemSummaries();
    }

    @GetMapping("/api/item/{id}/summary")
    public ItemSummary getItemSummary(@PathVariable long id) {
        return db.getItemSummary(id);
    }

}
