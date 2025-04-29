package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c0  reason: invalid package */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final wh f4416a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4417b;

    private c0(b bVar) {
        vg vgVar = vg.f5530b;
        this.f4417b = bVar;
        this.f4416a = vgVar;
    }

    public static c0 b(wh whVar) {
        return new c0(new jv(whVar));
    }

    public static c0 c(String str) {
        co coVar = new co(Pattern.compile("[.-]"));
        if (!((bn) coVar.a("")).f4404a.matches()) {
            return new c0(new jx(coVar));
        }
        throw new IllegalArgumentException(d1.b("The pattern may not match the empty string: %s", coVar));
    }

    public final List d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator a10 = this.f4417b.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a10.hasNext()) {
            arrayList.add((String) a10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
