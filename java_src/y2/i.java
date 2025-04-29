package y2;

import android.net.Uri;
import p3.l0;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f20427a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20428b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20429c;

    /* renamed from: d  reason: collision with root package name */
    private int f20430d;

    public i(String str, long j10, long j11) {
        this.f20429c = str == null ? "" : str;
        this.f20427a = j10;
        this.f20428b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f20428b;
            if (j10 != -1) {
                long j11 = this.f20427a;
                if (j11 + j10 == iVar.f20427a) {
                    long j12 = iVar.f20428b;
                    return new i(c10, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f20428b;
            if (j13 != -1) {
                long j14 = iVar.f20427a;
                if (j14 + j13 == this.f20427a) {
                    return new i(c10, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return l0.e(str, this.f20429c);
    }

    public String c(String str) {
        return l0.d(str, this.f20429c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20427a == iVar.f20427a && this.f20428b == iVar.f20428b && this.f20429c.equals(iVar.f20429c);
    }

    public int hashCode() {
        if (this.f20430d == 0) {
            this.f20430d = ((((527 + ((int) this.f20427a)) * 31) + ((int) this.f20428b)) * 31) + this.f20429c.hashCode();
        }
        return this.f20430d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f20429c + ", start=" + this.f20427a + ", length=" + this.f20428b + ")";
    }
}
