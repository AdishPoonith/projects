package a6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.a2;
import java.util.List;
/* loaded from: classes.dex */
public final class q1 implements com.google.firebase.auth.i {
    public static final Parcelable.Creator<q1> CREATOR = new r1();

    /* renamed from: j  reason: collision with root package name */
    private w1 f278j;

    /* renamed from: k  reason: collision with root package name */
    private o1 f279k;

    /* renamed from: l  reason: collision with root package name */
    private a2 f280l;

    public q1(w1 w1Var) {
        w1 w1Var2 = (w1) c4.s.j(w1Var);
        this.f278j = w1Var2;
        List j02 = w1Var2.j0();
        this.f279k = null;
        for (int i10 = 0; i10 < j02.size(); i10++) {
            if (!TextUtils.isEmpty(((s1) j02.get(i10)).zza())) {
                this.f279k = new o1(((s1) j02.get(i10)).g(), ((s1) j02.get(i10)).zza(), w1Var.n0());
            }
        }
        if (this.f279k == null) {
            this.f279k = new o1(w1Var.n0());
        }
        this.f280l = w1Var.f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(w1 w1Var, o1 o1Var, a2 a2Var) {
        this.f278j = w1Var;
        this.f279k = o1Var;
        this.f280l = a2Var;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.g A() {
        return this.f279k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.h h() {
        return this.f280l;
    }

    @Override // com.google.firebase.auth.i
    public final com.google.firebase.auth.a0 r() {
        return this.f278j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 1, this.f278j, i10, false);
        d4.c.r(parcel, 2, this.f279k, i10, false);
        d4.c.r(parcel, 3, this.f280l, i10, false);
        d4.c.b(parcel, a10);
    }
}
