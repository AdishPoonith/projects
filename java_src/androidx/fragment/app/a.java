package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends w implements n.InterfaceC0037n {

    /* renamed from: t  reason: collision with root package name */
    final n f2149t;

    /* renamed from: u  reason: collision with root package name */
    boolean f2150u;

    /* renamed from: v  reason: collision with root package name */
    int f2151v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(n nVar) {
        super(nVar.r0(), nVar.u0() != null ? nVar.u0().g().getClassLoader() : null);
        this.f2151v = -1;
        this.f2149t = nVar;
    }

    private static boolean w(w.a aVar) {
        Fragment fragment = aVar.f2406b;
        return (fragment == null || !fragment.f2105u || fragment.Q == null || fragment.J || fragment.I || !fragment.b0()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2388c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f2388c.get(size);
            int i10 = aVar.f2405a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2406b;
                            break;
                        case 10:
                            aVar.f2412h = aVar.f2411g;
                            break;
                    }
                }
                arrayList.add(aVar.f2406b);
            }
            arrayList.remove(aVar.f2406b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.InterfaceC0037n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2394i) {
            this.f2149t.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.w
    public int f() {
        return n(false);
    }

    @Override // androidx.fragment.app.w
    public int g() {
        return n(true);
    }

    @Override // androidx.fragment.app.w
    public void h() {
        i();
        this.f2149t.c0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.w
    public void j(int i10, Fragment fragment, String str, int i11) {
        super.j(i10, fragment, str, i11);
        fragment.B = this.f2149t;
    }

    @Override // androidx.fragment.app.w
    public w k(Fragment fragment) {
        n nVar = fragment.B;
        if (nVar == null || nVar == this.f2149t) {
            return super.k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i10) {
        w.a aVar;
        if (this.f2394i) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2388c.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f2388c.get(i11).f2406b;
                if (fragment != null) {
                    fragment.A += i10;
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2406b + " to " + aVar.f2406b.A);
                    }
                }
            }
        }
    }

    int n(boolean z10) {
        if (this.f2150u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
            o("  ", printWriter);
            printWriter.close();
        }
        this.f2150u = true;
        this.f2151v = this.f2394i ? this.f2149t.j() : -1;
        this.f2149t.Z(this, z10);
        return this.f2151v;
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2396k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2151v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2150u);
            if (this.f2393h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2393h));
            }
            if (this.f2389d != 0 || this.f2390e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2389d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2390e));
            }
            if (this.f2391f != 0 || this.f2392g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2391f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2392g));
            }
            if (this.f2397l != 0 || this.f2398m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2397l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2398m);
            }
            if (this.f2399n != 0 || this.f2400o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2399n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2400o);
            }
        }
        if (this.f2388c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2388c.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.a aVar = this.f2388c.get(i10);
            switch (aVar.f2405a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2405a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2406b);
            if (z10) {
                if (aVar.f2407c != 0 || aVar.f2408d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2407c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2408d));
                }
                if (aVar.f2409e != 0 || aVar.f2410f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2409e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2410f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        int size = this.f2388c.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.a aVar = this.f2388c.get(i10);
            Fragment fragment = aVar.f2406b;
            if (fragment != null) {
                fragment.B1(this.f2393h);
                fragment.F1(this.f2401p, this.f2402q);
            }
            switch (aVar.f2405a) {
                case 1:
                    fragment.A1(aVar.f2407c);
                    this.f2149t.h1(fragment, false);
                    this.f2149t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2405a);
                case 3:
                    fragment.A1(aVar.f2408d);
                    this.f2149t.Z0(fragment);
                    break;
                case 4:
                    fragment.A1(aVar.f2408d);
                    this.f2149t.D0(fragment);
                    break;
                case 5:
                    fragment.A1(aVar.f2407c);
                    this.f2149t.h1(fragment, false);
                    this.f2149t.l1(fragment);
                    break;
                case 6:
                    fragment.A1(aVar.f2408d);
                    this.f2149t.y(fragment);
                    break;
                case 7:
                    fragment.A1(aVar.f2407c);
                    this.f2149t.h1(fragment, false);
                    this.f2149t.l(fragment);
                    break;
                case 8:
                    this.f2149t.j1(fragment);
                    break;
                case 9:
                    this.f2149t.j1(null);
                    break;
                case 10:
                    this.f2149t.i1(fragment, aVar.f2412h);
                    break;
            }
            if (!this.f2403r && aVar.f2405a != 1 && fragment != null && !n.P) {
                this.f2149t.N0(fragment);
            }
        }
        if (this.f2403r || n.P) {
            return;
        }
        n nVar = this.f2149t;
        nVar.O0(nVar.f2313q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        for (int size = this.f2388c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f2388c.get(size);
            Fragment fragment = aVar.f2406b;
            if (fragment != null) {
                fragment.B1(n.e1(this.f2393h));
                fragment.F1(this.f2402q, this.f2401p);
            }
            switch (aVar.f2405a) {
                case 1:
                    fragment.A1(aVar.f2410f);
                    this.f2149t.h1(fragment, true);
                    this.f2149t.Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2405a);
                case 3:
                    fragment.A1(aVar.f2409e);
                    this.f2149t.g(fragment);
                    break;
                case 4:
                    fragment.A1(aVar.f2409e);
                    this.f2149t.l1(fragment);
                    break;
                case 5:
                    fragment.A1(aVar.f2410f);
                    this.f2149t.h1(fragment, true);
                    this.f2149t.D0(fragment);
                    break;
                case 6:
                    fragment.A1(aVar.f2409e);
                    this.f2149t.l(fragment);
                    break;
                case 7:
                    fragment.A1(aVar.f2410f);
                    this.f2149t.h1(fragment, true);
                    this.f2149t.y(fragment);
                    break;
                case 8:
                    this.f2149t.j1(null);
                    break;
                case 9:
                    this.f2149t.j1(fragment);
                    break;
                case 10:
                    this.f2149t.i1(fragment, aVar.f2411g);
                    break;
            }
            if (!this.f2403r && aVar.f2405a != 3 && fragment != null && !n.P) {
                this.f2149t.N0(fragment);
            }
        }
        if (this.f2403r || !z10 || n.P) {
            return;
        }
        n nVar = this.f2149t;
        nVar.O0(nVar.f2313q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment s(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f2388c.size()) {
            w.a aVar = this.f2388c.get(i10);
            int i11 = aVar.f2405a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f2406b;
                    int i12 = fragment3.G;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.G == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2388c.add(i10, new w.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                w.a aVar2 = new w.a(3, fragment4);
                                aVar2.f2407c = aVar.f2407c;
                                aVar2.f2409e = aVar.f2409e;
                                aVar2.f2408d = aVar.f2408d;
                                aVar2.f2410f = aVar.f2410f;
                                this.f2388c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f2388c.remove(i10);
                        i10--;
                    } else {
                        aVar.f2405a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f2406b);
                    Fragment fragment5 = aVar.f2406b;
                    if (fragment5 == fragment2) {
                        this.f2388c.add(i10, new w.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f2388c.add(i10, new w.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f2406b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f2406b);
            i10++;
        }
        return fragment2;
    }

    public String t() {
        return this.f2396k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2151v >= 0) {
            sb.append(" #");
            sb.append(this.f2151v);
        }
        if (this.f2396k != null) {
            sb.append(" ");
            sb.append(this.f2396k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i10) {
        int size = this.f2388c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f2388c.get(i11).f2406b;
            int i12 = fragment != null ? fragment.G : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f2388c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f2388c.get(i13).f2406b;
            int i14 = fragment != null ? fragment.G : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f2388c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f2388c.get(i16).f2406b;
                        if ((fragment2 != null ? fragment2.G : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        for (int i10 = 0; i10 < this.f2388c.size(); i10++) {
            if (w(this.f2388c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.f2404s != null) {
            for (int i10 = 0; i10 < this.f2404s.size(); i10++) {
                this.f2404s.get(i10).run();
            }
            this.f2404s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(Fragment.k kVar) {
        for (int i10 = 0; i10 < this.f2388c.size(); i10++) {
            w.a aVar = this.f2388c.get(i10);
            if (w(aVar)) {
                aVar.f2406b.C1(kVar);
            }
        }
    }
}
