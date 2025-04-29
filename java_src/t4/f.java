package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends d4.a {
    public static final Parcelable.Creator<f> CREATOR = new z();

    /* renamed from: j  reason: collision with root package name */
    private final List f18223j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f18224k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f18225l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList f18226a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f18227b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f18228c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f18226a.add(locationRequest);
            }
            return this;
        }

        public f b() {
            return new f(this.f18226a, this.f18227b, this.f18228c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(List list, boolean z10, boolean z11) {
        this.f18223j = list;
        this.f18224k = z10;
        this.f18225l = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.v(parcel, 1, Collections.unmodifiableList(this.f18223j), false);
        d4.c.c(parcel, 2, this.f18224k);
        d4.c.c(parcel, 3, this.f18225l);
        d4.c.b(parcel, a10);
    }
}
