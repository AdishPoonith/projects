package m3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    private int f13728f;

    /* renamed from: h  reason: collision with root package name */
    private int f13730h;

    /* renamed from: o  reason: collision with root package name */
    private float f13737o;

    /* renamed from: a  reason: collision with root package name */
    private String f13723a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f13724b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f13725c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f13726d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f13727e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13729g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13731i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f13732j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f13733k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f13734l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f13735m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f13736n = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f13738p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13739q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f13733k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f13731i) {
            return this.f13730h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f13739q;
    }

    public int c() {
        if (this.f13729g) {
            return this.f13728f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f13727e;
    }

    public float e() {
        return this.f13737o;
    }

    public int f() {
        return this.f13736n;
    }

    public int g() {
        return this.f13738p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f13723a.isEmpty() && this.f13724b.isEmpty() && this.f13725c.isEmpty() && this.f13726d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f13723a, str, 1073741824), this.f13724b, str2, 2), this.f13726d, str3, 4);
        if (B == -1 || !set.containsAll(this.f13725c)) {
            return 0;
        }
        return B + (this.f13725c.size() * 4);
    }

    public int i() {
        int i10 = this.f13734l;
        if (i10 == -1 && this.f13735m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f13735m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f13731i;
    }

    public boolean k() {
        return this.f13729g;
    }

    public boolean l() {
        return this.f13732j == 1;
    }

    public boolean m() {
        return this.f13733k == 1;
    }

    public d n(int i10) {
        this.f13730h = i10;
        this.f13731i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f13734l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f13739q = z10;
        return this;
    }

    public d q(int i10) {
        this.f13728f = i10;
        this.f13729g = true;
        return this;
    }

    public d r(String str) {
        this.f13727e = str == null ? null : b5.b.e(str);
        return this;
    }

    public d s(float f10) {
        this.f13737o = f10;
        return this;
    }

    public d t(int i10) {
        this.f13736n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f13735m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f13738p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f13725c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f13723a = str;
    }

    public void y(String str) {
        this.f13724b = str;
    }

    public void z(String str) {
        this.f13726d = str;
    }
}
