.class public final Lcom/google/android/gms/internal/firebase-auth-api/lb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final e:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final f:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final g:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final h:Lcom/google/android/gms/internal/firebase-auth-api/as;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lb;->b(I)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/lb;->a:Lcom/google/android/gms/internal/firebase-auth-api/as;

    const/16 v1, 0x20

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lb;->b(I)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/lb;->b:Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-static {v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/lb;->a(II)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/lb;->c:Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/lb;->a(II)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/lb;->d:Lcom/google/android/gms/internal/firebase-auth-api/as;

    const/4 v2, 0x5

    invoke-static {v0, v0, v1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/lb;->c(IIIII)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v3

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/lb;->e:Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-static {v1, v0, v1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/lb;->c(IIIII)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lb;->f:Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/qe;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/qe;-><init>()V

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/as;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lb;->g:Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/jf;

    invoke-direct {v2}, Lcom/google/android/gms/internal/firebase-auth-api/jf;-><init>()V

    const-string v2, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/as;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lb;->h:Lcom/google/android/gms/internal/firebase-auth-api/as;

    return-void
.end method

.method public static a(II)Lcom/google/android/gms/internal/firebase-auth-api/as;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/oo;->D()Lcom/google/android/gms/internal/firebase-auth-api/no;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/no;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/no;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ro;->D()Lcom/google/android/gms/internal/firebase-auth-api/qo;

    move-result-object p0

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/qo;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/qo;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/ro;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/no;->s(Lcom/google/android/gms/internal/firebase-auth-api/ro;)Lcom/google/android/gms/internal/firebase-auth-api/no;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/oo;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v3;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/tc;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/tc;-><init>()V

    const-string p0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/as;

    return-object p0
.end method

.method public static b(I)Lcom/google/android/gms/internal/firebase-auth-api/as;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xo;->D()Lcom/google/android/gms/internal/firebase-auth-api/wo;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wo;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xo;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v3;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/kd;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/kd;-><init>()V

    const-string p0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/as;

    return-object p0
.end method

.method public static c(IIIII)Lcom/google/android/gms/internal/firebase-auth-api/as;
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->D()Lcom/google/android/gms/internal/firebase-auth-api/eo;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/io;->D()Lcom/google/android/gms/internal/firebase-auth-api/ho;

    move-result-object p2

    const/16 p4, 0x10

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/ho;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ho;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/io;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/eo;->s(Lcom/google/android/gms/internal/firebase-auth-api/io;)Lcom/google/android/gms/internal/firebase-auth-api/eo;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/eo;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/eo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/fo;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yq;->D()Lcom/google/android/gms/internal/firebase-auth-api/xq;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/br;->D()Lcom/google/android/gms/internal/firebase-auth-api/ar;

    move-result-object p2

    const/4 p4, 0x5

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/ar;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/ar;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ar;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ar;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/br;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/xq;->s(Lcom/google/android/gms/internal/firebase-auth-api/br;)Lcom/google/android/gms/internal/firebase-auth-api/xq;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/xq;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/xq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yq;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->C()Lcom/google/android/gms/internal/firebase-auth-api/xn;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->r(Lcom/google/android/gms/internal/firebase-auth-api/fo;)Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->s(Lcom/google/android/gms/internal/firebase-auth-api/yq;)Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/yn;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v3;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/xb;-><init>()V

    const-string p0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/as;

    return-object p0
.end method
