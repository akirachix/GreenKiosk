package de.starkling.shoppingcart.models;

import java.lang.System;

/**
 * Created by Zohaib Akram on 2020-01-28
 * Copyright © 2019 Starkling. All rights reserved.
 */
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010\'\u001a\u00020\bH\u0016J\t\u0010(\u001a\u00020\nH\u00d6\u0001J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006*"}, d2 = {"Lde/starkling/shoppingcart/models/CartItem;", "Lde/starkling/shoppingcart/models/Saleable;", "saleable", "(Lde/starkling/shoppingcart/models/Saleable;)V", "itemId", "", "itemName", "itemPrice", "", "itemQuantity", "", "(Ljava/lang/String;Ljava/lang/String;FI)V", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getItemName", "setItemName", "getItemPrice", "()F", "setItemPrice", "(F)V", "getItemQuantity", "()I", "setItemQuantity", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getId", "getName", "getPrice", "getQuantity", "getTotal", "hashCode", "toString", "shoppingcart_debug"})
public final class CartItem implements de.starkling.shoppingcart.models.Saleable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private java.lang.String itemId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String itemName;
    @androidx.room.ColumnInfo(name = "price")
    private float itemPrice;
    @androidx.room.ColumnInfo(name = "quantity")
    private int itemQuantity;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public float getPrice() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public int getQuantity() {
        return 0;
    }
    
    @java.lang.Override()
    public float getTotal() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemId() {
        return null;
    }
    
    public final void setItemId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemName() {
        return null;
    }
    
    public final void setItemName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final float getItemPrice() {
        return 0.0F;
    }
    
    public final void setItemPrice(float p0) {
    }
    
    @java.lang.Override()
    public int getItemQuantity() {
        return 0;
    }
    
    @java.lang.Override()
    public void setItemQuantity(int p0) {
    }
    
    public CartItem(@org.jetbrains.annotations.NotNull()
    java.lang.String itemId, @org.jetbrains.annotations.NotNull()
    java.lang.String itemName, float itemPrice, int itemQuantity) {
        super();
    }
    
    public CartItem(@org.jetbrains.annotations.NotNull()
    de.starkling.shoppingcart.models.Saleable saleable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final int component4() {
        return 0;
    }
    
    /**
     * Created by Zohaib Akram on 2020-01-28
     * Copyright © 2019 Starkling. All rights reserved.
     */
    @org.jetbrains.annotations.NotNull()
    public final de.starkling.shoppingcart.models.CartItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String itemId, @org.jetbrains.annotations.NotNull()
    java.lang.String itemName, float itemPrice, int itemQuantity) {
        return null;
    }
    
    /**
     * Created by Zohaib Akram on 2020-01-28
     * Copyright © 2019 Starkling. All rights reserved.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Zohaib Akram on 2020-01-28
     * Copyright © 2019 Starkling. All rights reserved.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Zohaib Akram on 2020-01-28
     * Copyright © 2019 Starkling. All rights reserved.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}