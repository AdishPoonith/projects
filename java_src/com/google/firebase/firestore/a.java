package com.google.firebase.firestore;

import java.util.Objects;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final q f6709a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6710b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6711c;

    /* loaded from: classes.dex */
    public static class b extends a {
        private b() {
            super(null, "count");
        }
    }

    private a(q qVar, String str) {
        String str2;
        this.f6709a = qVar;
        this.f6710b = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (qVar == null) {
            str2 = "";
        } else {
            str2 = "_" + qVar;
        }
        sb.append(str2);
        this.f6711c = sb.toString();
    }

    public static b a() {
        return new b();
    }

    public String b() {
        return this.f6711c;
    }

    public String c() {
        q qVar = this.f6709a;
        return qVar == null ? "" : qVar.toString();
    }

    public String d() {
        return this.f6710b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            q qVar = this.f6709a;
            return (qVar == null || aVar.f6709a == null) ? qVar == null && aVar.f6709a == null : this.f6710b.equals(aVar.d()) && c().equals(aVar.c());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(d(), c());
    }
}
