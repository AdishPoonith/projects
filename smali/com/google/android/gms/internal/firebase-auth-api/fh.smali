.class public final Lcom/google/android/gms/internal/firebase-auth-api/fh;
.super Lcom/google/android/gms/internal/firebase-auth-api/lk;
.source "SourceFile"


# static fields
.field private static final e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/fh;->e:[B

    return-void
.end method

.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/dh;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/y9;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/dh;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/fq;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/lk;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method

.method static bridge synthetic l()[B
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/fh;->e:[B

    return-object v0
.end method

.method static bridge synthetic m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;
    .locals 4

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/fj;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->C()Lcom/google/android/gms/internal/firebase-auth-api/xp;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->C()Lcom/google/android/gms/internal/firebase-auth-api/kq;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/kq;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/kq;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    const/4 v1, 0x0

    invoke-static {p4, v1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/kq;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/firebase-auth-api/lq;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->c()[B

    move-result-object v2

    array-length v3, v2

    invoke-static {v2, v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->d()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/ct;->o:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    goto :goto_0

    :cond_1
    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/ct;->m:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    goto :goto_0

    :cond_2
    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    :goto_0
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vp;->C()Lcom/google/android/gms/internal/firebase-auth-api/up;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/up;->r(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/up;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/vp;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bq;->D()Lcom/google/android/gms/internal/firebase-auth-api/aq;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/aq;->s(Lcom/google/android/gms/internal/firebase-auth-api/lq;)Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/aq;->r(Lcom/google/android/gms/internal/firebase-auth-api/vp;)Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/aq;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/bq;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/xp;->r(Lcom/google/android/gms/internal/firebase-auth-api/bq;)Lcom/google/android/gms/internal/firebase-auth-api/xp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yp;

    invoke-direct {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/fj;-><init>(Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/yp;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/eh;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/eh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/fh;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fq;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/fq;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fq;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fq;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fq;->G()Lcom/google/android/gms/internal/firebase-auth-api/iq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/iq;->D()Lcom/google/android/gms/internal/firebase-auth-api/bq;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/oh;->a(Lcom/google/android/gms/internal/firebase-auth-api/bq;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ECIES private key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fq;->G()Lcom/google/android/gms/internal/firebase-auth-api/iq;

    move-result-object p1

    return-object p1
.end method
