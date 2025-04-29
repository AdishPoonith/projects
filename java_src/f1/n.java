package f1;

import android.content.Context;
import f1.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f8481a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<b, String[]> f8482b = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* loaded from: classes.dex */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432);
        

        /* renamed from: k  reason: collision with root package name */
        public static final a f8483k = new a(null);

        /* renamed from: j  reason: collision with root package name */
        private final int f8499j;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final b a(int i10) {
                b[] valuesCustom = b.valuesCustom();
                int length = valuesCustom.length;
                int i11 = 0;
                while (i11 < length) {
                    b bVar = valuesCustom[i11];
                    i11++;
                    if (bVar.f8499j == i10) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        /* renamed from: f1.n$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0140b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f8500a;

            static {
                int[] iArr = new int[b.valuesCustom().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ModelRequest.ordinal()] = 16;
                iArr[b.EventDeactivation.ordinal()] = 17;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 18;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                iArr[b.IapLogging.ordinal()] = 20;
                iArr[b.IapLoggingLib2.ordinal()] = 21;
                iArr[b.Monitoring.ordinal()] = 22;
                iArr[b.Megatron.ordinal()] = 23;
                iArr[b.Elora.ordinal()] = 24;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 25;
                iArr[b.Login.ordinal()] = 26;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 27;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 28;
                iArr[b.BypassAppSwitch.ordinal()] = 29;
                iArr[b.Share.ordinal()] = 30;
                f8500a = iArr;
            }
        }

        b(int i10) {
            this.f8499j = i10;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final b h() {
            a aVar;
            int i10;
            int i11;
            int i12 = this.f8499j;
            if ((i12 & 255) > 0) {
                aVar = f8483k;
                i11 = i12 & (-256);
            } else {
                if ((65280 & i12) > 0) {
                    aVar = f8483k;
                    i10 = -65536;
                } else if ((16711680 & i12) <= 0) {
                    return f8483k.a(0);
                } else {
                    aVar = f8483k;
                    i10 = -16777216;
                }
                i11 = i12 & i10;
            }
            return aVar.a(i11);
        }

        public final String i() {
            return kotlin.jvm.internal.l.k("FBSDKFeature", this);
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (C0140b.f8500a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ModelRequest";
                case 17:
                    return "EventDeactivation";
                case 18:
                    return "OnDeviceEventProcessing";
                case 19:
                    return "OnDevicePostInstallEventProcessing";
                case 20:
                    return "IAPLogging";
                case 21:
                    return "IAPLoggingLib2";
                case 22:
                    return "Monitoring";
                case f.j.f8330t3 /* 23 */:
                    return "Megatron";
                case f.j.f8335u3 /* 24 */:
                    return "Elora";
                case 25:
                    return "ServiceUpdateCompliance";
                case 26:
                    return "LoginKit";
                case 27:
                    return "ChromeCustomTabsPrefetching";
                case 28:
                    return "IgnoreAppSwitchToLoggedOut";
                case f.j.f8360z3 /* 29 */:
                    return "BypassAppSwitch";
                case 30:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8501a;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 19;
            iArr[b.Monitoring.ordinal()] = 20;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 21;
            iArr[b.BypassAppSwitch.ordinal()] = 22;
            f8501a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements q.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f8503b;

        d(a aVar, b bVar) {
            this.f8502a = aVar;
            this.f8503b = bVar;
        }

        @Override // f1.q.a
        public void a() {
            a aVar = this.f8502a;
            n nVar = n.f8481a;
            aVar.a(n.g(this.f8503b));
        }
    }

    private n() {
    }

    public static final void a(b feature, a callback) {
        kotlin.jvm.internal.l.e(feature, "feature");
        kotlin.jvm.internal.l.e(callback, "callback");
        q qVar = q.f8511a;
        q.h(new d(callback, feature));
    }

    private final boolean b(b bVar) {
        switch (c.f8501a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                return true;
        }
    }

    public static final void c(b feature) {
        kotlin.jvm.internal.l.e(feature, "feature");
        p0.f0 f0Var = p0.f0.f14852a;
        p0.f0.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.i(), p0.f0.B()).apply();
    }

    public static final b d(String className) {
        boolean t10;
        kotlin.jvm.internal.l.e(className, "className");
        f8481a.f();
        for (Map.Entry<b, String[]> entry : f8482b.entrySet()) {
            b key = entry.getKey();
            String[] value = entry.getValue();
            int length = value.length;
            int i10 = 0;
            while (i10 < length) {
                String str = value[i10];
                i10++;
                t10 = ka.p.t(className, str, false, 2, null);
                if (t10) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        boolean b10 = b(bVar);
        q qVar = q.f8511a;
        String i10 = bVar.i();
        p0.f0 f0Var = p0.f0.f14852a;
        return q.d(i10, p0.f0.m(), b10);
    }

    private final synchronized void f() {
        Map<b, String[]> map = f8482b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    public static final boolean g(b feature) {
        kotlin.jvm.internal.l.e(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        p0.f0 f0Var = p0.f0.f14852a;
        Context l10 = p0.f0.l();
        n nVar = f8481a;
        String string = l10.getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.i(), null);
        if (string == null || !kotlin.jvm.internal.l.a(string, p0.f0.B())) {
            b h10 = feature.h();
            return h10 == feature ? nVar.e(feature) : g(h10) && nVar.e(feature);
        }
        return false;
    }
}
