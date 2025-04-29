package c4;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Account f3275a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f3276b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f3277c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f3278d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3279e;

    /* renamed from: f  reason: collision with root package name */
    private final View f3280f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3281g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3282h;

    /* renamed from: i  reason: collision with root package name */
    private final y4.a f3283i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f3284j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f3285a;

        /* renamed from: b  reason: collision with root package name */
        private s.b f3286b;

        /* renamed from: c  reason: collision with root package name */
        private String f3287c;

        /* renamed from: d  reason: collision with root package name */
        private String f3288d;

        /* renamed from: e  reason: collision with root package name */
        private y4.a f3289e = y4.a.f20477s;

        public e a() {
            return new e(this.f3285a, this.f3286b, null, 0, null, this.f3287c, this.f3288d, this.f3289e, false);
        }

        public a b(String str) {
            this.f3287c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f3286b == null) {
                this.f3286b = new s.b();
            }
            this.f3286b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f3285a = account;
            return this;
        }

        public final a e(String str) {
            this.f3288d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i10, View view, String str, String str2, y4.a aVar, boolean z10) {
        this.f3275a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f3276b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f3278d = map;
        this.f3280f = view;
        this.f3279e = i10;
        this.f3281g = str;
        this.f3282h = str2;
        this.f3283i = aVar == null ? y4.a.f20477s : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (e0 e0Var : map.values()) {
            hashSet.addAll(e0Var.f3290a);
        }
        this.f3277c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f3275a;
    }

    @Deprecated
    public String b() {
        Account account = this.f3275a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f3275a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> d() {
        return this.f3277c;
    }

    public Set<Scope> e(com.google.android.gms.common.api.a<?> aVar) {
        e0 e0Var = (e0) this.f3278d.get(aVar);
        if (e0Var == null || e0Var.f3290a.isEmpty()) {
            return this.f3276b;
        }
        HashSet hashSet = new HashSet(this.f3276b);
        hashSet.addAll(e0Var.f3290a);
        return hashSet;
    }

    public String f() {
        return this.f3281g;
    }

    public Set<Scope> g() {
        return this.f3276b;
    }

    public final y4.a h() {
        return this.f3283i;
    }

    public final Integer i() {
        return this.f3284j;
    }

    public final String j() {
        return this.f3282h;
    }

    public final void k(Integer num) {
        this.f3284j = num;
    }
}
