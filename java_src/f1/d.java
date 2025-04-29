package f1;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class d implements p0.n {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8394b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, a> f8395c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, a> f8396a = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, Intent intent);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final synchronized a b(int i10) {
            return (a) d.f8395c.get(Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(int i10, int i11, Intent intent) {
            a b10 = b(i10);
            if (b10 == null) {
                return false;
            }
            return b10.a(i11, intent);
        }

        public final synchronized void c(int i10, a callback) {
            kotlin.jvm.internal.l.e(callback, "callback");
            if (d.f8395c.containsKey(Integer.valueOf(i10))) {
                return;
            }
            d.f8395c.put(Integer.valueOf(i10), callback);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f8413j;

        c(int i10) {
            this.f8413j = i10;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int g() {
            p0.f0 f0Var = p0.f0.f14852a;
            return p0.f0.q() + this.f8413j;
        }
    }

    @Override // p0.n
    public boolean b(int i10, int i11, Intent intent) {
        a aVar = this.f8396a.get(Integer.valueOf(i10));
        return aVar == null ? f8394b.d(i10, i11, intent) : aVar.a(i11, intent);
    }

    public final void c(int i10, a callback) {
        kotlin.jvm.internal.l.e(callback, "callback");
        this.f8396a.put(Integer.valueOf(i10), callback);
    }
}
