package i7;

import java.util.Map;
import p7.j;
import p7.k;
import p7.l;
import p7.o;
import p7.s;
/* loaded from: classes.dex */
public final class e implements g {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9787a;

        static {
            int[] iArr = new int[i7.a.values().length];
            f9787a = iArr;
            try {
                iArr[i7.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9787a[i7.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9787a[i7.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9787a[i7.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9787a[i7.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9787a[i7.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9787a[i7.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9787a[i7.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9787a[i7.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9787a[i7.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9787a[i7.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9787a[i7.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9787a[i7.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // i7.g
    public l7.b a(String str, i7.a aVar, int i10, int i11, Map<c, ?> map) {
        g kVar;
        switch (a.f9787a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new s7.a();
                break;
            case 6:
                kVar = new p7.f();
                break;
            case 7:
                kVar = new p7.h();
                break;
            case 8:
                kVar = new p7.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new q7.a();
                break;
            case 11:
                kVar = new p7.b();
                break;
            case 12:
                kVar = new n7.a();
                break;
            case 13:
                kVar = new j7.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return kVar.a(str, aVar, i10, i11, map);
    }
}
