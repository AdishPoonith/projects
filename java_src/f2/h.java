package f2;

import k2.a;
import p3.a0;
import s1.n1;
import x1.x;
/* loaded from: classes.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f8692a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static p2.e a(int i10, a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385) {
            a0Var.U(8);
            String B = a0Var.B(p10 - 16);
            return new p2.e("und", B, B);
        }
        p3.r.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    private static p2.a b(a0 a0Var) {
        String str;
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385) {
            int b10 = a.b(a0Var.p());
            String str2 = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str2 != null) {
                a0Var.U(4);
                int i10 = p10 - 16;
                byte[] bArr = new byte[i10];
                a0Var.l(bArr, 0, i10);
                return new p2.a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + b10;
        } else {
            str = "Failed to parse cover art attribute";
        }
        p3.r.i("MetadataUtil", str);
        return null;
    }

    public static a.b c(a0 a0Var) {
        int f10 = a0Var.f() + a0Var.p();
        int p10 = a0Var.p();
        int i10 = (p10 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & p10;
                if (i11 == 6516084) {
                    return a(p10, a0Var);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return h(p10, "TIT2", a0Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return h(p10, "TCOM", a0Var);
                }
                if (i11 == 6578553) {
                    return h(p10, "TDRC", a0Var);
                }
                if (i11 == 4280916) {
                    return h(p10, "TPE1", a0Var);
                }
                if (i11 == 7630703) {
                    return h(p10, "TSSE", a0Var);
                }
                if (i11 == 6384738) {
                    return h(p10, "TALB", a0Var);
                }
                if (i11 == 7108978) {
                    return h(p10, "USLT", a0Var);
                }
                if (i11 == 6776174) {
                    return h(p10, "TCON", a0Var);
                }
                if (i11 == 6779504) {
                    return h(p10, "TIT1", a0Var);
                }
            } else if (p10 == 1735291493) {
                return g(a0Var);
            } else {
                if (p10 == 1684632427) {
                    return d(p10, "TPOS", a0Var);
                }
                if (p10 == 1953655662) {
                    return d(p10, "TRCK", a0Var);
                }
                if (p10 == 1953329263) {
                    return i(p10, "TBPM", a0Var, true, false);
                }
                if (p10 == 1668311404) {
                    return i(p10, "TCMP", a0Var, true, true);
                }
                if (p10 == 1668249202) {
                    return b(a0Var);
                }
                if (p10 == 1631670868) {
                    return h(p10, "TPE2", a0Var);
                }
                if (p10 == 1936682605) {
                    return h(p10, "TSOT", a0Var);
                }
                if (p10 == 1936679276) {
                    return h(p10, "TSO2", a0Var);
                }
                if (p10 == 1936679282) {
                    return h(p10, "TSOA", a0Var);
                }
                if (p10 == 1936679265) {
                    return h(p10, "TSOP", a0Var);
                }
                if (p10 == 1936679791) {
                    return h(p10, "TSOC", a0Var);
                }
                if (p10 == 1920233063) {
                    return i(p10, "ITUNESADVISORY", a0Var, false, false);
                }
                if (p10 == 1885823344) {
                    return i(p10, "ITUNESGAPLESS", a0Var, false, true);
                }
                if (p10 == 1936683886) {
                    return h(p10, "TVSHOWSORT", a0Var);
                }
                if (p10 == 1953919848) {
                    return h(p10, "TVSHOW", a0Var);
                }
                if (p10 == 757935405) {
                    return e(a0Var, f10);
                }
            }
            p3.r.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(p10));
            return null;
        } finally {
            a0Var.T(f10);
        }
    }

    private static p2.m d(int i10, String str, a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385 && p10 >= 22) {
            a0Var.U(10);
            int M = a0Var.M();
            if (M > 0) {
                String str2 = "" + M;
                int M2 = a0Var.M();
                if (M2 > 0) {
                    str2 = str2 + "/" + M2;
                }
                return new p2.m(str, null, com.google.common.collect.q.A(str2));
            }
        }
        p3.r.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    private static p2.i e(a0 a0Var, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (a0Var.f() < i10) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            a0Var.U(4);
            if (p11 == 1835360622) {
                str = a0Var.B(p10 - 12);
            } else if (p11 == 1851878757) {
                str2 = a0Var.B(p10 - 12);
            } else {
                if (p11 == 1684108385) {
                    i11 = f10;
                    i12 = p10;
                }
                a0Var.U(p10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        a0Var.T(i11);
        a0Var.U(16);
        return new p2.j(str, str2, a0Var.B(i12 - 16));
    }

    public static q2.a f(a0 a0Var, int i10, String str) {
        while (true) {
            int f10 = a0Var.f();
            if (f10 >= i10) {
                return null;
            }
            int p10 = a0Var.p();
            if (a0Var.p() == 1684108385) {
                int p11 = a0Var.p();
                int p12 = a0Var.p();
                int i11 = p10 - 16;
                byte[] bArr = new byte[i11];
                a0Var.l(bArr, 0, i11);
                return new q2.a(str, bArr, p12, p11);
            }
            a0Var.T(f10 + p10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p2.m g(p3.a0 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = f2.h.f8692a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            p2.m r1 = new p2.m
            com.google.common.collect.q r3 = com.google.common.collect.q.A(r3)
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p3.r.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.g(p3.a0):p2.m");
    }

    private static p2.m h(int i10, String str, a0 a0Var) {
        int p10 = a0Var.p();
        if (a0Var.p() == 1684108385) {
            a0Var.U(8);
            return new p2.m(str, null, com.google.common.collect.q.A(a0Var.B(p10 - 16)));
        }
        p3.r.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    private static p2.i i(int i10, String str, a0 a0Var, boolean z10, boolean z11) {
        int j10 = j(a0Var);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 >= 0) {
            return z10 ? new p2.m(str, null, com.google.common.collect.q.A(Integer.toString(j10))) : new p2.e("und", str, Integer.toString(j10));
        }
        p3.r.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    private static int j(a0 a0Var) {
        a0Var.U(4);
        if (a0Var.p() == 1684108385) {
            a0Var.U(8);
            return a0Var.G();
        }
        p3.r.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, x xVar, n1.b bVar) {
        if (i10 == 1 && xVar.a()) {
            bVar.P(xVar.f20212a).Q(xVar.f20213b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r6 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(int r5, k2.a r6, k2.a r7, s1.n1.b r8, k2.a... r9) {
        /*
            k2.a r0 = new k2.a
            r1 = 0
            k2.a$b[] r2 = new k2.a.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = 0
        L14:
            int r6 = r7.e()
            if (r5 >= r6) goto L3c
            k2.a$b r6 = r7.d(r5)
            boolean r3 = r6 instanceof q2.a
            if (r3 == 0) goto L39
            q2.a r6 = (q2.a) r6
            java.lang.String r3 = r6.f15998j
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            k2.a r5 = new k2.a
            k2.a$b[] r7 = new k2.a.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            k2.a r6 = r6.b(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.e()
            if (r5 <= 0) goto L52
            r8.Z(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.l(int, k2.a, k2.a, s1.n1$b, k2.a[]):void");
    }
}
