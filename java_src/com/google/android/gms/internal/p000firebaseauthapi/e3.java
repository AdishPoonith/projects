package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e3  reason: invalid package */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a  reason: collision with root package name */
    private List f4528a;

    public e3(int i10, List list) {
        List emptyList;
        if (list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, l.a((String) list.get(i11)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.f4528a = emptyList;
    }

    public e3(List list) {
        this.f4528a = new ArrayList();
    }

    public final List a() {
        return this.f4528a;
    }
}
