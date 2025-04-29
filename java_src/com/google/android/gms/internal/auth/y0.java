package com.google.android.gms.internal.auth;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class y0 {
    public static u0 a(u0 u0Var) {
        return ((u0Var instanceof w0) || (u0Var instanceof v0)) ? u0Var : u0Var instanceof Serializable ? new v0(u0Var) : new w0(u0Var);
    }

    public static u0 b(Object obj) {
        return new x0(obj);
    }
}
