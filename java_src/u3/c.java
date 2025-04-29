package u3;

import android.os.Bundle;
import c4.q;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public final class c implements a.d {

    /* renamed from: k  reason: collision with root package name */
    public static final c f19034k = new c(new Bundle(), null);

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f19035j;

    /* synthetic */ c(Bundle bundle, g gVar) {
        this.f19035j = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f19035j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return q.a(this.f19035j, ((c) obj).f19035j);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f19035j);
    }
}
