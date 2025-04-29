package i3;

import android.text.Layout;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import d3.g;
import d3.h;
import i3.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.n0;
import p3.r;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f9672t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f9673o;

    /* renamed from: p  reason: collision with root package name */
    private final b f9674p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, c> f9675q;

    /* renamed from: r  reason: collision with root package name */
    private float f9676r;

    /* renamed from: s  reason: collision with root package name */
    private float f9677s;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f9676r = -3.4028235E38f;
        this.f9677s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f9673o = false;
            this.f9674p = null;
            return;
        }
        this.f9673o = true;
        String D = n0.D(list.get(0));
        p3.a.a(D.startsWith("Format:"));
        this.f9674p = (b) p3.a.e(b.a(D));
        I(new a0(list.get(1)), b5.d.f2950c);
    }

    private static int C(long j10, List<Long> list, List<List<d3.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float D(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static d3.b E(java.lang.String r8, i3.c r9, i3.c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.E(java.lang.String, i3.c, i3.c$b, float, float):d3.b");
    }

    private Charset F(a0 a0Var) {
        Charset O = a0Var.O();
        return O != null ? O : b5.d.f2950c;
    }

    private void G(String str, b bVar, List<List<d3.b>> list, List<Long> list2) {
        int i10;
        StringBuilder sb;
        p3.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f9682e);
        if (split.length != bVar.f9682e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long L = L(split[bVar.f9678a]);
            if (L == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long L2 = L(split[bVar.f9679b]);
                if (L2 != -9223372036854775807L) {
                    Map<String, c> map = this.f9675q;
                    c cVar = (map == null || (i10 = bVar.f9680c) == -1) ? null : map.get(split[i10].trim());
                    String str2 = split[bVar.f9681d];
                    d3.b E = E(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f9676r, this.f9677s);
                    int C = C(L2, list2, list);
                    for (int C2 = C(L, list2, list); C2 < C; C2++) {
                        list.get(C2).add(E);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        r.i("SsaDecoder", sb.toString());
    }

    private void H(a0 a0Var, List<List<d3.b>> list, List<Long> list2, Charset charset) {
        b bVar = this.f9673o ? this.f9674p : null;
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null) {
                return;
            }
            if (s10.startsWith("Format:")) {
                bVar = b.a(s10);
            } else if (s10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    r.i("SsaDecoder", "Skipping dialogue line before complete format: " + s10);
                } else {
                    G(s10, bVar, list, list2);
                }
            }
        }
    }

    private void I(a0 a0Var, Charset charset) {
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(s10)) {
                J(a0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(s10)) {
                this.f9675q = K(a0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(s10)) {
                r.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(s10)) {
                return;
            }
        }
    }

    private void J(a0 a0Var, Charset charset) {
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null) {
                return;
            }
            if (a0Var.a() != 0 && a0Var.h(charset) == '[') {
                return;
            }
            String[] split = s10.split(":");
            if (split.length == 2) {
                String e10 = b5.b.e(split[0].trim());
                e10.hashCode();
                if (e10.equals("playresx")) {
                    this.f9676r = Float.parseFloat(split[1].trim());
                } else if (e10.equals("playresy")) {
                    try {
                        this.f9677s = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> K(a0 a0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null || (a0Var.a() != 0 && a0Var.h(charset) == '[')) {
                break;
            } else if (s10.startsWith("Format:")) {
                aVar = c.a.a(s10);
            } else if (s10.startsWith("Style:")) {
                if (aVar == null) {
                    r.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + s10);
                } else {
                    c b10 = c.b(s10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f9683a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long L(String str) {
        Matcher matcher = f9672t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) n0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) n0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) n0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) n0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int M(int i10) {
        switch (i10) {
            case IntegrityErrorCode.API_NOT_AVAILABLE /* -1 */:
                return Integer.MIN_VALUE;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int N(int i10) {
        switch (i10) {
            case IntegrityErrorCode.API_NOT_AVAILABLE /* -1 */:
                return Integer.MIN_VALUE;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment O(int i10) {
        switch (i10) {
            case IntegrityErrorCode.API_NOT_AVAILABLE /* -1 */:
                return null;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        Charset F = F(a0Var);
        if (!this.f9673o) {
            I(a0Var, F);
        }
        H(a0Var, arrayList, arrayList2, F);
        return new d(arrayList, arrayList2);
    }
}
