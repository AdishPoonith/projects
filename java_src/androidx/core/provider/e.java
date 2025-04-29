package androidx.core.provider;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f1783a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1784b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1785c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f1786d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1787e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f1788f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1783a = (String) androidx.core.util.d.c(str);
        this.f1784b = (String) androidx.core.util.d.c(str2);
        this.f1785c = (String) androidx.core.util.d.c(str3);
        this.f1786d = (List) androidx.core.util.d.c(list);
        this.f1788f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f1786d;
    }

    public int c() {
        return this.f1787e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f1788f;
    }

    public String e() {
        return this.f1783a;
    }

    public String f() {
        return this.f1784b;
    }

    public String g() {
        return this.f1785c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1783a + ", mProviderPackage: " + this.f1784b + ", mQuery: " + this.f1785c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f1786d.size(); i10++) {
            sb.append(" [");
            List<byte[]> list = this.f1786d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1787e);
        return sb.toString();
    }
}
