package x1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.a;
import p3.n0;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f20211c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f20212a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f20213b = -1;

    private boolean b(String str) {
        Matcher matcher = f20211c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) n0.j(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) n0.j(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f20212a = parseInt;
                    this.f20213b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f20212a == -1 || this.f20213b == -1) ? false : true;
    }

    public boolean c(k2.a aVar) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof p2.e) {
                p2.e eVar = (p2.e) d10;
                if ("iTunSMPB".equals(eVar.f15300l) && b(eVar.f15301m)) {
                    return true;
                }
            } else if (d10 instanceof p2.j) {
                p2.j jVar = (p2.j) d10;
                if ("com.apple.iTunes".equals(jVar.f15313k) && "iTunSMPB".equals(jVar.f15314l) && b(jVar.f15315m)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 > 0 || i12 > 0) {
            this.f20212a = i11;
            this.f20213b = i12;
            return true;
        }
        return false;
    }
}
