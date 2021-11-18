package de.starkling.shoppingcart.models;

import java.lang.System;

/**
 * Created by Zohaib Akram on 2020-01-28
 * Copyright © 2019 Starkling. All rights reserved.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lde/starkling/shoppingcart/models/Saleable;", "", "itemQuantity", "", "getItemQuantity", "()I", "setItemQuantity", "(I)V", "getId", "", "getName", "getPrice", "", "getQuantity", "getTotal", "shoppingcart_debug"})
public abstract interface Saleable {
    
    public abstract int getItemQuantity();
    
    public abstract void setItemQuantity(int p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    public abstract float getPrice();
    
    public abstract int getQuantity();
    
    public abstract float getTotal();
}