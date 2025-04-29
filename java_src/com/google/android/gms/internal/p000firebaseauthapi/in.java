package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.in  reason: invalid package */
/* loaded from: classes.dex */
public final class in {

    /* renamed from: a  reason: collision with root package name */
    private final an f4763a;

    /* renamed from: b  reason: collision with root package name */
    private final List f4764b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f4765c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ in(an anVar, List list, Integer num, hn hnVar) {
        this.f4763a = anVar;
        this.f4764b = list;
        this.f4765c = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof in) {
            in inVar = (in) obj;
            if (this.f4763a.equals(inVar.f4763a) && this.f4764b.equals(inVar.f4764b)) {
                Integer num = this.f4765c;
                Integer num2 = inVar.f4765c;
                if (num == num2) {
                    return true;
                }
                if (num != null && num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4763a, this.f4764b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f4763a, this.f4764b, this.f4765c);
    }
}
