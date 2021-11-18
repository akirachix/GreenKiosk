package de.starkling.shoppingcart.database;

import java.lang.System;

/**
 * Created by Zohaib Akram on 2020-01-28
 * Copyright © 2019 Starkling. All rights reserved.
 */
@androidx.room.Database(entities = {de.starkling.shoppingcart.models.CartItem.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lde/starkling/shoppingcart/database/CartDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartItemDao", "Lde/starkling/shoppingcart/database/dao/CartItemDao;", "shoppingcart_debug"})
public abstract class CartDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract de.starkling.shoppingcart.database.dao.CartItemDao cartItemDao();
    
    public CartDatabase() {
        super();
    }
}