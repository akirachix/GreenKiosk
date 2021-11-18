package de.starkling.shoppingcart.managers;

import java.lang.System;

/**
 * Created by Zohaib Akram on 2020-01-28
 * Copyright © 2019 Starkling. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0012JC\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u0002H\u00140\u000fj\b\u0012\u0004\u0012\u0002H\u0014`\u0012\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u0002H\u00140\u000fj\b\u0012\u0004\u0012\u0002H\u0014`\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001f\u001a\u00020\u001eH\u0002R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lde/starkling/shoppingcart/managers/CartManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cartTotal", "Landroidx/lifecycle/MutableLiveData;", "Lde/starkling/shoppingcart/managers/CartTotal;", "getCartTotal", "()Landroidx/lifecycle/MutableLiveData;", "cartTotal$delegate", "Lkotlin/Lazy;", "db", "Lde/starkling/shoppingcart/database/CartDatabase;", "items", "Ljava/util/ArrayList;", "Lde/starkling/shoppingcart/models/CartItem;", "getCartItems", "Lkotlin/collections/ArrayList;", "mapWithCart", "T", "Lde/starkling/shoppingcart/models/Saleable;", "saleable", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeItem", "", "(Lde/starkling/shoppingcart/models/Saleable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeCartTotal", "Landroidx/lifecycle/LiveData;", "updateItem", "", "updateTotals", "Companion", "shoppingcart_debug"})
public final class CartManager {
    private final kotlin.Lazy cartTotal$delegate = null;
    private final java.util.ArrayList<de.starkling.shoppingcart.models.CartItem> items = null;
    private de.starkling.shoppingcart.database.CartDatabase db;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "ShoppingCartDB";
    public static final de.starkling.shoppingcart.managers.CartManager.Companion Companion = null;
    
    private final androidx.lifecycle.MutableLiveData<de.starkling.shoppingcart.managers.CartTotal> getCartTotal() {
        return null;
    }
    
    /**
     * Return the list of cart item
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<de.starkling.shoppingcart.models.CartItem> getCartItems() {
        return null;
    }
    
    /**
     * Notify totals items and their amounts when item add or remove from cart
     * by calling #updateItem(saleable: Saleable)
     * @return LiveData<CartTotal>
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<de.starkling.shoppingcart.managers.CartTotal> subscribeCartTotal() {
        return null;
    }
    
    /**
     * Remove item from cart db
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeItem(@org.jetbrains.annotations.NotNull()
    de.starkling.shoppingcart.models.Saleable saleable, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1) {
        return null;
    }
    
    /**
     * Update item in cart db and update the totals items and amounts
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateItem(@org.jetbrains.annotations.NotNull()
    de.starkling.shoppingcart.models.Saleable saleable, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Map your saleable list quantity with the cart item quantity
     * @return Mapped saleable list
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends de.starkling.shoppingcart.models.Saleable>java.lang.Object mapWithCart(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> saleable, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<T>> p1) {
        return null;
    }
    
    private final void updateTotals() {
    }
    
    private CartManager(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lde/starkling/shoppingcart/managers/CartManager$Companion;", "Lde/starkling/shoppingcart/managers/SingletonHolder;", "Lde/starkling/shoppingcart/managers/CartManager;", "Landroid/content/Context;", "()V", "DB_NAME", "", "shoppingcart_debug"})
    public static final class Companion extends de.starkling.shoppingcart.managers.SingletonHolder<de.starkling.shoppingcart.managers.CartManager, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}